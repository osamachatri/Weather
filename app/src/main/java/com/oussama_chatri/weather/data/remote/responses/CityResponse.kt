package com.oussama_chatri.weather.data.remote.responses



data class CityResponse(
    val data: List<City>
)

data class City(
    val id: Int,
    val name: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val population: Int
)