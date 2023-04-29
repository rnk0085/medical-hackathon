package com.example.medicalhackathon.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medicalhackathon.R
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme


@Composable
fun DoctorCommentSection(
    modifier: Modifier = Modifier,
){
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier
                .weight(2f),
            painter = painterResource(id = R.drawable.doctor),
            contentDescription = null,
        )

        // TODO: 吹き出しにする
        // https://qiita.com/yuppejp/items/92429a0fc8440f9da487
        Card(
            shape = RoundedCornerShape(12.dp),
            elevation = 4.dp,
            modifier = Modifier
                .weight(5f),
        ) {
            Text(
                text = "診察超特急さん、こんにちは。\n" +
                        "診察超特急さんは今日から大型連休ですか？\n" +
                        "体調に気をつけてお過ごし下さいね。",
                modifier = Modifier
                    .padding(6.dp),
            )
        }
    }
}

@Preview
@Composable
private fun DoctorCommentSectionPreview() {
    MedicalHackathonTheme {
        DoctorCommentSection()
    }
}
