enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

apply { from("common.gradle.kts") }

pluginManagement {
    includeBuild("build-logic/kotlin")
}

rootProject.name = "vs-components"

include(":core:logger:api")
include(":core:logger:common")
include(":core:logger:internal")
include(":core:logger:manager")
include(":core:logger:platform")