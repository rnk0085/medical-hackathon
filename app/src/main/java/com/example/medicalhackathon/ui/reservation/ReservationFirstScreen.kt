package com.example.medicalhackathon.ui.reservation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

/**
 * 初診予約：その1
 */
@Composable
fun ReservationFirstScreen(){
    Text(text = "ReservationFirstScreen")
}

@Preview
@Composable
private fun MReservationFirstScreenPreview() {
    MedicalHackathonTheme {
        ReservationFirstScreen()
    }
}
