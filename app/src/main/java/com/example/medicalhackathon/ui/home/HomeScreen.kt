package com.example.medicalhackathon.ui.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HomeScreen(){
    Text(text = "HomeScreen")
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MedicalHackathonTheme {
        HomeScreen()
    }
}
