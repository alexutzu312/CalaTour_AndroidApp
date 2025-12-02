package com.example.calatour.presentation.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NavigationViewModel: ViewModel() {

    var currentScreen by mutableStateOf(Screen.AUTH_SCREEN)
        private set

    fun navigateTo(screen: Screen) {
        currentScreen = screen
    }
}