package com.oussama_chatri.weather.di

import android.content.Context
import com.oussama_chatri.weather.data.local.daos.CityDao
import com.oussama_chatri.weather.data.local.daos.WeatherDao
import com.oussama_chatri.weather.data.local.db.WeatherDatabase
import com.oussama_chatri.weather.data.remote.api.citiesApi.CityApiService
import com.oussama_chatri.weather.data.remote.api.citiesApi.CityService
import com.oussama_chatri.weather.data.remote.api.weatherApi.WeatherApiService
import com.oussama_chatri.weather.data.remote.api.weatherApi.WeatherService
import com.oussama_chatri.weather.data.repositories.CityRepositoryImp
import com.oussama_chatri.weather.data.repositories.WeatherRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun getWeatherApiService() : WeatherApiService{
        return WeatherService.instance
    }

    @Provides
    @Singleton
    fun getCityApiService() : CityApiService{
        return CityService.api
    }

    @Provides
    @Singleton
    fun getWeatherDao(@ApplicationContext context: Context) : WeatherDao{
        return WeatherDatabase.getDatabase(context).weatherDao()
    }

    @Provides
    @Singleton
    fun getCityDao(@ApplicationContext context: Context) : CityDao {
        return WeatherDatabase.getDatabase(context).cityDao()
    }

    @Provides
    @Singleton
    fun getWeatherRepository(apiService: WeatherApiService, weatherDao: WeatherDao) : WeatherRepositoryImpl {
        return WeatherRepositoryImpl(apiService, weatherDao)
    }

    @Provides
    @Singleton
    fun getCityRepository(apiService: CityApiService, cityDao: CityDao) : CityRepositoryImp {
        return CityRepositoryImp(cityDao, apiService)
    }
}