package kz.iitu.busnetmobile.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kz.iitu.busnetmobile.R

@Composable
fun DrawerPanel(drawerState: DrawerState, scope: CoroutineScope) {
    List(10) {
        Text(
            text = "item #$it",
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
        )
    }
    
    IconButton(onClick = {  }) {
        Icon(painter = painterResource(id = R.drawable.baseline_exit_to_app_24), contentDescription = "Close Icon")
    }
}