// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodParser.g4 by ANTLR 4.13.1
package com.oh.protect.smalimethod;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmaliMethodParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmaliMethodParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SmaliMethodParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodIdentifier(SmaliMethodParser.MethodIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(SmaliMethodParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodInSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInSignature(SmaliMethodParser.MethodInSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodOutSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodOutSignature(SmaliMethodParser.MethodOutSignatureContext ctx);
}