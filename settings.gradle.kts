rootProject.name = "QuestRPG"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")

    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":composeApp")
include(":androidApp")
include(":server")

include(":core:domain")
include(":core:data")
include(":core:presentation")
include(":core:designsystem")
include(":core:database")
include(":core:network")
include(":core:datastore")

include(":feature:auth:domain")
include(":feature:auth:data")
include(":feature:auth:presentation")

include(":feature:home:domain")
include(":feature:home:data")
include(":feature:home:presentation")

include(":feature:quest:domain")
include(":feature:quest:data")
include(":feature:quest:presentation")

include(":feature:calendar:domain")
include(":feature:calendar:data")
include(":feature:calendar:presentation")

include(":feature:achievement:domain")
include(":feature:achievement:data")
include(":feature:achievement:presentation")

include(":feature:stats:domain")
include(":feature:stats:data")
include(":feature:stats:presentation")

include(":feature:social:domain")
include(":feature:social:data")
include(":feature:social:presentation")

include(":feature:profile:domain")
include(":feature:profile:data")
include(":feature:profile:presentation")
