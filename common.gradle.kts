/**
 * Общая часть для всех settings.gradle.kts
 *
 * Включает в себя такие настройки как:
 * 1) Репозитории плагинов
 * 2) Репозитории проектов
 * 3) Каталоги версий
 */

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}