package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalDetailScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = "予約画面",
                )
            )
        }
    ) { innerPaddings ->
        Text(
            modifier = Modifier.fillMaxSize().padding(innerPaddings),
            text = "HospitalDetailScreen",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HospitalDetailScreenPreview() {
    MedicalHackathonTheme {
        HospitalDetailScreen()
    }
}
