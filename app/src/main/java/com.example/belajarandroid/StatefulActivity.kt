package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField

import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class StatefulActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EchoText()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText() {
    //var displayedText = "Polban"
    var displayedText by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (displayedText.isNotEmpty()) {
            Text(
                //text = "hallo DEK"
                text = "Hello " + displayedText
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(value = displayedText, onValueChange = {
            displayedText = it
        },
            label = { Text(text = "NAMA") }
        )

    }
    Text(text = "Hallo DEK")
    OutlinedTextField(value = "Default Value", onValueChange = {})
}