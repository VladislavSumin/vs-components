val coreVersion: String = providers.gradleProperty("ru.vs.components.version").getOrElse("0.0.1")
version = coreVersion

allprojects {
    version = coreVersion
}