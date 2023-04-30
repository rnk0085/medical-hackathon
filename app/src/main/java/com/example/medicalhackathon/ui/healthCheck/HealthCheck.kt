package com.example.medicalhackathon.ui.healthCheck

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HealthCheckScreen(){
    Text(text = "EditScreen")
}

@Preview
@Composable
private fun HealthCheckScreenPreview() {
    MedicalHackathonTheme {
        HealthCheckScreen()
    }
}
