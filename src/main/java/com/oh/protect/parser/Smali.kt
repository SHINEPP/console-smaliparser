package org.example.com.oh.protect.parser

class Smali(
    val classDef: String,
    val superDef: String,
    val sourceDef: String,
    val implements: List<String>,
    val annotations: List<String>,
    val fields: List<String>,
    val methods: List<String>) {


    fun getMethodName(): String {

    }
}