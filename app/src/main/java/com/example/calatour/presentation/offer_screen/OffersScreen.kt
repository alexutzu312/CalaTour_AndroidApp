package com.example.calatour.presentation.offer_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.calatour.data.local.LocalDataSource
import com.example.calatour.presentation.offer_screen.components.CustomTopBar
import com.example.calatour.presentation.offer_screen.components.OfferCard
import kotlinx.coroutines.delay

@Composable
fun OffersScreen() {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CustomTopBar()
        }
    ) { innerPadding ->

        var isLoading by remember {
            mutableStateOf(true)
        }

        LaunchedEffect(Unit) {
            delay(3000L)
            isLoading = false
        }

        if(isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(50.dp)
                )
            }
        } else {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(LocalDataSource.offersList) {currentOffer ->
                    OfferCard(currentOffer)
                }
            }
        }

    }
}