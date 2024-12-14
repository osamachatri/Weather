package com.oussama_chatri.weather.data.local.daos

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.oussama_chatri.weather.data.local.entities.City

@Dao
interface CityDao{

    @Upsert
    suspend fun upsert(city : City)

    @Query("delete from cities where id = :id")
    suspend fun deleteCityById(id : Int)

    @Query("select * from cities")
    suspend fun getAllCities() : List<City>

    @Query("select * from cities where id = :id")
    suspend fun getCityById(id : Int)

}