package kz.iitu.busnetmobile.data

import androidx.compose.ui.graphics.Color
import kz.iitu.busnetmobile.R

data class News(
    val name: String,
    val description: String,

    val image: Int,
    val color: Color
)


val news = listOf<News>(
    News(
        "New Route Expansion",
        "Exciting News! Our intercity bus service is expanding with a new route connecting Almaty, Kazakhstan, to Bishkek, Kyrgyzstan. Explore new destinations with ease!",
        R.drawable.n1,
        Color(
            0x80FED4BE
        )
    ),
    News(
        "Eco-Friendly Initiatives",
        "Going Green! We're proud to announce our commitment to sustainability. Our fleet is now equipped with eco-friendly buses, reducing our carbon footprint for a more environmentally conscious travel experience",
        R.drawable.n2,
        Color(
            0x80BEECE6
        )
    )
)