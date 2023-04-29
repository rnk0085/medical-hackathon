package com.example.medicalhackathon.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicalhackathon.UtilColor.mainColor
import com.example.medicalhackathon.ui.UtilText.hospitalName1
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HomeCardSection(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    leftText: String,
    rightText: String,
    mainText: String,
    isReservation: Boolean,
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = backgroundColor,
            )
            .clickable(
                onClick = { /* TODO */ },
            ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = leftText,
                color = Color.White,
                fontSize = 16.sp,
            )

            Text(
                text = rightText,
                color = Color.White,
                fontSize = 16.sp,
            )
        }

        Text(
            text = mainText,
            color = Color.White,
            fontSize = if (isReservation) 48.sp else 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun ReservationSectionPreview() {
    MedicalHackathonTheme {
        HomeCardSection(
            backgroundColor = mainColor,
            leftText = "次回予約",
            rightText = hospitalName1,
            mainText = "5/2(火) 14:00",
            isReservation = true,
        )
    }
}
