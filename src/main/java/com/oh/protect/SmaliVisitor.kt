package com.oh.protect

import com.oh.protect.smali.SmaliParser
import com.oh.protect.smali.SmaliParserBaseVisitor
import org.example.com.oh.protect.VisitData


class SmaliVisitor : SmaliParserBaseVisitor<VisitData?>() {

    private var classDef: String? = null
    private var superDef: String? = null
    private var sourceDef: String? = null
    private val implements = ArrayList<String>()
    private val annotations = ArrayList<String>()
    private val fields = ArrayList<String>()
    private val methods = ArrayList<String>()

    override fun visitClass(ctx: SmaliParser.ClassContext?): VisitData? {
        println("visitClass(), ${ctx?.text}")
        return super.visitClass(ctx)
    }

    override fun visitSuper(ctx: SmaliParser.SuperContext?): VisitData? {
        println("visitSuper(), ${ctx?.text}")
        return super.visitSuper(ctx)
    }

    override fun visitSource(ctx: SmaliParser.SourceContext?): VisitData? {
        println("visitSource(), ${ctx?.text}")
        return super.visitSource(ctx)
    }

    override fun visitImplements(ctx: SmaliParser.ImplementsContext?): VisitData? {
        println("visitImplements(), ${ctx?.text}")
        return super.visitImplements(ctx)
    }

    override fun visitAnnotation(ctx: SmaliParser.AnnotationContext?): VisitData? {
        println("visitAnnotation(), ${ctx?.text}")
        return super.visitAnnotation(ctx)
    }

    override fun visitField(ctx: SmaliParser.FieldContext?): VisitData? {
        println("visitField(), ${ctx?.text}")
        return super.visitField(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): VisitData? {
        println("visitMethod(), ${ctx?.text}")
        return super.visitMethod(ctx)
    }
}