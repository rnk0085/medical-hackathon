package com.example.medicalhackathon.ui.edit

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun EditScreen(){
    Text(text = "EditScreen")
}

@Preview
@Composable
private fun EditScreenPreview() {
    MedicalHackathonTheme {
        EditScreen()
    }
}
