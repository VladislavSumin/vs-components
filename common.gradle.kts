/**
 * Общая часть для всех settings.gradle.kts внутри проекта vs-components
 */

apply { from("repositories.gradle.kts") }

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}