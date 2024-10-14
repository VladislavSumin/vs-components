package ru.vs.convention.kotlin

/**
 * Базовая настройка KMP.
 */

plugins {
    id("kotlin-multiplatform")
}

kotlin {
    // Включаем автоматическую генерацию source set`ов. Подробнее читайте документацию по функции.
    applyDefaultHierarchyTemplate()

    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
