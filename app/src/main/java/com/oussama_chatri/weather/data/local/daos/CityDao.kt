package com.oussama_chatri.weather.data.local.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.oussama_chatri.weather.data.local.entities.City

@Dao
interface CityDao{

    @Upsert
    suspend fun upsert(city : City)

    @Delete
    suspend fun delete(city : City)

    @Query("select * from cities")
    suspend fun getAllCities() : List<City>

}