package com.example.medicalhackathon.ui.common

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme

@Composable
fun HackathonTopAppBar(
    hackathonTopAppBarUiState: HackathonTopAppBarUiState,
) {
    TopAppBar(
        elevation = 4.dp,
        title = {
            // TODO: センタリングしたい
            Text(
                text = hackathonTopAppBarUiState.title,
                textAlign = TextAlign.Center,
            )
        },
        backgroundColor =  MaterialTheme.colors.primarySurface,
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
