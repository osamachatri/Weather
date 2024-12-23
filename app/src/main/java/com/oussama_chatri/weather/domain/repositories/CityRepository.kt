package com.oussama_chatri.weather.domain.repositories

import com.oussama_chatri.weather.data.remote.responses.CityResponse
import com.oussama_chatri.weather.domain.models.City
import retrofit2.Response

interface CityRepository {
    suspend fun upsert(city: com.oussama_chatri.weather.data.remote.responses.City)
    suspend fun deleteCityById(id: Int)
    suspend fun getAllCities(): List<City>
    suspend fun getCityById(id: Int): City
    suspend fun searchForCities(namePrefix: String): Response<CityResponse>
}