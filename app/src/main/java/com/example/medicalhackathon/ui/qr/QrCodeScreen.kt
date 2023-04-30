package com.example.medicalhackathon.ui.qr

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicalhackathon.UtilPadding
import com.example.medicalhackathon.ui.UtilText
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun QrCodeScreen(){
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = "予約の表示",
                )
            )
        }
    ) { innerPaddings ->

        var showDropdown by remember { mutableStateOf(false) }
        var checkedState by remember { mutableStateOf(false) }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp)
                .padding(innerPaddings),
        ) {
            item {
                Text(
                    text = "予約詳細QRコード",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = UtilPadding.startPadding,
                            vertical = 24.dp,
                        ),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            item {
                // TODO
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ){
                    QrCodeGenerate(
                        url = "https://moicen-forest.connpass.com/event/277791/",
                        size = 800,
                    )
                }
            }

            item {
                Text(
                    text = "予約詳細",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = UtilPadding.startPadding,
                            vertical = 24.dp,
                        ),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            item {
                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = UtilPadding.startPadding,
                        ),
                ) {
                    Text(text = "病院名: ${UtilText.hospitalName1}")
                    Text(text = "住所: ${UtilText.hospitalAddress1}")
                    Text(text = "日時: ${UtilText.reservationDate1}")
                }
            }
        }
    }
}

@Preview
@Composable
private fun QrCodeScreenPreview() {
    MedicalHackathonTheme {
        QrCodeScreen()
    }
}
