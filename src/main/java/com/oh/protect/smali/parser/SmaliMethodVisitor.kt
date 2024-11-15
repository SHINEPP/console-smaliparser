package com.oh.protect.smali.parser

import com.oh.protect.smali.smalimethod.SmaliMethodParser
import com.oh.protect.smali.smalimethod.SmaliMethodParserBaseVisitor

class SmaliMethodVisitor(private val content: String) : SmaliMethodParserBaseVisitor<Int?>() {

    private val methodIdentifiers = ArrayList<String>()
    private var methodName = ""
    private var paramsSignature = ""
    private var returnSignature = ""

    fun exportSmaliMethod(): SmaliModel.Method {
        return SmaliModel.Method(
            method = content,
            methodIdentifiers = methodIdentifiers,
            methodName = methodName,
            paramsSignature = paramsSignature,
            returnSignature = returnSignature
        )
    }

    override fun visitMethodIdentifier(ctx: SmaliMethodParser.MethodIdentifierContext?): Int? {
        ctx?.let { v ->
            v.children?.let { cs ->
                methodIdentifiers.addAll(cs.mapNotNull { it.text })
            }
        }
        return super.visitMethodIdentifier(ctx)
    }

    override fun visitMethodName(ctx: SmaliMethodParser.MethodNameContext?): Int? {
        methodName = ctx?.text ?: ""
        return super.visitMethodName(ctx)
    }

    override fun visitMethodInSignature(ctx: SmaliMethodParser.MethodInSignatureContext?): Int? {
        paramsSignature = ctx?.text ?: ""
        return super.visitMethodInSignature(ctx)
    }

    override fun visitMethodOutSignature(ctx: SmaliMethodParser.MethodOutSignatureContext?): Int? {
        returnSignature = ctx?.text ?: ""
        return super.visitMethodOutSignature(ctx)
    }
}