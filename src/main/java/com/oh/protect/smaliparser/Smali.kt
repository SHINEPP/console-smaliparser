package com.oh.protect.smaliparser

class Smali(
    val classDef: String,
    val superDef: String,
    val sourceDef: String,
    val implements: List<String>,
    val annotations: List<String>,
    val fields: List<String>,
    val methods: List<Method>) {

    class Method(
        val method: String,
        val methodIdentifiers: List<String>,
        var methodName: String,
        var paramsSignature: String,
        var returnSignature: String
    )
}