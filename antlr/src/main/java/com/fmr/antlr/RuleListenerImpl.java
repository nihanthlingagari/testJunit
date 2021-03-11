package com.fmr.antlr;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import com.fmr.antlr.RuleParser.ConditionContext;
import com.fmr.antlr.RuleParser.ResultContext;
import com.fmr.antlr.RuleParser.SubconditionContext;
import com.fmr.antlr.RuleParser.ValueContext;

public class RuleListenerImpl extends RuleBaseListener {
	
	private String subcondition;
	private String value;
	
	private List<String> errors = new ArrayList<>();
	MultiMap<String, String> dataSource = new MultiValueMap<>();
	//Only for POC Testing purpose
	
	public RuleListenerImpl() {
		/*List<String> list = new ArrayList<>();
		this.dataSource.put("S:DIVISION F:PAR", list);
		this.dataSource.get("S:DIVISION F:PAR").add("14");
		this.dataSource.get("S:DIVISION F:PAR").add("CGCB");
		this.dataSource.get("S:DIVISION F:PAR").add("DV412");*/
		this.dataSource.put("DIVISION", "ABC");
		this.dataSource.put("DIVISION", "CGCB");
		this.dataSource.put("DIVISION", "DV412");
		this.dataSource.put("PAR", "SUPER");
		this.dataSource.put("PAR", "FINE");
		
	}
	
	@Override
	public void enterSubcondition(SubconditionContext ctx) {
		this.subcondition = ctx.getText().toString();
	}
	
	@Override
	public void enterValue(ValueContext ctx) {
		this.value = ctx.getText().toString();
	}

		
	@Override
	public void enterResult(ResultContext ctx) {
		if(validateRule(subcondition, value)) {
			//System.out.println("\n "+ctx.getText());//JUST print result DISALLOW
		} else {
			errors.add("Rule is Invalid with subcondition :" + subcondition + ", value : " + value);
		}
			
	}
	
	private boolean validateRule(String subcondition, String value) {
		Collection<String> col = (Collection<String>) this.dataSource.get(subcondition.toString());
		//System.out.println("\n =======================================================");
		//System.out.println("\n validating the given input and with the datasource: " + col.contains(value));
		return col.contains(value);
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}