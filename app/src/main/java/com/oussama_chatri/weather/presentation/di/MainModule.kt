package com.oussama_chatri.weather.presentation.di

import android.content.Context
import com.oussama_chatri.weather.data.offline.dbs.WeatherDatabase
import com.oussama_chatri.weather.data.offline.repositories.WeatherRepository
import com.oussama_chatri.weather.data.settings.SettingsOfApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Main {

    @Provides
    @Singleton
    fun getSettings(@ApplicationContext context: Context) : SettingsOfApp {
        return SettingsOfApp(context)
    }

    @Provides
    @Singleton  // Use @Singleton scope
    fun provideWeatherRepository(@ApplicationContext context: Context): WeatherRepository {
        return WeatherRepository(WeatherDatabase.getDatabase(context).weatherDao())
    }

}