// Generated from /home/sahil/blogs/blog 2/ANTLRBlog2/src/main/antlr/ArithmaticGrammar.g4 by ANTLR 4.5.1
package com.knoldus;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmaticGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmaticGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(ArithmaticGrammarParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ArithmaticGrammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(ArithmaticGrammarParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(ArithmaticGrammarParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(ArithmaticGrammarParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ArithmaticGrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ArithmaticGrammarParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ArithmaticGrammarParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmaticGrammarParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ArithmaticGrammarParser.DivContext ctx);
}