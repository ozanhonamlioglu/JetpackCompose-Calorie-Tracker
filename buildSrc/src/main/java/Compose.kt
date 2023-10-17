object Compose {
    const val composeVersion = "1.5.3"
    const val composeCompilerVersion = "1.5.3"

    const val material = "androidx.compose.material3:material3"
    const val ui = "androidx.compose.ui:ui"
    const val graphics = "androidx.compose.ui:ui-graphics"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"

    const val runtime = "androidx.compose.runtime:runtime:$composeVersion"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    private const val navigationVersion = "2.7.4"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0-beta01"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val activityComposeVersion = "1.8.0"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val lifecycleVersion = "2.4.0"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"

    private const val composeBomVersion = "2023.03.00"
    const val composeBom = "androidx.compose:compose-bom:$composeBomVersion"
}
