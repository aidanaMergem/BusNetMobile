package kz.iitu.busnetmobile.data

import kz.iitu.busnetmobile.R


data class Destination(
    val name: String,
    val image: Int

)

val destinations = listOf<Destination>(
    Destination("Astana", R.drawable.astana),
    Destination("Shymkent",R.drawable.shymkent),
    Destination("Kyzylorda",R.drawable.kyzylorda),
    Destination("Almaty", R.drawable.almaty)
)