package com.oussama_chatri.weather.data.local.dataStore

import android.annotation.SuppressLint
import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


private val Context.dataStore by preferencesDataStore(name = "Starting data")

class StartingData(private val context: Context) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: SettingsOfApp? = null

        fun getInstance(context: Context): SettingsOfApp {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: SettingsOfApp(context.applicationContext).also { INSTANCE = it }
            }
        }
    }

    object LastCity {
        val LastCity = intPreferencesKey("LastCity")
    }

    fun readLastCity(): Flow<Int> {
        return context.dataStore.data
            .map { preferences ->
                preferences[LastCity.LastCity] ?: 1
            }
    }

    suspend fun writeLastCity(newValue: Int = 1) {
        context.dataStore.edit { settings ->
            settings[LastCity.LastCity] = newValue
        }
    }
}
