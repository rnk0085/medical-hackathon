package com.example.medicalhackathon.ui.reservation

import android.app.DatePickerDialog
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicalhackathon.UtilColor
import com.example.medicalhackathon.UtilColor.mainColor
import com.example.medicalhackathon.UtilPadding
import com.example.medicalhackathon.ui.common.HackathonTopAppBar
import com.example.medicalhackathon.ui.common.HackathonTopAppBarUiState
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ReservationSecondScreen(
    onSubmitClick: () -> Unit,
){
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
                    text = "症状はいつからですか？",
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

            // https://www.geeksforgeeks.org/date-picker-in-android-using-jetpack-compose/
            item {
                // Fetching the Local Context
                val mContext = LocalContext.current

                val mYear: Int
                val mMonth: Int
                val mDay: Int

                val mCalendar = Calendar.getInstance()

                mYear = mCalendar.get(Calendar.YEAR)
                mMonth = mCalendar.get(Calendar.MONTH)
                mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

                mCalendar.time = Date()

                val mDate = remember { mutableStateOf("") }
                val year = remember { mutableStateOf("2023") }
                val month = remember { mutableStateOf("4") }
                val day = remember { mutableStateOf("30") }

                val mDatePickerDialog = DatePickerDialog(
                    mContext,
                    { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
//                        mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
                        mDate.value = "$mYear/${mMonth+1}/$mDayOfMonth"
                        year.value = "$mYear"
                        month.value = "${mMonth+1}"
                        day.value = "$mDayOfMonth"
                    }, mYear, mMonth, mDay
                )

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick = { mDatePickerDialog.show() },
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(
                            width = 2.dp,
                            color = UtilColor.mainColor,
                        ),
                        colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black,
                        ),
                    ) {
                        Text(
                            text = "${year.value}/${month.value}/${day.value}",
                            modifier = Modifier
                                .padding(horizontal = UtilPadding.startPadding),
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }

            item {
                Text(
                    text = "どんな治療を希望しますか？",
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
                var text by remember { mutableStateOf("") }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        placeholder = { Text("入力してください") },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = mainColor,
                        )
                    )
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
                        onClick = onSubmitClick,
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.textButtonColors(
                            backgroundColor = UtilColor.mainColor,
                            contentColor = Color.White,
                        ),
                    ) {
                        Text(
                            text = "送信",
                            modifier = Modifier
                                .padding(horizontal = UtilPadding.startPadding),
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

@Preview
@Composable
private fun ReservationSecondScreenPreview() {
    MedicalHackathonTheme {
        ReservationSecondScreen(
            onSubmitClick = {},
        )
    }
}
