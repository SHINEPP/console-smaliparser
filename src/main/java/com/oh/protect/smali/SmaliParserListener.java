// Generated from /Users/zhenliangzhou/source/shine/console-smaliparser/src/main/antlr4/SmaliParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali;
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
	 * Enter a parse tree produced by {@link SmaliParser#classAccessModify}.
	 * @param ctx the parse tree
	 */
	void enterClassAccessModify(SmaliParser.ClassAccessModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#classAccessModify}.
	 * @param ctx the parse tree
	 */
	void exitClassAccessModify(SmaliParser.ClassAccessModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#classSignature}.
	 * @param ctx the parse tree
	 */
	void enterClassSignature(SmaliParser.ClassSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#classSignature}.
	 * @param ctx the parse tree
	 */
	void exitClassSignature(SmaliParser.ClassSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link SmaliParser#superSignature}.
	 * @param ctx the parse tree
	 */
	void enterSuperSignature(SmaliParser.SuperSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#superSignature}.
	 * @param ctx the parse tree
	 */
	void exitSuperSignature(SmaliParser.SuperSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link SmaliParser#implementsSignature}.
	 * @param ctx the parse tree
	 */
	void enterImplementsSignature(SmaliParser.ImplementsSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#implementsSignature}.
	 * @param ctx the parse tree
	 */
	void exitImplementsSignature(SmaliParser.ImplementsSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link SmaliParser#fieldBlockStart}.
	 * @param ctx the parse tree
	 */
	void enterFieldBlockStart(SmaliParser.FieldBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#fieldBlockStart}.
	 * @param ctx the parse tree
	 */
	void exitFieldBlockStart(SmaliParser.FieldBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#fieldDef}.
	 * @param ctx the parse tree
	 */
	void enterFieldDef(SmaliParser.FieldDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#fieldDef}.
	 * @param ctx the parse tree
	 */
	void exitFieldDef(SmaliParser.FieldDefContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SmaliParser#methodContent}.
	 * @param ctx the parse tree
	 */
	void enterMethodContent(SmaliParser.MethodContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#methodContent}.
	 * @param ctx the parse tree
	 */
	void exitMethodContent(SmaliParser.MethodContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void enterMethodHead(SmaliParser.MethodHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void exitMethodHead(SmaliParser.MethodHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmaliParser#methodCode}.
	 * @param ctx the parse tree
	 */
	void enterMethodCode(SmaliParser.MethodCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmaliParser#methodCode}.
	 * @param ctx the parse tree
	 */
	void exitMethodCode(SmaliParser.MethodCodeContext ctx);
}