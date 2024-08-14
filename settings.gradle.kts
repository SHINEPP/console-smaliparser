pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

        maven { url = uri("https://jitpack.io") }
    }

    resolutionStrategy {
        eachPlugin {
            val requestId = requested.id.id
            println("requested.id.id = $requestId")

            when (requestId) {
                "com.github.johnrengelman.shadow" -> {
                    useModule("gradle.plugin.com.github.johnrengelman:shadow:7.1.1")
                }

                "com.google.protobuf" -> {
                    useModule("com.google.protobuf:protobuf-gradle-plugin:0.9.4")
                }
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("https://maven.cherrysoft.cn/repository/maven-releases/")
            credentials {
                username = "develop"
                password = "qwert12345"
            }
        }

        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "console-smaliparser"

