package com.example.medicalhackathon.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.UtilColor.mainColor
import com.example.medicalhackathon.UtilColor.originalGrayColor
import com.example.medicalhackathon.ui.UtilText
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HomeScreen(){
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = "ホーム",
                )
            )
        }
    ) { innerPaddings ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings),
        ) {
            item {
                DoctorCommentSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                )
            }

            item {
                HomeCardSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 8.dp,
                            vertical = 16.dp,
                        ),
                    backgroundColor = mainColor,
                    leftText = "次回予約",
                    rightText = UtilText.hospitalName1,
                    mainText = UtilText.reservationDate1,
                    isReservation = true,
                )
            }

            item {
                HomeCardSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 8.dp,
                        ),
                    backgroundColor = originalGrayColor,
                    leftText = "今日のお薬",
                    rightText = "",
                    mainText = "レボフロキサシン500mg \n" +
                            "1回1錠 朝食後",
                    isReservation = false,
                )
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MedicalHackathonTheme {
        HomeScreen()
    }
}
