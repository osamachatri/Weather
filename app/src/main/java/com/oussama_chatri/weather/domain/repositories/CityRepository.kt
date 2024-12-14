package com.oussama_chatri.weather.domain.repositories

import com.oussama_chatri.weather.domain.models.City

interface CityRepository {
    suspend fun upsert(city: City)
    suspend fun deleteCityById(id: Int)
    suspend fun getAllCities(): List<City>
    suspend fun getCityById(id: Int): City
    suspend fun searchForCities(namePrefix: String): List<City>
}