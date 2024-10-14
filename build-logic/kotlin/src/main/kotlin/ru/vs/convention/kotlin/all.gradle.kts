package ru.vs.convention.kotlin

/**
 * Подключает все поддерживаемые таргеты kotlin kmp разом.
 * Android таргет в данном случае подключается как android библиотека.
 */

plugins {
    id("ru.vs.convention.kotlin.jvm")
}
