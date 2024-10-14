/**
 * Общая часть для всех settings.gradle.kts
 *
 * Включает в себя такие настройки как:
 * 1) Репозитории плагинов
 * 2) Репозитории проектов
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
}