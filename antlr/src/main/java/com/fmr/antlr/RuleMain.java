package com.fmr.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.fmr.antlr.RuleParser.RuleSentenceContext;

public class RuleMain {
	
	/*public static void main(String[] args) {
		RuleMain m = new RuleMain();
		
		m.executeRule("IF {DIVISION == ABC} THEN DISALLOW");
		m.executeRule("IF {DIVISION == CBA} THEN DISALLOW");
		m.executeRule("IF {PAR == SUPER} THEN DISALLOW");
		
	}*/

	private RuleListenerImpl listener;
	
	public void executeRule(String ruleSentence) {
	    // Get our lexer
	    RuleLexer lexer = new RuleLexer(new ANTLRInputStream(ruleSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    RuleParser parser = new RuleParser(tokens);
	 
	    // Specify our entry point
	    RuleSentenceContext ruleSentenceContext = parser.ruleSentence();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    listener = new RuleListenerImpl();
	    walker.walk(listener, ruleSentenceContext);
	}

	public RuleListenerImpl getListener() {
		return listener;
	}

	public void setListener(RuleListenerImpl listener) {
		this.listener = listener;
	}
}