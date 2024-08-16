package com.oh.protect

import com.oh.protect.parser.SmaliProcessor
import java.io.File

object SmaliManager {

    fun travel(dir: String) {
        File(dir).walk()
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