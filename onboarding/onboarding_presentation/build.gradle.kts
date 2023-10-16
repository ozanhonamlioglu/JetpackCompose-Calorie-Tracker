plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = "com.example.core_ui"
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.onboardingDomain))
    implementation(project(Modules.coreUi))
}