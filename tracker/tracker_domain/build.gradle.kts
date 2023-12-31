plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = "com.example.tracker_data"
    compileSdk = 33
}

dependencies {
    implementation(project(Modules.core))
    implementation(Coroutines.coroutines)
}