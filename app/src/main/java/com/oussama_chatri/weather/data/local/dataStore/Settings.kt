package com.oussama_chatri.weather.data.local.dataStore

import android.annotation.SuppressLint
import android.content.Context
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


private val Context.dataStore by preferencesDataStore(name = "Settings")

class SettingsOfApp(private val context: Context) {

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

    object CoefficientFontSize {
        val CoefficientFontSize = doublePreferencesKey("CoefficientFontSize")
    }

    fun readCoefficientFontSize(): Flow<Double> {
        return context.dataStore.data
            .map { preferences ->
                preferences[CoefficientFontSize.CoefficientFontSize] ?: 1.0
            }
    }

    suspend fun writeCoefficientFontSize(newValue: Double = 1.0) {
        context.dataStore.edit { settings ->
            settings[CoefficientFontSize.CoefficientFontSize] = newValue
        }
    }
}