package kz.iitu.busnetmobile.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import kz.iitu.busnetmobile.R

interface BNDestinations {
    var route: String
    val icon: Int
    val title: String
}

object Home: BNDestinations{
    override var route="Home"
    override val icon = R.drawable.home
    override val title = "Home"

}

object Explore: BNDestinations{
    override var route="Explore"
    override val icon = R.drawable.explore
    override val title = "Explore"

}

object Notification: BNDestinations{
    override var route = "Notification"
    override val icon = R.drawable.notification
    override val title="Messages"
}

object MyTickets: BNDestinations{
    override var route = "My Tickets"
    override val icon = R.drawable.tickets
    override val title="My Tickets"
}
object Settings: BNDestinations{
    override var route = "Settings"
    override val icon = R.drawable.settings
    override val title="Settings"
}
