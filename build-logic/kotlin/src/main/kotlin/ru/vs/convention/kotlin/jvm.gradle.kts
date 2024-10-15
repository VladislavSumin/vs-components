package ru.vs.convention.kotlin

import org.gradle.accessors.dm.LibrariesForLibs
import ru.vs.build_logic.gradleKotlinDslAccessorsFix

/**
 * Базовая настройка JVM таргета для KMP.
 */

plugins {
    id("ru.vs.convention.kotlin.common")
}

kotlin {
    jvm()

    sourceSets {
        jvmTest {
            dependencies {
                implementation(kotlin("test-junit5"))
                gradleKotlinDslAccessorsFix {
                    val libs = the<LibrariesForLibs>()
                    implementation(libs.mockk)
                }
            }
        }
    }
}
