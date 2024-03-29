package kz.iitu.busnetmobile.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ExploreScreen() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.Magenta),
        contentAlignment = Alignment.Center) {
        Text(text = "Explore Screen", fontSize = 48.sp)
    }
}