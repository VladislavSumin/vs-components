/**
 * Базовая конфигурация для подключения этого проекта как includeBuild к любому другому.
 * Подключает репозитории, сборочные скрипты, каталоги версий (как внешних так и vs-comonents).
 *
 * Имеется два режима подключения, которые управляются через флаг ru.vs.components.useLocalBuild
 * 1) true - vs-component полностью подключается как локальный проект. В этом режиме возможено редактирование и дебаг
 *    кода в рамках основного проекта без необходимости переключаться в vs-components напрямую.
 * 2) false - большая часть проекта тянется с maven репозитория, в этом режиме проект синхронизируется и собирается
 *    быстрее, если нет необходимости редактировать код в vs-components, то лучше использовать этот режим.
 *
 * TODO выкладывать каталоги версий на maven, не подключать их при выключенном флаге.
 * TODO выкладывать build-logic на maven, не подключать их при выключенном флаге.
 *
 */

val useLocalBuild = providers.gradleProperty("ru.vs.components.useLocalBuild").getOrElse("false").toBoolean()

apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild(file("build-logic/kotlin"))
}

if (useLocalBuild) {
    includeBuild(file("./"))
}

dependencyResolutionManagement {
    versionCatalogs {
        create("vsComponents") {
            from(files("vs-components.versions.toml"))
        }
    }
}