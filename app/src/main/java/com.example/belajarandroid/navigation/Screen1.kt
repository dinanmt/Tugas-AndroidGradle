package com.example.belajarandroid.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.belajarandroid.R

@Composable
fun Screen1(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.mrt),
            contentDescription = "logo_kai"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate(NavRoute.Screen_2.name) }) {
            Text(text = "Kerjain Proposal woyy Dinan")

        }

    }


}

@Preview(showSystemUi = true)
@Composable
fun Screen1Preview() {
    Screen1(rememberNavController())
}
       
