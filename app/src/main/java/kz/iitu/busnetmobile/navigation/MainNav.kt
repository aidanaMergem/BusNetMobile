package kz.iitu.busnetmobile.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kz.iitu.busnetmobile.screens.ExploreScreen
import kz.iitu.busnetmobile.screens.*


@Composable
fun MainNav() {

    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MyBottomNavigation(navController = navController)}
    ) {
        Box(Modifier.padding(it)){
            NavHost(navController = navController, startDestination = Home.route){
                composable(Home.route){
                    HomeScreen()
                }
                composable(Explore.route){
                    ExploreScreen()
                }
                composable(Notification.route){
                   Notification()
                }
                composable(MyTickets.route){
                  MyTickets()
                }
                composable(Settings.route){
                    SettingsScreen()
                }
            }
        }
    }

}

@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinationList = listOf<BNDestinations>(
         Home, Explore, Notification, MyTickets, Settings
    )
    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }
    NavigationBar() {
        destinationList.forEachIndexed { index, destination ->
            NavigationBarItem(
                label = { Text(text = destination.title, fontSize = 12.sp) },
                icon = { Icon(painter = painterResource(id = destination.icon),
                    contentDescription = "Icon") },
                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].route) {
                        popUpTo(Home.route)
                        launchSingleTop = true
                    }
                })
        }
    }
}
