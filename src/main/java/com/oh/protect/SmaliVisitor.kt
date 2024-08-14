package com.oh.protect

import com.oh.protect.smali.SmaliBaseVisitor
import com.oh.protect.smali.SmaliParser

class SmaliData

class SmaliVisitor : SmaliBaseVisitor<SmaliData?>() {

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

    override fun visitFieldDef(ctx: SmaliParser.FieldDefContext?): SmaliData? {
        println("visitFieldDef(), ${ctx?.text}")
        return super.visitFieldDef(ctx)
    }

    override fun visitFieldBlock(ctx: SmaliParser.FieldBlockContext?): SmaliData? {
        println("visitFieldBlock(), ${ctx?.text}")
        return super.visitFieldBlock(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): SmaliData? {
        println("visitMethod(), ${ctx?.text}")
        return super.visitMethod(ctx)
    }
}