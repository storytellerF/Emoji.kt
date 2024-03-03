buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven(url = "https://raw.githubusercontent.com/kosi-libs/kodein-internal-gradle-plugin/mvn-repo")
    }
    dependencies {
        classpath("org.kodein.internal.gradle:kodein-internal-gradle-settings:8.6.0")
    }
}

apply { plugin("org.kodein.settings") }

rootProject.name = "Kosi-Emoji-KT"

include(
    ":emoji-kt",
    ":emoji-compose",
    ":compose-demo"
)
