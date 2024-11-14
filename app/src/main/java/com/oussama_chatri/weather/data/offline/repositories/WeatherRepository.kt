package com.oussama_chatri.weather.data.offline.repositories

import com.oussama_chatri.weather.data.offline.daos.WeatherDao
import com.oussama_chatri.weather.data.offline.tables.WeatherData

class WeatherRepository (private val weatherDao: WeatherDao) : WeatherDao {
    override suspend fun upsertWeather(weatherData: WeatherData) = weatherDao.upsertWeather(weatherData)

    override suspend fun deleteWeather(weatherData: WeatherData) = weatherDao.deleteWeather(weatherData)

    override suspend fun getAllWeatherData(): List<WeatherData> = weatherDao.getAllWeatherData()

    override suspend fun getTheWeatherOfCity(cityName: String): WeatherData = weatherDao.getTheWeatherOfCity(cityName)

    override suspend fun deleteAllWeatherData() = weatherDao.deleteAllWeatherData()
}