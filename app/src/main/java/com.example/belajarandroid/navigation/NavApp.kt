package com.example.belajarandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoute.Screen_1.name

    ) {
        composable("Screen_1") {
            Screen1(navController)
        }
        composable("Screen_2") {
            Screen2(navController)
        }
    }

}