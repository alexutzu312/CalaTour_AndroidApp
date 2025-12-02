package com.example.calatour.data.local

import com.example.calatour.R
import com.example.calatour.model.Offer

object LocalDataSource {

    val offersList = listOf(
        Offer(
            title = "Barcelona, 3 nights",
            imageId = R.drawable.offer_1,
            price = "300 EUR",
            description = "Lorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUM"
        ),
        Offer(
            title = "Maldive, 7 nights",
            imageId = R.drawable.offer_2,
            price = "1050 EUR",
            description = "Lorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUM"
        ),
        Offer(
            title = "Thailand, 10 nights",
            imageId = R.drawable.offer_3,
            price = "1200 EUR",
            description = "Lorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUMLorem IPSUMLorem IPSUM Lorem IPSUM"
        )
    )
}