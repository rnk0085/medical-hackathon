package com.example.medicalhackathon.ui.reservation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun ReservationSecondScreen(){
    Text(text = "ReservationSecondScreen")
}

@Preview
@Composable
private fun ReservationSecondScreenPreview() {
    MedicalHackathonTheme {
        ReservationSecondScreen()
    }
}
