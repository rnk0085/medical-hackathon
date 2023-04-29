package com.example.medicalhackathon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme
import com.example.medicalhackathon.navigation.MainNavHost
import com.example.medicalhackathon.navigation.MultipleItemsBottomNavigation
import com.example.medicalhackathon.navigation.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedicalHackathonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            MultipleItemsBottomNavigation(
                navController = navController,
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Screen.Edit.route)
                },
                contentColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = null,
                )
            }
        },
    ) { innerPadding ->
        MainNavHost(
            modifier = Modifier.padding(innerPadding),
            navController = navController,
        )
    }
}
