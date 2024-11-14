package com.oussama_chatri.weather.data.settings

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.oussama_chatri.weather.ui.state.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val Context.dataStore by preferencesDataStore(name = "settings")

class SettingsOfApp(private val context: Context) {

    companion object {
        @Volatile
        private var INSTANCE: SettingsOfApp? = null

        fun getInstance(context: Context): SettingsOfApp {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: SettingsOfApp(context.applicationContext).also { INSTANCE = it }
            }
        }
    }

    object SyncWeather {
        val SyncWeather = booleanPreferencesKey("SyncWeather")
    }

    fun isItEnable(): Flow<Boolean> {
        return context.dataStore.data
            .map { preferences ->
                preferences[SyncWeather.SyncWeather] ?: false
            }
    }

    suspend fun enableSync(newValue: Boolean = true) {
        context.dataStore.edit { settings ->
            settings[SyncWeather.SyncWeather] = newValue
        }
    }

    val stateOfRequestKey = stringPreferencesKey("StateOfRequest")  // The key for DataStore
    val json = Json { ignoreUnknownKeys = true }  // JSON serialization and deserialization

    suspend fun saveListOfStates(context: Context, dataList: List<StateOfRequest>) {
        val jsonString = json.encodeToString(dataList)
        context.dataStore.edit { preferences ->
            preferences[stateOfRequestKey] = jsonString
        }
    }

    fun getListOfStates(context: Context): Flow<List<StateOfRequest>> {
        return context.dataStore.data.map { preferences ->
            val jsonString = preferences[stateOfRequestKey] ?: "[]"
            json.decodeFromString<List<StateOfRequest>>(jsonString)
        }
    }

    suspend fun makeListOfStatesEmpty(context: Context) {
        saveListOfStates(context, emptyList())
    }

    private fun findItemIndexByCity(currentList: List<StateOfRequest>, city: String): Int {
        return currentList.indexOfFirst { it.city == city }  // Compare `city` directly
    }

    suspend fun updateItemInListOfStates(context: Context, city: String, newState: State) {
        context.dataStore.edit { preferences ->
            val currentListJson = preferences[stateOfRequestKey] ?: "[]"

            val currentList = json.decodeFromString<List<StateOfRequest>>(currentListJson)

            val index = findItemIndexByCity(currentList, city)

            if (index != -1) { // If the city exists in the list
                val updatedList = currentList.toMutableList()
                updatedList[index] = updatedList[index].copy(state = newState)

                val updatedListJson = json.encodeToString(updatedList)
                preferences[stateOfRequestKey] = updatedListJson
            }
        }
    }

    suspend fun addItemToListOfStates(context: Context, newItem: StateOfRequest) {
        context.dataStore.edit { preferences ->
            val currentListJson = preferences[stateOfRequestKey] ?: "[]"

            val currentList = json.decodeFromString<List<StateOfRequest>>(currentListJson)

            val updatedList = currentList.toMutableList().apply {
                add(newItem)
            }

            val updatedListJson = json.encodeToString(updatedList)
            preferences[stateOfRequestKey] = updatedListJson
        }
    }

}

@Serializable
data class StateOfRequest(
    val city: String,
    val state: State
)
