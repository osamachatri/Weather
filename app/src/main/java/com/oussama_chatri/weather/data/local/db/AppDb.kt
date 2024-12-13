package com.oussama_chatri.weather.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.oussama_chatri.weather.data.local.converters.ConverterOfLists
import com.oussama_chatri.weather.data.local.daos.CityDao
import com.oussama_chatri.weather.data.local.daos.WeatherDao
import com.oussama_chatri.weather.data.local.entities.City
import com.oussama_chatri.weather.data.local.entities.WeatherData

@Database(entities = [WeatherData::class, City::class], version = 1, exportSchema = false)
@TypeConverters(ConverterOfLists::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
    abstract fun cityDao() : CityDao

    companion object {
        @Volatile
        private var INSTANCE: WeatherDatabase? = null

        fun getDatabase(context: Context): WeatherDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WeatherDatabase::class.java,
                    "weather_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}