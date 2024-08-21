plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.oh.apkprotector"
version = "1.0"

dependencies {

    // dex & smali
    implementation("com.android.tools.smali:smali:3.0.3")
    implementation("com.android.tools.smali:smali-baksmali:3.0.3")

    // antlr4
    implementation("org.antlr:antlr4:4.13.1")

    // r8 mapping
    implementation("com.guardsquare:proguard-core:9.0.1")

    // test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}