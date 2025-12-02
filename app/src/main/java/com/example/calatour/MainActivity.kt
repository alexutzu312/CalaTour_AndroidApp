package com.example.calatour

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.calatour.presentation.navigation.Navigation
import com.example.calatour.ui.theme.CalaTourTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalaTourTheme {
                Navigation()
            }
        }
    }
}

