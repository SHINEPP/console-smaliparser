// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali.smali;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmaliParser}.
 */
public interface SmaliParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmaliParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SmaliParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SmaliParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(SmaliParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(SmaliParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#super}.
	 * @param ctx the parse tree
	 */
	void enterSuper(SmaliParser.SuperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#super}.
	 * @param ctx the parse tree
	 */
	void exitSuper(SmaliParser.SuperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(SmaliParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(SmaliParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#implements}.
	 * @param ctx the parse tree
	 */
	void enterImplements(SmaliParser.ImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#implements}.
	 * @param ctx the parse tree
	 */
	void exitImplements(SmaliParser.ImplementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SmaliParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SmaliParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SmaliParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SmaliParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SmaliParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SmaliParser.MethodContext ctx);
}