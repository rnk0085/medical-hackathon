package com.example.medicalhackathon.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.R
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

        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings),
            painter = painterResource(id = R.drawable.doctor),
            contentDescription = null,
        )
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MedicalHackathonTheme {
        HomeScreen()
    }
}
