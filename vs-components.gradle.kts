/**
 * Базовая конфигурация для подключения этого проекта как includeBuild к любому другому.
 * Подключает репозитории, сборочные скрипты, каталоги версий (как внешних так и vs-comonents).
 */

apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild(file("build-logic/kotlin"))
}

includeBuild(file("./"))


dependencyResolutionManagement {
    versionCatalogs {
        create("vsComponents") {
            from(files("vs-components.versions.toml"))
        }
    }
}