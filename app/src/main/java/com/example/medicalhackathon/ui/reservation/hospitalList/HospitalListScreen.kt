package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalListScreen(){
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        val hospitalUiStateList = List(100) { num ->
            HospitalUiState(
                name = "病院タイトル: $num",
                address = "病院住所: $num",
            )
        }
        items(hospitalUiStateList.count()) {index ->
            HospitalListTile(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp),
                hospitalUiState = hospitalUiStateList[index],
            )
        }
    }
}

@Preview
@Composable
private fun HospitalListScreenPreview() {
    MedicalHackathonTheme {
        HospitalListScreen()
    }
}
