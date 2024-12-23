package com.oussama_chatri.weather.data.repositories

import com.oussama_chatri.weather.data.local.daos.CityDao
import com.oussama_chatri.weather.data.mappers.cityApiToEntity
import com.oussama_chatri.weather.data.mappers.toDomain
import com.oussama_chatri.weather.data.remote.api.citiesApi.CityApiService
import com.oussama_chatri.weather.data.remote.responses.City
import com.oussama_chatri.weather.data.remote.responses.CityResponse
import com.oussama_chatri.weather.domain.repositories.CityRepository
import retrofit2.Response

class CityRepository(private val cityDao: CityDao, private val cityApiService: CityApiService) :
 CityRepository{
    override suspend fun upsert(city: City) = cityDao.upsert(cityApiToEntity(city))

    override suspend fun deleteCityById(id: Int) = cityDao.deleteCityById(id)

    override suspend fun getAllCities(): List<com.oussama_chatri.weather.domain.models.City> =
        cityDao.getAllCities().map {
            it.toDomain()
        }

    override suspend fun getCityById(id: Int): com.oussama_chatri.weather.domain.models.City =
        cityDao.getCityById(id).toDomain()

    override suspend fun searchForCities(namePrefix: String): Response<CityResponse> =
        cityApiService.searchCities(namePrefix = namePrefix)

}