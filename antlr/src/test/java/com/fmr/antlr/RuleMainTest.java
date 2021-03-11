package com.fmr.antlr;

import org.junit.Assert;
import org.junit.Test;

public class RuleMainTest {
	
	private RuleMain ruleMain = new RuleMain();
	
	@Test
	public void testCheckConditionWithDivisionCBA() throws Exception {
		ruleMain.executeRule("IF {DIVISION == CBA} THEN DISALLOW");
		Assert.assertNotNull(ruleMain.getListener().getErrors());
		Assert.assertNotNull(ruleMain.getListener().getErrors().get(0));
		Assert.assertEquals(ruleMain.getListener().getErrors().get(0), "Rule is Invalid with subcondition :DIVISION, value : CBA");
	}
	
	@Test
	public void testCheckConditionWithDivisionABC() throws Exception {
		ruleMain.executeRule("IF {DIVISION == ABC} THEN DISALLOW");
		Assert.assertTrue(ruleMain.getListener().getErrors().isEmpty());
	}
	
	@Test
	public void testCheckConditionWithParIsSUPER() throws Exception {
		ruleMain.executeRule("IF {PAR == SUPER} THEN DISALLOW");
		Assert.assertTrue(ruleMain.getListener().getErrors().isEmpty());
	}
	
}
