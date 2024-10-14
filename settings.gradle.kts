apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild("build-logic/kotlin")
}

rootProject.name = "vs-components"