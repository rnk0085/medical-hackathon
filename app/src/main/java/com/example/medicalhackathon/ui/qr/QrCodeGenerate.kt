package com.example.medicalhackathon.ui.qr

import android.graphics.Bitmap
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalhackathon.ui.theme.MedicalHackathonTheme
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder

// https://qiita.com/kazuma_f/items/2b37411e3ededfeefbfd
@Composable
fun QrCodeGenerate(
    url: String,
    size: Int,
) {
    var bitmap: Bitmap? = null

    try {
        val barcodeEncoder = BarcodeEncoder()
        bitmap = barcodeEncoder.encodeBitmap(url, BarcodeFormat.QR_CODE, size, size)
    } catch (e: Exception) {
        Log.e("TAG", "error")
    }

    if (bitmap != null) {
        Image(
            bitmap.asImageBitmap(),
            contentDescription = "content description",
        )
    }
}

@Preview
@Composable
private fun QrCodeGenerateScreen() {
    MedicalHackathonTheme {
        QrCodeGenerate(
            url = "https://moicen-forest.connpass.com/event/277791/",
            size = 300,
        )
    }
}
