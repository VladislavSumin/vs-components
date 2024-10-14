/**
 * Базовая конфигурация для подключения этого проекта как includeBuild к любому другому.
 */

apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild(file("build-logic/kotlin"))
}

includeBuild(file("./"))
