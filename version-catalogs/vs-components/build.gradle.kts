plugins {
    `version-catalog`
}

catalog {
    versionCatalog {
        this.from(files("../../vs-components.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
