// Generated from /home/sahil/blogs/blog 2/ANTLRBlog2/src/main/antlr/ArithmaticGrammar.g4 by ANTLR 4.5.1
package com.knoldus;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmaticGrammarParser}.
 */
public interface ArithmaticGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(ArithmaticGrammarParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(ArithmaticGrammarParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ArithmaticGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ArithmaticGrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(ArithmaticGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(ArithmaticGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(ArithmaticGrammarParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(ArithmaticGrammarParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(ArithmaticGrammarParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(ArithmaticGrammarParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ArithmaticGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ArithmaticGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(ArithmaticGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(ArithmaticGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(ArithmaticGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(ArithmaticGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmaticGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ArithmaticGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmaticGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ArithmaticGrammarParser.DivContext ctx);
}