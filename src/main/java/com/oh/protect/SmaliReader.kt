package com.oh.protect

import com.oh.protect.smali.SmaliLexer
import com.oh.protect.smali.SmaliParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class SmaliReader {

    fun read(smaliFile: File) {
        val charStreams = CharStreams.fromPath(smaliFile.toPath())
        val lexer = SmaliLexer(charStreams)
        val tokens = CommonTokenStream(lexer)
        val parser = SmaliParser(tokens)
        val smaliTree = parser.file()

        /*println("====================== token start ======================")
        for (token in tokens.tokens) {
            println("token = ${token.text}")
        }
        println("====================== token end ======================")
        println()*/

        println("====================== tree start ======================")
        val visitor = SmaliVisitor()
        visitor.visit(smaliTree)
        println("====================== tree end ======================")
    }
}