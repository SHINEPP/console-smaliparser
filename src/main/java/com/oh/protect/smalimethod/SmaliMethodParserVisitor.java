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
	 * Visit a parse tree produced by {@link SmaliMethodParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SmaliMethodParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SmaliMethodParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodContent(SmaliMethodParser.MethodContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHead(SmaliMethodParser.MethodHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliMethodParser#methodCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCode(SmaliMethodParser.MethodCodeContext ctx);
}