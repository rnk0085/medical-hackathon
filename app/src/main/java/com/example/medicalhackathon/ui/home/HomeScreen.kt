package com.example.medicalhackathon.ui.home

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
        Text(
            text = "HomeScreen",
            modifier = Modifier.fillMaxSize().padding(innerPaddings),
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
