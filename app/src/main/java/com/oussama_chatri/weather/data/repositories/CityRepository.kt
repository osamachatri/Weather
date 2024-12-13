package com.oussama_chatri.weather.data.repositories

import com.oussama_chatri.weather.data.local.daos.CityDao
import com.oussama_chatri.weather.data.local.entities.City
import com.oussama_chatri.weather.data.remote.api.citiesApi.CityApiService

class CityRepository(private val cityDao: CityDao, private val cityApiService: CityApiService) :
    CityDao {
    override suspend fun upsert(city: City) = cityDao.upsert(city)

    override suspend fun delete(city: City) = cityDao.delete(city)

    override suspend fun getAllCities(): List<City> = cityDao.getAllCities()

    suspend fun searchForCities(
        namePrefix: String,
    ) = cityApiService.searchCities(
        namePrefix = namePrefix
    )
}