package com.example.medicalhackathon.ui.reservation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.reservation.hospitalList.HospitalListScreen
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun ReservationScreen(
    onListTileClick: () -> Unit,
){
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = "予約画面",
                )
            )
        }
    ) { innerPaddings ->
        HospitalListScreen(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp)
                .padding(innerPaddings),
            onListTileClick = onListTileClick,
        )
    }
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
