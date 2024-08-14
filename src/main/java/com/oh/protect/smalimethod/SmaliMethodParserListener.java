// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodParser.g4 by ANTLR 4.13.1
package com.oh.protect.smalimethod;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmaliMethodParser}.
 */
public interface SmaliMethodParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SmaliMethodParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SmaliMethodParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SmaliMethodParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SmaliMethodParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodContent}.
	 * @param ctx the parse tree
	 */
	void enterMethodContent(SmaliMethodParser.MethodContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodContent}.
	 * @param ctx the parse tree
	 */
	void exitMethodContent(SmaliMethodParser.MethodContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void enterMethodHead(SmaliMethodParser.MethodHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void exitMethodHead(SmaliMethodParser.MethodHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodCode}.
	 * @param ctx the parse tree
	 */
	void enterMethodCode(SmaliMethodParser.MethodCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodCode}.
	 * @param ctx the parse tree
	 */
	void exitMethodCode(SmaliMethodParser.MethodCodeContext ctx);
}