plugins {
    `maven-publish`
}

allprojects {
    setupGroup()
    version = "0.0.1"
    setupMavenPublish()
}

/**
 * Настраивает [Project.getGroup] для [Project] на основе пути по которому он расположен.
 *
 * Это необходимо для корректной публикации на maven репозитории, а так же для верного (и общего с maven) определения
 * артефактов, см vs-components.gradle.kts
 */
fun Project.setupGroup() {
    val path = mutableListOf<String>()
    var project = this.parent
    while (project != null && project != project.rootProject) {
        path += project.name
        project = project.parent
    }
    val subpackage = path.reversed().joinToString(separator = ".")

    group = if (subpackage.isBlank()) "ru.vs"
    else "ru.vs.$subpackage"
}

/**
 * Настраивает публикацию в maven репозиторий для [Project].
 */
fun Project.setupMavenPublish() {
    apply { plugin("maven-publish") }
    publishing {
        repositories {
            mavenLocal()
        }
    }
}
