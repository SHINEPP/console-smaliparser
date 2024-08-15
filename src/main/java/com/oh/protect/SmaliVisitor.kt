package com.oh.protect

import com.oh.protect.smali.SmaliParser
import com.oh.protect.smali.SmaliParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.example.com.oh.protect.SmaliData


class SmaliVisitor : SmaliParserBaseVisitor<SmaliData?>() {

    override fun visit(tree: ParseTree?): SmaliData? {
        return super.visit(tree)
    }

    override fun visitClass(ctx: SmaliParser.ClassContext?): SmaliData? {
        return super.visitClass(ctx)
    }

    override fun visitClassAccessModify(ctx: SmaliParser.ClassAccessModifyContext?): SmaliData? {
        println("visitClassAccessModify(), ${ctx?.children?.joinToString(" ") { it.text }}")
        return super.visitClassAccessModify(ctx)
    }

    override fun visitClassSignature(ctx: SmaliParser.ClassSignatureContext?): SmaliData? {
        println("visitClassSignature(), ${ctx?.text}")
        return super.visitClassSignature(ctx)
    }

    override fun visitSuper(ctx: SmaliParser.SuperContext?): SmaliData? {
        return super.visitSuper(ctx)
    }

    override fun visitSuperSignature(ctx: SmaliParser.SuperSignatureContext?): SmaliData? {
        println("visitSuperSignature(), ${ctx?.text}")
        return super.visitSuperSignature(ctx)
    }

    override fun visitSource(ctx: SmaliParser.SourceContext?): SmaliData? {
        println("visitSource(), ${ctx?.text}")
        return super.visitSource(ctx)
    }

    override fun visitImplements(ctx: SmaliParser.ImplementsContext?): SmaliData? {
        return super.visitImplements(ctx)
    }

    override fun visitImplementsSignature(ctx: SmaliParser.ImplementsSignatureContext?): SmaliData? {
        println("visitImplementsSignature(), ${ctx?.text}")
        return super.visitImplementsSignature(ctx)
    }

    override fun visitAnnotation(ctx: SmaliParser.AnnotationContext?): SmaliData? {
        println("-------------------- visitAnnotation start --------------------")
        println(ctx?.text)
        println("-------------------- visitAnnotation end ----------------------")
        println()
        return super.visitAnnotation(ctx)
    }
    
    override fun visitFieldDef(ctx: SmaliParser.FieldDefContext?): SmaliData? {
        println("visitFieldDef(), ${ctx?.text}")
        return super.visitFieldDef(ctx)
    }

    override fun visitFieldBlockStart(ctx: SmaliParser.FieldBlockStartContext?): SmaliData? {
        println("visitFieldBlockStart(), ${ctx?.text}")
        return super.visitFieldBlockStart(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): SmaliData? {
        println("-------------------- visitMethod start --------------------")
        println(ctx?.text)
        println("-------------------- visitMethod end ----------------------")
        println()
        return super.visitMethod(ctx)
    }

    override fun visitMethodHead(ctx: SmaliParser.MethodHeadContext?): SmaliData? {
        println("visitMethodHead(), ${ctx?.text}")
        return super.visitMethodHead(ctx)
    }
}