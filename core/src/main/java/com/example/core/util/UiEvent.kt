package com.example.core.util

sealed class UiEvent {
    object Success: UiEvent()
    data class Navigate(val route: String): UiEvent()
    object NavigateUp: UiEvent()
    data class ShowSnackBar(val message: UiText): UiEvent()
}
