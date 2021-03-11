// Generated from HelloWord.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWordParser}.
 */
public interface HelloWordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWordParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull HelloWordParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWordParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull HelloWordParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWordParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HelloWordParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWordParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HelloWordParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWordParser#ender}.
	 * @param ctx the parse tree
	 */
	void enterEnder(@NotNull HelloWordParser.EnderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWordParser#ender}.
	 * @param ctx the parse tree
	 */
	void exitEnder(@NotNull HelloWordParser.EnderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWordParser#salutation}.
	 * @param ctx the parse tree
	 */
	void enterSalutation(@NotNull HelloWordParser.SalutationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWordParser#salutation}.
	 * @param ctx the parse tree
	 */
	void exitSalutation(@NotNull HelloWordParser.SalutationContext ctx);
}