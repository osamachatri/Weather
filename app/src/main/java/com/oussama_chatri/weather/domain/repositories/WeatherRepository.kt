package com.oussama_chatri.weather.domain.repositories

import com.oussama_chatri.weather.data.remote.responses.WeatherData
import com.oussama_chatri.weather.domain.models.Weather
import retrofit2.Response

interface WeatherRepository {
    suspend fun saveWeather(weather: WeatherData)
    suspend fun deleteWeatherById(id: Int)
    suspend fun getAllWeatherData(): List<Weather>
    suspend fun getWeatherByCityId(id: Int): Weather?
    suspend fun deleteAllWeatherData()
    suspend fun fetchWeatherFromApi(location: String, days: Int): Response<WeatherData>
}
