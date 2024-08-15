package com.oh.protect

import com.oh.protect.smali.SmaliParser
import com.oh.protect.smali.SmaliParserBaseVisitor
import org.example.com.oh.protect.SmaliData


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
        println("visitAnnotation(), ${ctx?.text}")
        return super.visitAnnotation(ctx)
    }

    override fun visitField(ctx: SmaliParser.FieldContext?): SmaliData? {
        println("visitField(), ${ctx?.text}")
        return super.visitField(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): SmaliData? {
        println("visitMethod(), ${ctx?.text}")
        return super.visitMethod(ctx)
    }
}