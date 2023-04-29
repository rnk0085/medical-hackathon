package com.example.medicalhackathon.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.medicalhackathon.ui.edit.EditScreen
import com.example.medicalhackathon.ui.home.HomeScreen
import com.example.medicalhackathon.ui.mypage.MyPageScreen
import com.example.medicalhackathon.ui.qr.QrCodeScreen
import com.example.medicalhackathon.ui.reservation.ReservationFirstScreen
import com.example.medicalhackathon.ui.reservation.ReservationScreen
import com.example.medicalhackathon.ui.reservation.hospitalList.HospitalDetailScreen

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController,
        startDestination = Screen.Home.route,
        modifier = modifier,
    ) {
        // ボトムタブ
        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Reservation.route) {
            ReservationScreen(
                onListTileClick = {
                    navController.navigate(HackathonNavigation.HospitalDetail.route)
                },
            )
        }

        composable(Screen.Edit.route) {
            EditScreen()
        }

        composable(Screen.QrCode.route) {
            QrCodeScreen()
        }

        composable(Screen.MyPage.route) {
            MyPageScreen()
        }

        // その他
        composable(HackathonNavigation.HospitalDetail.route) {
            HospitalDetailScreen(
                onReservationClick = {
                    navController.navigate(HackathonNavigation.ReservationFirst.route)
                }
            )
        }

        composable(HackathonNavigation.ReservationFirst.route) {
            ReservationFirstScreen()
        }
    }
}
