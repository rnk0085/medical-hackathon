package com.example.medicalhackathon.ui.theme.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String,
) {
    NavHost(
        navController,
        startDestination = Screen.Profile.route,
        modifier = modifier,
    ) {
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.FriendsList.route) {
            FriendsListScreen()
        }
    }
}

@Composable
fun ProfileScreen(){
    Text(text = "ProfileScreen")
}

@Composable
fun FriendsListScreen() {
    Text(text = "FriendsListScreen")
}
