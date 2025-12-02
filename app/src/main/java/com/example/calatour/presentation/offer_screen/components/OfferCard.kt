package com.example.calatour.presentation.offer_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calatour.model.Offer

@Composable
fun OfferCard(
    offer: Offer
) {

    var isMenuVisible by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = offer.title,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Column {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null,
                    modifier = Modifier.clickable{
                        isMenuVisible = true
                    }
                )
                DropdownMenu(
                    expanded = isMenuVisible,
                    onDismissRequest = {
                        isMenuVisible = false
                    }
                ) {
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = "Add Item"
                            )
                        },
                        onClick = {

                        }
                    )

                    DropdownMenuItem(
                        text = {
                            Text(
                                text = "Remove Item"
                            )
                        },
                        onClick = {

                        }
                    )
                }
            }
        }

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(offer.imageId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = offer.price,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }

        Text(offer.description)
    }
}


