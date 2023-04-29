package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicalhackathon.R
import com.example.medicalhackathon.UtilColor.mainColor
import com.example.medicalhackathon.UtilColor.originalGrayColor
import com.example.medicalhackathon.ui.UtilText.hospitalAddress1
import com.example.medicalhackathon.ui.UtilText.hospitalName1
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalDetailScreen(
    modifier: Modifier = Modifier,
    onReservationClick: () -> Unit,
) {
    val startPadding = 20.dp

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
                .padding(innerPaddings),
        ) {
            item {
                Text(
                    text = "所在地",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = startPadding,
                            vertical = 24.dp,
                        ),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
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
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = startPadding,
                            top = 24.dp,
                        ),
                )
            }

            item {
                Text(
                    text = hospitalAddress1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = startPadding,
                            top = 12.dp,
                            bottom = 36.dp,
                        ),
                )
            }

            item {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Button(
                        onClick = onReservationClick,
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.textButtonColors(
                            backgroundColor = mainColor,
                            contentColor = Color.White,
                        ),
                    ) {
                        Text(
                            text = "初診で予約する",
                            modifier = Modifier
                                .padding(horizontal = startPadding),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(12.dp))
            }

            item {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.textButtonColors(
                            backgroundColor = originalGrayColor,
                            contentColor = Color.White,
                        ),
                    ) {
                        Text(
                            text = "再診で予約する",
                            modifier = Modifier
                                .padding(horizontal = startPadding),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HospitalDetailScreenPreview() {
    MedicalHackathonTheme {
        HospitalDetailScreen(
            onReservationClick = {},
        )
    }
}
