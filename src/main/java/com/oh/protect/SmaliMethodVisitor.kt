package org.example.com.oh.protect

import com.oh.protect.smalimethod.SmaliMethodParser
import com.oh.protect.smalimethod.SmaliMethodParserBaseVisitor

class SmaliMethodVisitor : SmaliMethodParserBaseVisitor<SmaliData?>() {

    override fun visitMethodHead(ctx: SmaliMethodParser.MethodHeadContext?): SmaliData? {
        println("visitMethodHead():${ctx?.text}")
        return super.visitMethodHead(ctx)
    }

    override fun visitMethodCode(ctx: SmaliMethodParser.MethodCodeContext?): SmaliData? {
        println("visitMethodCode():\n${ctx?.text}")
        return super.visitMethodCode(ctx)
    }
}