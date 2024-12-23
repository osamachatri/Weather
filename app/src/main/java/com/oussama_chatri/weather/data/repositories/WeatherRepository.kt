package com.oussama_chatri.weather.data.repositories

import com.oussama_chatri.weather.data.local.daos.WeatherDao
import com.oussama_chatri.weather.data.mappers.weatherApiToEntity
import com.oussama_chatri.weather.data.mappers.toDomainModel
import com.oussama_chatri.weather.data.remote.api.weatherApi.WeatherApiService
import com.oussama_chatri.weather.data.remote.responses.WeatherData
import com.oussama_chatri.weather.domain.models.Weather
import com.oussama_chatri.weather.domain.repositories.WeatherRepository
import retrofit2.Response

class WeatherRepositoryImpl (
    private val apiService: WeatherApiService,
    private val weatherDao: WeatherDao,
) : WeatherRepository {
    override suspend fun saveWeather(weather: WeatherData) = weatherDao.upsertWeather(
        weatherApiToEntity(weather)
    )

    override suspend fun deleteWeatherById(id: Int) = weatherDao.deleteWeatherById(id)

    override suspend fun getAllWeatherData(): List<Weather> = weatherDao.getAllWeatherData().map {
        it.toDomainModel()!!
    }

    override suspend fun getWeatherByCityId(id: Int): Weather? = weatherDao.getDataOfCityById(id)?.toDomainModel()

    override suspend fun deleteAllWeatherData() = weatherDao.deleteAllWeatherData()

    override suspend fun fetchWeatherFromApi(location: String, days: Int) : Response<WeatherData> = apiService.getWeather(location = location, days = days)
}