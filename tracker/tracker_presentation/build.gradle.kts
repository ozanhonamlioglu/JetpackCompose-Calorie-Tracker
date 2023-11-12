plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = "com.example.tracker_presentation"
    compileSdk = 33
}

dependencies {
    implementation(project(Modules.trackerData))
    implementation(project(Modules.core))
}
