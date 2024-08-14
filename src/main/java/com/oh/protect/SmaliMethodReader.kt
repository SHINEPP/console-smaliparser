package org.example.com.oh.protect

import com.oh.protect.smalimethod.SmaliMethodLexer
import com.oh.protect.smalimethod.SmaliMethodParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class SmaliMethodReader {

    fun read(smaliFile: File) {
        val charStreams = CharStreams.fromPath(smaliFile.toPath())
        val lexer = SmaliMethodLexer(charStreams)
        val tokens = CommonTokenStream(lexer)
        val parser = SmaliMethodParser(tokens)
        val smaliTree = parser.file()

        println("====================== token start ======================")
        for (token in tokens.tokens) {
            println("token:\n${token.text}")
        }
        println("====================== token end ======================")
        println()

        println("====================== tree start ======================")
        val visitor = SmaliMethodVisitor()
        visitor.visit(smaliTree)
        println("====================== tree end ======================")
    }
}