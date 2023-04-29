package com.example.medicalhackathon.ui.mypage

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun MyPageScreen(){
    Text(text = "MyPageScreen")
}

@Preview
@Composable
private fun MyPageScreenPreview() {
    MedicalHackathonTheme {
        MyPageScreen()
    }
}
