package kz.iitu.busnetmobile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.iitu.busnetmobile.R

class IntroScreen {
}

@Composable
fun IntroLogo() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        Image(
            painter = painterResource(id = R.drawable.busnet_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = "BusNet",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Your Pathway to Intercity Adventures!",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W500,

            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )


        Button(
            onClick = {

            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 100.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFFB7126))

        ) {
        Text(
            text = stringResource(id = R.string.getstarted),
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 80.dp, vertical = 5.dp),

        )
    }
    }
}

@Composable
fun IntroImage() {
    val image = painterResource(R.drawable.introbg)
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        IntroLogo()

    }
}


@Preview(
    showBackground = true,
    showSystemUi = true

)
@Composable
fun Intro() {
    IntroImage()

}