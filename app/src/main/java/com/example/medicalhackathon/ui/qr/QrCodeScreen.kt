package com.example.medicalhackathon.ui.qr

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun QrCodeScreen(){
    Text(text = "QrCodeScreen")
}

@Preview
@Composable
private fun QrCodeScreenPreview() {
    MedicalHackathonTheme {
        QrCodeScreen()
    }
}
