package com.oh.protect.parser

import com.oh.protect.smalimethod.SmaliMethodParser
import com.oh.protect.smalimethod.SmaliMethodParserBaseVisitor

class MethodVisitor(private val content: String) : SmaliMethodParserBaseVisitor<Int?>() {

    private val methodIdentifiers = ArrayList<String>()
    private var methodName = ""
    private var paramsSignature = ""
    private var returnSignature = ""

    fun crateSmaliMethod(): Smali.Method {
        return Smali.Method(
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