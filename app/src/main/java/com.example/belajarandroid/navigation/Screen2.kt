package com.example.belajarandroid.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.belajarandroid.R

@Composable
fun Screen2(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.kcic),
            contentDescription = "logo_kcic"
        )
        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green,
                contentColor = Color.White
            )
        ) {
            Text(text = "Halo Dinan")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen2Preview() {
    Screen2(rememberNavController())
}