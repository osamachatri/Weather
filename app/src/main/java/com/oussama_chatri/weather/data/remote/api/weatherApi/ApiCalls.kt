package com.oussama_chatri.weather.data.remote.api.weatherApi

import com.oussama_chatri.weather.BuildConfig
import com.oussama_chatri.weather.data.remote.responses.WeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("v1/forecast.json")
    suspend fun getWeather(
        @Query("key") apiKey: String = BuildConfig.Weather_API_KEY,
        @Query("q") location: String,
        @Query("days") days: Int
    ): Response<WeatherData>
}

