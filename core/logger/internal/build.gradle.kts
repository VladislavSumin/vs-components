plugins {
    id("ru.vs.convention.kotlin.all")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.logger.common)
        }
    }
}
