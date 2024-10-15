/**
 * Базовая конфигурация для подключения этого проекта как includeBuild к любому другому.
 * Подключает репозитории, сборочные скрипты, каталоги версий (как внешних так и vs-comonents).
 *
 * Имеется два режима подключения, которые управляются через флаг ru.vs.components.useLocalBuild
 * 1) true - vs-component полностью подключается как локальный проект. В этом режиме возможено редактирование и дебаг
 *    кода в рамках основного проекта без необходимости переключаться в vs-components напрямую.
 * 2) false - большая часть проекта тянется с maven репозитория, в этом режиме проект синхронизируется и собирается
 *    быстрее, если нет необходимости редактировать код в vs-components, то лучше использовать этот режим.
 */

val useLocalBuild = providers.gradleProperty("ru.vs.components.useLocalBuild").getOrElse("false").toBoolean()
val version = providers.gradleProperty("ru.vs.components.version").get()

apply { from("repositories.gradle.kts") }

pluginManagement {
    // TODO поддержать это
     val useLocalBuild = providers.gradleProperty("ru.vs.components.useLocalBuild").getOrElse("false").toBoolean()
     if (useLocalBuild) {
        includeBuild(file("build-logic"))
     }
}

if (useLocalBuild) {
    includeBuild(file("./"))
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from("ru.vs.version-catalogs:libs:${version}")
        }
        create("vsComponents") {
            from("ru.vs.version-catalogs:vs-components:${version}")
        }
    }
}
