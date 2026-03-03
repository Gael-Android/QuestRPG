plugins {
    alias(libs.plugins.convention.cmp.library)
}

dependencies {
        commonMainImplementation(projects.core.domain)
        commonMainImplementation(projects.core.designsystem)
        commonMainImplementation(projects.feature.quest.domain)
}
