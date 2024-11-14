package com.oussama_chatri.weather.presentation.di

import android.content.Context
import com.oussama_chatri.weather.data.offline.dbs.WeatherDatabase
import com.oussama_chatri.weather.data.offline.repositories.CitiesRepository
import com.oussama_chatri.weather.data.online.citiesApi.RetrofitInstance
import com.oussama_chatri.weather.data.online.weatherApi.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelScoped{

    @Provides
    @ViewModelScoped
    fun getCitiesRepository(@ApplicationContext context: Context) : CitiesRepository
            = CitiesRepository(WeatherDatabase.getDatabase(context).cityDao())

    @Provides
    @ViewModelScoped
    fun getRetrofitInstance() : RetrofitInstance = RetrofitInstance

    @Provides
    @ViewModelScoped
    fun getRetrofitClient() : RetrofitClient = RetrofitClient

    @Provides
    @ViewModelScoped
    fun getContext (@ApplicationContext context: Context) : Context = context

}