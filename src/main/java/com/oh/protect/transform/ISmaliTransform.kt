package com.oh.protect.transform

import com.oh.protect.smaliparser.Smali

interface ISmaliTransform {



    fun transformSmali(smali: Smali): Smali
}