import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.convention.kmp.library)
}

kotlin {
    androidLibrary {
        namespace = "com.okhotsk.questrpg.shared"
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
}
