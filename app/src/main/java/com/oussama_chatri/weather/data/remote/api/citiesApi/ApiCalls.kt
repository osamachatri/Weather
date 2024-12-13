package com.oussama_chatri.weather.data.remote.api.citiesApi

import com.oussama_chatri.weather.BuildConfig
import com.oussama_chatri.weather.data.remote.responses.CityResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CityApiService {
    @GET("v1/geo/cities")
    suspend fun searchCities(
        @Query("namePrefix") namePrefix: String,
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 0,
        @Header("X-RapidAPI-Key") apiKey: String = BuildConfig.City_APi_Key,
        @Header("X-RapidAPI-Host") host: String = "wft-geo-db.p.rapidapi.com"
    ): Response<CityResponse>
}