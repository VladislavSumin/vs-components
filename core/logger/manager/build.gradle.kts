plugins {
    id("ru.vs.convention.kotlin.all")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(projects.core.logger.common)
            implementation(projects.core.logger.internal)
        }
    }
}
