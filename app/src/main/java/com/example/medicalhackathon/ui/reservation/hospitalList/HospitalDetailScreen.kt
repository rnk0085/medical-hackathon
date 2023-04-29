package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.R
import com.example.medicalhackathon.ui.UtilText.hospitalAddress1
import com.example.medicalhackathon.ui.UtilText.hospitalName1
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalDetailScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = hospitalName1,
                )
            )
        }
    ) { innerPaddings ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings)
                .padding(horizontal = 10.dp),
        ) {
            item {
                Text(
                    text = "所在地",
                )
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                )
            }

            item {
                Text(
                    text = "〒120-0015",
                )
            }

            item {
                Text(
                    text = hospitalAddress1,
                )
            }

            item {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "初診で予約する",
                        modifier = Modifier
                            .size(height = 48.dp, width = 200.dp)
                            .clip(
                                RoundedCornerShape(16.dp)
                            )
                            .background(Color.Red)
                            .clickable(
                                onClick = { /* TODO */ }
                            ),
                        textAlign = TextAlign.Center,
                    )
                }
            }

            item {
                Text(
                    text = "再診で予約する"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HospitalDetailScreenPreview() {
    MedicalHackathonTheme {
        HospitalDetailScreen()
    }
}
