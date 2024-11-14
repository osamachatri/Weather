package com.oussama_chatri.weather.ui.graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oussama_chatri.weather.presentation.ui.screens.HomeScreen

@Composable
fun MainGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = paths.Home.name) {
        composable(paths.Home.name) {
            HomeScreen()
        }
        composable(paths.Notification.name) {

        }
        composable(paths.AddCity.name) {
//            AddCityScreen(navController)
        }
        composable(paths.Settings.name) {

        }
        composable(paths.AnOtherDayDetails.name) {

        }
    }
}


enum class paths{
    Home,
    Notification,
    AddCity,
    Settings,
    AnOtherDayDetails
}