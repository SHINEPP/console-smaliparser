plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.oh.apkprotector"
version = "1.0"

dependencies {
    // R8
    implementation("com.android.tools:r8:8.1.56")

    // dex & smali
    implementation("com.android.tools.smali:smali:3.0.3")
    implementation("com.android.tools.smali:smali-baksmali:3.0.3")

    // antlr4
    implementation("org.antlr:antlr4:4.13.1")

    // r8 mapping
    implementation("com.guardsquare:proguard-core-tools:9.1.5")

    // test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}