package com.oh.protect.smali.parser

import com.oh.protect.smali.smali.SmaliParser
import com.oh.protect.smali.smali.SmaliParserBaseVisitor


class SmaliVisitor : SmaliParserBaseVisitor<Int?>() {

    private var classDef = ""
    private var superDef = ""
    private var sourceDef = ""
    private val implements = ArrayList<String>()
    private val annotations = ArrayList<String>()
    private val fields = ArrayList<String>()
    private val methods = ArrayList<String>()

    fun crateSmaliClass(): Smali {
        return Smali(
            classDef = classDef,
            superDef = superDef,
            sourceDef = sourceDef,
            implements = implements,
            annotations = annotations,
            fields = fields,
            methods = methods.map { MethodReader(it.substringBefore("\n")).read() }
        )
    }

    override fun visitClass(ctx: SmaliParser.ClassContext?): Int? {
        classDef = ctx?.text ?: ""
        return super.visitClass(ctx)
    }

    override fun visitSuper(ctx: SmaliParser.SuperContext?): Int? {
        superDef = ctx?.text ?: ""
        return super.visitSuper(ctx)
    }

    override fun visitSource(ctx: SmaliParser.SourceContext?): Int? {
        sourceDef = ctx?.text ?: ""
        return super.visitSource(ctx)
    }

    override fun visitImplements(ctx: SmaliParser.ImplementsContext?): Int? {
        implements.add(ctx?.text ?: "")
        return super.visitImplements(ctx)
    }

    override fun visitAnnotation(ctx: SmaliParser.AnnotationContext?): Int? {
        annotations.add(ctx?.text ?: "")
        return super.visitAnnotation(ctx)
    }

    override fun visitField(ctx: SmaliParser.FieldContext?): Int? {
        fields.add(ctx?.text ?: "")
        return super.visitField(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): Int? {
        methods.add(ctx?.text ?: "")
        return super.visitMethod(ctx)
    }
}