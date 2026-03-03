import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.convention.cmp.application)
    alias(libs.plugins.composeHotReload)
}

kotlin {
    androidLibrary {
        namespace = "com.okhotsk.questrpg.composeapp"
        androidResources.enable = true
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.androidx.lifecycle.viewmodel.compose)
            implementation(libs.androidx.lifecycle.runtime.compose)
            implementation(projects.core.domain)
        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.okhotsk.questrpg.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.okhotsk.questrpg"
            packageVersion = "1.0.0"
            linux {
                iconFile.set(project.file("src/desktopMain/resources/icons/app-icon-512.png"))
            }
            windows {
                iconFile.set(project.file("src/desktopMain/resources/icons/app-icon.ico"))
            }
            macOS {
                iconFile.set(project.file("src/desktopMain/resources/icons/app-icon-1024.png"))
            }
        }
    }
}
