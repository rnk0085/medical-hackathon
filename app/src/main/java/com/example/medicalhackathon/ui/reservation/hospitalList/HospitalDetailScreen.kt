package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalDetailScreen(
    modifier: Modifier = Modifier,
) {
    Text(text = "HospitalDetailScreen")
}

@Preview(showBackground = true)
@Composable
fun HospitalDetailScreenPreview() {
    MedicalHackathonTheme {
        HospitalDetailScreen()
    }
}
