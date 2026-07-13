package com.example.stationerystar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation () {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splashscreen")
    {
        composable("splashscreen") {
//            SplashScreen(navController)
        }
        composable("mainscreen") {
//            MainScreen()
        }
        composable("loginscreen") {
        }
        composable("register_screen") {
        }
        composable("homescreen") {
        }

        composable ("settings") {

        }
    }
}