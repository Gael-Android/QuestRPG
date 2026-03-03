plugins {
    alias(libs.plugins.convention.kmp.library)
}

dependencies {
        commonMainImplementation(projects.core.domain)
        commonMainImplementation(projects.feature.calendar.domain)
}
