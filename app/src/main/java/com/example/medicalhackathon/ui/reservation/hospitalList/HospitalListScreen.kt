package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.UtilText.hospitalAddress1
import com.example.medicalhackathon.ui.UtilText.hospitalName1
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalListScreen(
    modifier: Modifier = Modifier,
    onListTileClick: () -> Unit,
){
    LazyColumn(
        modifier = modifier.fillMaxSize(),
    ) {
        item {
            HospitalListTile(
                hospitalUiState = HospitalUiState(
                    name = hospitalName1,
                    address = hospitalAddress1,
                ),
                onListTileClick = onListTileClick,
            )
        }

        val hospitalUiStateList = List(100) { num ->
            HospitalUiState(
                name = "病院タイトル: $num",
                address = "病院住所: $num",
            )
        }

        items(hospitalUiStateList.count()) {index ->
            HospitalListTile(
                hospitalUiState = hospitalUiStateList[index],
                onListTileClick = onListTileClick,
            )
        }
    }
}

@Preview
@Composable
private fun HospitalListScreenPreview() {
    MedicalHackathonTheme {
        HospitalListScreen(
            onListTileClick = {},
        )
    }
}
