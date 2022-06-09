plugins {
    id("org.jetbrains.intellij") version "1.5.2"
    kotlin("jvm") version "1.6.10"
}

group = "org.yahweh042"
version = "1.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2020.1")
    type.set("IC")
    updateSinceUntilBuild.set(false)
}
tasks {
    patchPluginXml {
        changeNotes.set("""
            Add change notes here.<br>
            <em>most HTML tags may be used</em>        """.trimIndent())
    }

    buildSearchableOptions {
        enabled = false
    }
}
