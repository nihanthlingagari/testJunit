// Generated from Rule.g4 by ANTLR 4.4
package com.fmr.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull RuleParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull RuleParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull RuleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull RuleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#subcondition}.
	 * @param ctx the parse tree
	 */
	void enterSubcondition(@NotNull RuleParser.SubconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#subcondition}.
	 * @param ctx the parse tree
	 */
	void exitSubcondition(@NotNull RuleParser.SubconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#ruleSentence}.
	 * @param ctx the parse tree
	 */
	void enterRuleSentence(@NotNull RuleParser.RuleSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#ruleSentence}.
	 * @param ctx the parse tree
	 */
	void exitRuleSentence(@NotNull RuleParser.RuleSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull RuleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull RuleParser.ValueContext ctx);
}