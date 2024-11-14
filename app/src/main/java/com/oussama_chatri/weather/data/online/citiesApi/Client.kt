package com.oussama_chatri.weather.data.online.citiesApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    val api: CityApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://wft-geo-db.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CityApiService::class.java)
    }
}