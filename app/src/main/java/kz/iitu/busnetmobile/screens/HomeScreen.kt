package kz.iitu.busnetmobile.screens

import kz.iitu.busnetmobile.components.HomePanels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet { DrawerPanel(drawerState = drawerState, scope = scope) }
        },
    ) {
        Scaffold(

            topBar = {
                TopAppBar(drawerState, scope)
            }
        ) {
            Column(modifier = Modifier.padding(it)) {
                HomePanels()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview(){
    HomeScreen()
}