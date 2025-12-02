package com.example.calatour.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calatour.presentation.auth_screen.AuthScreen
import com.example.calatour.presentation.offer_screen.OffersScreen

@Composable
fun Navigation() {

    val navViewModel = viewModel<NavigationViewModel>()
    val currentScreen = navViewModel.currentScreen

    when(currentScreen) {
        Screen.AUTH_SCREEN -> {
            AuthScreen(
                onNavigate = {
                    navViewModel.navigateTo(Screen.OFFERS_SCREEN)
                }
            )
        }
        Screen.OFFERS_SCREEN -> {
            OffersScreen()
        }
    }
}

enum class Screen {
    AUTH_SCREEN,
    OFFERS_SCREEN
}