plugins {
    `maven-publish`
}

apply { from("build-scripts/group.gradle.kts") }
apply { from("build-scripts/version.gradle.kts") }

allprojects {
    setupMavenPublish()
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
