// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmaliParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmaliParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmaliParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SmaliParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(SmaliParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#super}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper(SmaliParser.SuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(SmaliParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#implements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplements(SmaliParser.ImplementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SmaliParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SmaliParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SmaliParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodContent(SmaliParser.MethodContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHead(SmaliParser.MethodHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCode(SmaliParser.MethodCodeContext ctx);
}