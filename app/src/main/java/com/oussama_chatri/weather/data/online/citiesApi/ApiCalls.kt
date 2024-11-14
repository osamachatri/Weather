package com.oussama_chatri.weather.data.online.citiesApi

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
        @Header("X-RapidAPI-Key") apiKey: String = "e1f7e5104emshecdedc5d7d53a77p1cff73jsna3a2a0fd4fe4",
        @Header("X-RapidAPI-Host") host: String = "wft-geo-db.p.rapidapi.com"
    ): Response<CityResponse>
}