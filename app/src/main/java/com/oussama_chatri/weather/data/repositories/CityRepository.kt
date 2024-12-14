package com.oussama_chatri.weather.data.repositories

import com.oussama_chatri.weather.data.local.daos.CityDao
import com.oussama_chatri.weather.data.local.entities.City
import com.oussama_chatri.weather.data.remote.api.citiesApi.CityApiService

class CityRepository(private val cityDao: CityDao, private val cityApiService: CityApiService) :
    CityDao {
    override suspend fun upsert(city: City) = cityDao.upsert(city)

    override suspend fun deleteCityById(id: Int) = cityDao.deleteCityById(id)

    override suspend fun getAllCities(): List<City> = cityDao.getAllCities()

    override suspend fun getCityById(id: Int) = cityDao.getCityById(id)

    suspend fun searchForCities(
        namePrefix: String,
    ) = cityApiService.searchCities(
        namePrefix = namePrefix
    )
}