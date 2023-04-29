package com.example.medicalhackathon.ui.reservation.hospitalList

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.R
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HospitalListTile(
    hospitalUiState: HospitalUiState,
    onListTileClick: () -> Unit,
    modifier: Modifier = Modifier,
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
            .clickable(
                onClick = onListTileClick,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = null,
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Crop,
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp),
        ) {
            Text(
                text = hospitalUiState.name,
                fontWeight = FontWeight.Bold,
            )
            
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = hospitalUiState.address,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HospitalListTilePreview() {
    MedicalHackathonTheme {
        HospitalListTile(
            hospitalUiState = HospitalUiState.Initial,
            onListTileClick = {},
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

data class HospitalUiState(
    val name: String,
    val address: String,
) {
    companion object {
        val Initial = HospitalUiState(
            name = "足立慶友整形外科",
            address = "東京都足立区足立１丁目１２−１２ メディカルモール ３階",
        )
    }
}
