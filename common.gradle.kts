/**
 * Общая часть для всех settings.gradle.kts внутри проекта vs-components
 */

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

apply { from("repositories.gradle.kts") }

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}