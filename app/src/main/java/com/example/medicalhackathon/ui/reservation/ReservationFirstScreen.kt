package com.example.medicalhackathon.ui.reservation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicalhackathon.UtilColor
import com.example.medicalhackathon.UtilPadding.startPadding
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState

/**
 * 初診予約：その1
 */
@Composable
fun ReservationFirstScreen(){
    Scaffold(
        topBar = {
            HackathonTopAppBar(
                hackathonTopAppBarUiState = HackathonTopAppBarUiState(
                    title = "初診予約",
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
                    text = "本日はどうなさいましたか？",
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
                var chackedState1 by remember { mutableStateOf(false) }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp),
                ) {
                    Checkbox(
                        checked = chackedState1,
                        onCheckedChange = {
                            chackedState1 = it
                        },
                    )
                    Text(
                        text = "熱",
                    )
                }
            }


            item {
                var chackedState2 by remember { mutableStateOf(false) }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp),
                ) {
                    Checkbox(
                        checked = chackedState2,
                        onCheckedChange = {
                            chackedState2 = it
                        },
                    )
                    Text(
                        text = "鼻水・鼻詰まり",
                    )
                }
            }


            item {
                var chackedState3 by remember { mutableStateOf(false) }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp),
                ) {
                    Checkbox(
                        checked = chackedState3,
                        onCheckedChange = {
                            chackedState3 = it
                        },
                    )
                    Text(
                        text = "咳・たん",
                    )
                }
            }

            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp),
                ) {
                    Checkbox(
                        checked = checkedState,
                        onCheckedChange = {
                            checkedState = it
                            showDropdown = it
                        },
                    )
                    Text(
                        text = "痛い",
                    )
                }


                val checkboxItems = listOf("頭", "のど", "お腹")
                val checkedItems = remember { mutableStateListOf<Boolean>() }
                for (i in 0 until checkboxItems.size) {
                    checkedItems.add(false)
                }

                if (checkedState) {
                    checkboxItems.forEachIndexed { index, text ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(8.dp)
                                .padding(start = 16.dp),
                        ) {
                            Checkbox(
                                checked = checkedItems[index],
                                onCheckedChange = {
                                    checkedItems[index] = it
                                },
                            )
                            Text(
                                text = text,
                            )
                        }
                    }
                }
            }

            item {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Button(
                        onClick = { /* TODO */ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.textButtonColors(
                            backgroundColor = UtilColor.mainColor,
                            contentColor = Color.White,
                        ),
                    ) {
                        Text(
                            text = "次へ",
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
