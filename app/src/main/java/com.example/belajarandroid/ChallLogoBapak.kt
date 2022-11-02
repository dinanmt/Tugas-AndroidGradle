package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ChallLogoBapak : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeLogoBapak {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.text_kai),
                description = stringResource(R.string.text_kai2),
                backgroundColor = Color(0xFFe0091f),
                modifier = Modifier.weight(1f),
                image = R.drawable.kai
            )
            ComposableInfoCard(
                title = stringResource(R.string.text_kcic),
                description = stringResource(R.string.text_kcic2),
                backgroundColor = Color(0xFF388518),
                modifier = Modifier.weight(1f),
                image = R.drawable.kcic
            )
            ComposableInfoCard(
                title = stringResource(R.string.text_krl),
                description = stringResource(R.string.text_krl2),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f),
                image = R.drawable.krl
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.text_mrt),
                description = stringResource(R.string.text_mrt2),
                backgroundColor = Color(0xfff7521b) ,
                modifier = Modifier.weight(1f),
                image = R.drawable.mrt
            )
            ComposableInfoCard(
                title = stringResource(R.string.text_lrt),
                description = stringResource(R.string.text_lrt2),
                backgroundColor = Color(0xfff57fd4),
                modifier = Modifier.weight(1f),
                image = R.drawable.lrt
            )
            ComposableInfoCard(
                title = stringResource(R.string.text_railink),
                description = stringResource(R.string.text_railink2),
                backgroundColor = Color(0xfff7bd48),
                modifier = Modifier.weight(1f),
                image = R.drawable.railink
            )
        }

    }
}

// weight issue : https://stackoverflow.com/questions/64751198/column-weight-distribution-in-compose

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier,
    image: Int
)
    {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = image),
                contentDescription = "Logo KAI",
                modifier = Modifier
                    .padding(8.dp)
                    .size(90.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Black, CircleShape)
            )
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 2.dp),
            )
            Text(
                text = description,
                textAlign = TextAlign.Center
            )
        }
    }

@Preview(showBackground = true)
@Composable
fun ContohBirthdayCard() {
    ChallengeLogoBapak {
        ComposeQuadrantApp()
    }
}
