plugins {
    `version-catalog`
}

catalog {
    versionCatalog {
        this.from(files("../../libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
