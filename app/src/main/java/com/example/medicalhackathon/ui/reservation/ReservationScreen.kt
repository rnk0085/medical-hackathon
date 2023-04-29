package com.example.medicalhackathon.ui.reservation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.reservation.hospitalList.HospitalListScreen
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun ReservationScreen(
    onListTileClick: () -> Unit,
){
    HospitalListScreen(
        onListTileClick = onListTileClick,
    )
}

@Preview
@Composable
private fun ReservationScreenPreview() {
    MedicalHackathonTheme {
        ReservationScreen(
            onListTileClick = {},
        )
    }
}
