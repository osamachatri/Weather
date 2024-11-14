package com.oussama_chatri.weather.data.offline.repositories

import com.oussama_chatri.weather.data.offline.daos.CityDao
import com.oussama_chatri.weather.data.offline.tables.City

class CitiesRepository(private val cityDao: CityDao) : CityDao {
    override suspend fun upsert(city: City) = cityDao.upsert(city)

    override suspend fun delete(city: City) = cityDao.delete(city)

    override suspend fun getAllCities(): List<City> = cityDao.getAllCities()
}