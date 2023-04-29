package com.example.medicalhackathon.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

/**
 * ①Home
 * ②予約
 * ③編集
 * ④QRコード
 * ⑤マイページ
 */
sealed class Screen(
    val route: String,
    val name: String,
    val icon: ImageVector,
) {
    object Home : Screen(
        route = "Home",
        name = "ホーム",
        icon = Icons.Filled.Home,
    )

    object Reservation : Screen(
        route = "reservation",
        name = "予約",
        icon = Icons.Filled.Search,
    )

    object Edit : Screen(
        route = "edit",
        name = "編集",
        icon = Icons.Filled.Edit,
    )

    // TODO: Qrコード表示部分のアイコンを設定
    object QrCode : Screen(
        route = "qrcode",
        name = "QRコード",
        icon = Icons.Filled.Favorite,
    )

    // TODO: マイページが切れている
    object MyPage : Screen(
        route = "mypage",
        name = "マイページ",
        icon = Icons.Filled.AccountCircle,
    )
}

// https://developer.android.com/jetpack/compose/navigation
@Composable
fun MultipleItemsBottomNavigation(
    navController: NavHostController = rememberNavController(),
) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        val items = listOf(
            Screen.Home,
            Screen.Reservation,
            Screen.Edit,
            Screen.QrCode,
            Screen.MyPage,
        )

        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.icon, contentDescription = null) },
                label = { Text(screen.name) },
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview2() {
    MedicalHackathonTheme {
        MultipleItemsBottomNavigation()
    }
}
