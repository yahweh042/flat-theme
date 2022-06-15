plugins {
    id("org.jetbrains.intellij") version "1.6.0"
    kotlin("jvm") version "1.7.0"
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
    version.set("2021.1")
    type.set("IC")
    updateSinceUntilBuild.set(false)
}
tasks {
    patchPluginXml {
        sinceBuild.set("211")
        changeNotes.set("""
            2022-04-01:
            <br/>
            初始化主题插件，添加flat主题

            2022-06-01:
            <br/>
            添加新的IDE主题和编辑器主题 flat-dark        """.trimIndent())
    }

    buildSearchableOptions {
        enabled = false
    }
}
