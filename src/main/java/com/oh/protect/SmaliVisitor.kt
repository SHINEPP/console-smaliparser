package com.oh.protect

import com.oh.protect.smali.SmaliParser
import com.oh.protect.smali.SmaliParserBaseVisitor

class SmaliData

class SmaliVisitor : SmaliParserBaseVisitor<SmaliData?>() {

    override fun visitClass(ctx: SmaliParser.ClassContext?): SmaliData? {
        println("visitClass(), ${ctx?.text}")
        return super.visitClass(ctx)
    }

    override fun visitSuper(ctx: SmaliParser.SuperContext?): SmaliData? {
        println("visitSuper(), ${ctx?.text}")
        return super.visitSuper(ctx)
    }

    override fun visitSource(ctx: SmaliParser.SourceContext?): SmaliData? {
        println("visitSource(), ${ctx?.text}")
        return super.visitSource(ctx)
    }

    override fun visitImplements(ctx: SmaliParser.ImplementsContext?): SmaliData? {
        println("visitImplements(), ${ctx?.text}")
        return super.visitImplements(ctx)
    }

    override fun visitAnnotation(ctx: SmaliParser.AnnotationContext?): SmaliData? {
        println("-------------------- visitAnnotation start --------------------")
        println(ctx?.text)
        println("-------------------- visitAnnotation end ----------------------")
        println()
        return super.visitAnnotation(ctx)
    }

    override fun visitField(ctx: SmaliParser.FieldContext?): SmaliData? {
        println("-------------------- visitField start --------------------")
        println(ctx?.text)
        println("-------------------- visitField end ----------------------")
        println()
        return super.visitField(ctx)
    }

    override fun visitFieldDef(ctx: SmaliParser.FieldDefContext?): SmaliData? {
        println("visitFieldDef(), ${ctx?.text}")
        return super.visitFieldDef(ctx)
    }

    override fun visitFieldStart(ctx: SmaliParser.FieldStartContext?): SmaliData? {
        println("visitFieldStart(), ${ctx?.text}")
        return super.visitFieldStart(ctx)
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