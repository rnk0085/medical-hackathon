package com.example.medicalhackathon.ui.qr

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun QrCodeScreen(){
//    Text(text = "QrCodeScreen")

    // TODO
    QrCodeGenerate(
        url ="https://moicen-forest.connpass.com/event/277791/",
        size = 300,
    )
}

@Preview
@Composable
private fun QrCodeScreenPreview() {
    MedicalHackathonTheme {
        QrCodeScreen()
    }
}
