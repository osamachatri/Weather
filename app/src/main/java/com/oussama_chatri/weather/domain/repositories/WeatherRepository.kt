package com.oussama_chatri.weather.domain.repositories

import com.oussama_chatri.weather.domain.models.Weather

interface WeatherRepository {
    suspend fun saveWeather(weather: Weather)
    suspend fun deleteWeatherById(id: Int)
    suspend fun getAllWeatherData(): List<Weather>
    suspend fun getWeatherByCityId(id: Int): Weather
    suspend fun deleteAllWeatherData()
    suspend fun fetchWeatherFromApi(location: String, days: Int): Weather
}
