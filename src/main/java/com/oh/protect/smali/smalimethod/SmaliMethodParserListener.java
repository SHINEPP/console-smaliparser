// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali.smalimethod;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmaliMethodParser}.
 */
public interface SmaliMethodParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodIdentifier(SmaliMethodParser.MethodIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodIdentifier(SmaliMethodParser.MethodIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SmaliMethodParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SmaliMethodParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodInSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodInSignature(SmaliMethodParser.MethodInSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodInSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodInSignature(SmaliMethodParser.MethodInSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliMethodParser#methodOutSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodOutSignature(SmaliMethodParser.MethodOutSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliMethodParser#methodOutSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodOutSignature(SmaliMethodParser.MethodOutSignatureContext ctx);
}