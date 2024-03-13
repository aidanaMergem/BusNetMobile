package kz.iitu.busnetmobile.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.iitu.busnetmobile.R

@Composable
fun TopAppBar(
    drawerState: DrawerState, scope: CoroutineScope? = null
) {
    Column() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                scope?.launch {
                    drawerState.apply {
                        if (isClosed) open() else close()
                    }
                }
            }) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_menu_24),
                    contentDescription = "menu",
                    modifier = Modifier.size(24.dp)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.busnet_logo),
                    contentDescription = "logo"
                )
                Text(
                    text = "BusNet",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    color = Color(0xFFFB7126)

                )

            }
            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "profile",
                    modifier = Modifier.size(24.dp)

                )
            }

        }

        HorizontalDivider(
            color = Color.LightGray,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),

            thickness = 1.dp
        )
    }


}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
//        TopAppBar()
}