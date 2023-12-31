package com.example.calorytracker.navigation

import androidx.navigation.NavController
import com.example.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}