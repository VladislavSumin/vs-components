enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild("build-logic/kotlin")
}

rootProject.name = "vs-components"