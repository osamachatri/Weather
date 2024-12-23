package com.oussama_chatri.weather.data.local.daos

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.oussama_chatri.weather.data.local.entities.WeatherData

@Dao
interface WeatherDao {

    @Upsert
    suspend fun upsertWeather(weatherData: WeatherData)

    @Query("delete from weather_data where id = :id")
    suspend fun deleteWeatherById(id: Int)

    @Query("SELECT * FROM weather_data")
    suspend fun getAllWeatherData(): List<WeatherData>

    @Query("SELECT * FROM weather_data where id = :id")
    suspend fun getDataOfCityById(id: Int): WeatherData?

    @Query("DELETE FROM weather_data")
    suspend fun deleteAllWeatherData()

}

