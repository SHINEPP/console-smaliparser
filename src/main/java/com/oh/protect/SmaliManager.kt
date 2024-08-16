package org.example.com.oh.protect

import org.example.com.oh.protect.parser.SmaliProcessor
import java.io.File

object SmaliManager {

    fun travel(dir: String) {
        val fileTree = File(dir).walk()
        fileTree
            .filter { it.isFile && it.extension == "smali" }
            .forEach {
                handleSmali(it.path)
            }
    }

    private fun handleSmali(path: String) {
        println("handleSmali(), path = $path")
        SmaliProcessor.process(path, "")
    }
}