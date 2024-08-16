package org.example.com.oh.protect.parser

class SmaliWriter(private val smali: SmaliClass) {

    fun write() {
        val text = getSmaliClassInfo() + getSmaliImplements() + getSmaliAnnotations() + getSmaliFields() + getSmaliMethods()
        //println(text)
    }

    private fun getSmaliClassInfo(): String {
        return "${smali.classDef}\n" +
                "${smali.superDef}\n" +
                "${smali.sourceDef}\n"
    }

    private fun getSmaliImplements(): String {
        if (smali.implements.isEmpty()) {
            return ""
        }
        return "\n" + smali.implements.joinToString("\n")
    }

    private fun getSmaliAnnotations(): String {
        if (smali.annotations.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.annotations.joinToString("\n\n")
    }

    private fun getSmaliFields(): String {
        if (smali.fields.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.fields.joinToString("\n\n")
    }

    private fun getSmaliMethods(): String {
        if (smali.methods.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.methods.joinToString("\n\n")
    }
}