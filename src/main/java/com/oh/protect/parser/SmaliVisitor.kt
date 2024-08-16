package org.example.com.oh.protect.parser

import com.oh.protect.smali.SmaliParser
import com.oh.protect.smali.SmaliParserBaseVisitor


class SmaliVisitor : SmaliParserBaseVisitor<VisitData?>() {

    private var classDef = ""
    private var superDef = ""
    private var sourceDef = ""
    private val implements = ArrayList<String>()
    private val annotations = ArrayList<String>()
    private val fields = ArrayList<String>()
    private val methods = ArrayList<String>()

    fun getSmaliClass(): SmaliClass {
        return SmaliClass(
            classDef = classDef,
            superDef = superDef,
            sourceDef = sourceDef,
            implements = implements,
            annotations = annotations,
            fields = fields,
            methods = methods
        )
    }

    override fun visitClass(ctx: SmaliParser.ClassContext?): VisitData? {
        classDef = ctx?.text ?: ""
        return super.visitClass(ctx)
    }

    override fun visitSuper(ctx: SmaliParser.SuperContext?): VisitData? {
        superDef = ctx?.text ?: ""
        return super.visitSuper(ctx)
    }

    override fun visitSource(ctx: SmaliParser.SourceContext?): VisitData? {
        sourceDef = ctx?.text ?: ""
        return super.visitSource(ctx)
    }

    override fun visitImplements(ctx: SmaliParser.ImplementsContext?): VisitData? {
        implements.add(ctx?.text ?: "")
        return super.visitImplements(ctx)
    }

    override fun visitAnnotation(ctx: SmaliParser.AnnotationContext?): VisitData? {
        annotations.add(ctx?.text ?: "")
        return super.visitAnnotation(ctx)
    }

    override fun visitField(ctx: SmaliParser.FieldContext?): VisitData? {
        fields.add(ctx?.text ?: "")
        return super.visitField(ctx)
    }

    override fun visitMethod(ctx: SmaliParser.MethodContext?): VisitData? {
        methods.add(ctx?.text ?: "")
        return super.visitMethod(ctx)
    }
}