package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaHitam = Color(0xff000000)
        val merah = 0xffff0000

        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)

            ) {

                Image(
                    painter = painterResource(id = R.drawable.wp10514716_kereta_api_indonesia_wallpapers),
                    contentDescription = "Gambar"
                )

                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Naik Kereta Apiii",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp, 16.dp, 4.dp),
                        color =  warnaHitam,
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color.Green,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "TUT TUT TUTTTT",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                        color = Color(merah),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}