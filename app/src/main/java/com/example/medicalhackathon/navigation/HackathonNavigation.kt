package com.example.medicalhackathon.navigation

/**
 * 必要な遷移情報をまとめる
 */
sealed class HackathonNavigation(
    val route: String,
) {
    object HospitalDetail : HackathonNavigation(
        route = "hospital_detail"
    )
}
