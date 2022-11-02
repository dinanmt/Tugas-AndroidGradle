package com.example.belajarandroid

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ChallLogoWarna : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showChallLogoWarna()
        }
    }
}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showChallLogoWarna() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
//                color = Color(0xffDC052D),
                color = colorResource(id = R.color.red2),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kai),
                        contentDescription = "Logo KAI",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
                        //text = "KAI",
                        text = stringResource(R.string.text_kai),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                      text = "Kereta Api Indonesia",
                        text = stringResource(R.string.text_kai2),
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
//                color = Color(0xff00FF00),
                color = colorResource(id = R.color.green),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kcic),
                        contentDescription = "Logo KCIC",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
//                        text = "KCIC",
                        text = stringResource(R.string.text_kcic),
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                        text = "Kereta Cepat Indonesia Cina",
                        text = stringResource(R.string.text_kcic2),
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
//                color = Color(0xffFFFF00),
                color = colorResource(id = R.color.yellow),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.krl),
                        contentDescription = "Logo KRL",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
//                        text = "KRL",
                        text = stringResource(R.string.text_krl),
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                        text = "Kereta Rel Listrik",
                        text = stringResource(R.string.text_krl2),
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
//                color = Color(0xff004D98),
                color = colorResource(id = R.color.bluedark),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lrt),
                        contentDescription = "Logo LRT",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
//                        text = "LRT",
                        text = stringResource(R.string.text_lrt),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                        text = "Light Rail Transit",
                        text = stringResource(R.string.text_lrt2),
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
//                color = Color(0xff6CABDD),
                color = colorResource(id = R.color.bluelight),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mrt),
                        contentDescription = "Logo MRT",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
//                        text = "MRT",
                        text = stringResource(R.string.text_mrt),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                        text = "Mass Rapid Transit",
                        text = stringResource(R.string.text_mrt2),
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
//                color = Color(0xffA020F0),
                color = colorResource(id = R.color.purple),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.railink),
                        contentDescription = "Logo Railink",
                        alignment = Alignment.Center,
//                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape)
                    )
                    Text(
//                        text = "Railink",
                        text = stringResource(R.string.text_railink),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
//                        text = "KAI Bandara",
                        text = stringResource(R.string.text_railink2),
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
