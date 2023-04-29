package com.example.medicalhackathon.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HackathonTopAppBar(
    hackathonTopAppBarUiState: HackathonTopAppBarUiState,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = hackathonTopAppBarUiState.title,
                color = Color.Black,
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.White,
        ),
        navigationIcon = {
            hackathonTopAppBarUiState.navigationIcon?.let { topAppBarIcon ->
                IconButton(onClick = topAppBarIcon.iconClicked) {
                    Icon(
                        topAppBarIcon.icon,
                        null,
                    )
                }
            }
        },
        actions = {
            hackathonTopAppBarUiState.actionsIcon?.let { topAppBarIcon ->
                IconButton(onClick = topAppBarIcon.iconClicked) {
                    Icon(
                        topAppBarIcon.icon,
                        null,
                    )
                }
            }
        },
    )
}

data class HackathonTopAppBarUiState(
    val title: String = "デフォルト",
    val navigationIcon: TopAppBarIcon? = null,
    val actionsIcon: TopAppBarIcon? = null,
)

data class TopAppBarIcon(
    val icon: ImageVector,
    val iconClicked: () -> Unit,
)

@Preview
@Composable
private fun HackathonTopAppBarPreview() {
    MedicalHackathonTheme {
        HackathonTopAppBar(
            hackathonTopAppBarUiState = HackathonTopAppBarUiState(),
        )
    }
}
