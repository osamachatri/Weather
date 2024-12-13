package com.oussama_chatri.weather.presentation.ui.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.oussama_chatri.weather.presentation.ui.theme.WeatherTheme

@Composable
fun MainGraph(modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = MainPaths.WeatherDetails.name) {
        navigation(startDestination = MainPaths.MainInformation.name, route = MainPaths.WeatherDetails.name){
            composable(MainPaths.MainInformation.name){

            }
            composable(MainPaths.MoreDetails.name){

            }
        }

        navigation(startDestination = MainPaths.AllNotification.name,
            route = MainPaths.Notification.name){
            composable(MainPaths.AllNotification.name){

            }
            composable(MainPaths.NotificationDetails.name){

            }
        }
        navigation(startDestination = MainPaths.SavedCities.name,
            route = MainPaths.CityManagement.name){
            composable(MainPaths.SavedCities.name){

            }
            composable(MainPaths.AddCity.name){

            }
            composable(MainPaths.SearchForCity.name){

            }
        }
        composable(MainPaths.Settings.name){

        }
    }
}

@Preview
@Composable
private fun MainGraphPreview() {
    WeatherTheme {
        MainGraph()
    }
}

enum class MainPaths{
    WeatherDetails,
    MainInformation,
    MoreDetails,
    Notification,
    AllNotification,
    NotificationDetails,
    Settings,
    CityManagement,
    SavedCities,
    AddCity,
    SearchForCity
}