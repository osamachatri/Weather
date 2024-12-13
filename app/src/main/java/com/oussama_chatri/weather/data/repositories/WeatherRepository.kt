package com.oussama_chatri.weather.data.repositories

import com.oussama_chatri.weather.data.local.daos.WeatherDao
import com.oussama_chatri.weather.data.local.entities.WeatherData
import com.oussama_chatri.weather.data.remote.api.weatherApi.WeatherApiService

class WeatherRepository(
    private val weatherDao: WeatherDao,
    private val weatherApiService: WeatherApiService
) : WeatherDao {
    override suspend fun upsertWeather(weatherData: WeatherData) =
        weatherDao.upsertWeather(weatherData)

    override suspend fun deleteWeather(weatherData: WeatherData) =
        weatherDao.deleteWeather(weatherData)

    override suspend fun getAllWeatherData(): List<WeatherData> = weatherDao.getAllWeatherData()

    override suspend fun getDataOfCityById(id: Int): WeatherData = weatherDao.getDataOfCityById(id)

    override suspend fun deleteAllWeatherData() = weatherDao.deleteAllWeatherData()

    suspend fun syncWeather(
        location: String,
        days: Int
    ) = weatherApiService.getWeather(
        location = location,
        days = days
    )

}