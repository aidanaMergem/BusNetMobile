package kz.iitu.busnetmobile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.iitu.busnetmobile.R
import kz.iitu.busnetmobile.data.Destination
import kz.iitu.busnetmobile.data.News
import kz.iitu.busnetmobile.data.destinations
import kz.iitu.busnetmobile.data.news

@Composable
fun HomePanels() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        UpcomingTrips()
        HorizontalDivider(
            color = Color.Gray,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            thickness = 1.dp
        )
        TopDestinations()
        NewsUpdates()
    }
}

@Composable
fun NewsUpdates() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "News/Updates",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "See all",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFB7126),
                modifier = Modifier.padding(8.dp)
            )
        }
        LazyColumn(
            state = rememberLazyListState()
        ) {
            items(news) { news -> NewsData(news) }
        }

    }
}


@Composable
fun UpcomingTrips() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
    ) {
        Text(
            text = "Upcoming Trips",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.upcomings),
            contentDescription = "Logo",
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .background(Color.White)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "You don't have tickets right now. ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Light
            )

            Button(
                onClick = {

                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFB7126))

            ) {
                Text(
                    text = stringResource(id = R.string.explore),
                    fontSize = 12.sp
                )
            }
        }


    }
}


@Composable
fun TopDestinations() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Moving Today",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "See all",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFB7126),
                modifier = Modifier.padding(8.dp)
            )
        }
        LazyRow(
            state = rememberLazyListState()
        ) {
            items(destinations) { destination -> DestinationData(destination) }
        }

    }
}



@Composable
fun DestinationData(destination: Destination) {
    Card(
        elevation = CardDefaults.cardElevation(16.dp),
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {

            Column(   verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = destination.image),
                    contentDescription = destination.name,
                    Modifier
                        .height(90.dp)
                        .width(121.dp)
                        .clip(RoundedCornerShape(20.dp))
                )
                Text(text = destination.name, fontSize = 16.sp, textAlign = TextAlign.Center)

            }

        }
    }
}

@Composable
fun NewsData(news: News) {
    Card(
        elevation = CardDefaults.cardElevation(16.dp),
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = news.color
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding( 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = news.image),
                contentDescription = news.name
            )
            Column(   verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),

            ) {

                Text(text = news.name, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = news.description, fontSize = 12.sp)

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePanelPreview() {
    NewsUpdates()
}
