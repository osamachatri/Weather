package com.oussama_chatri.weather.ui.viewModels

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oussama_chatri.weather.R
import com.oussama_chatri.weather.data.converters.apiToEntityCurrent
import com.oussama_chatri.weather.data.converters.apiToEntityForecast
import com.oussama_chatri.weather.data.converters.apiToEntityLocation
import com.oussama_chatri.weather.data.offline.repositories.CitiesRepository
import com.oussama_chatri.weather.data.offline.repositories.WeatherRepository
import com.oussama_chatri.weather.data.offline.tables.City
import com.oussama_chatri.weather.data.offline.tables.WeatherData
import com.oussama_chatri.weather.data.online.weatherApi.RetrofitClient
import com.oussama_chatri.weather.data.settings.SettingsOfApp
import com.oussama_chatri.weather.data.settings.StateOfRequest
import com.oussama_chatri.weather.ui.state.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val context: Context,
    private val weatherRepository: WeatherRepository,
    private val citiesRepository: CitiesRepository,
    private val settings : SettingsOfApp
) : ViewModel() {

    private val _stateList = MutableStateFlow(settings.getListOfStates(context))
    val stateList = _stateList.asStateFlow()

    private val _stateOfLoadingData = MutableStateFlow<State>(State.Initial)
    val stateOfLoadingData = _stateOfLoadingData.asStateFlow()

    fun changeStateOfLoading(state: State){
        _stateOfLoadingData.value = state
    }

    private val _weatherData = MutableStateFlow<List<WeatherData>>(emptyList())
    val weatherData = _weatherData.asStateFlow()

    val apiKey = context.getString(R.string.weatherApi)

    private val _cities = MutableStateFlow<List<City>>(emptyList())
    val cities = _cities.asStateFlow()


    suspend fun upsertWeather(weatherData: WeatherData) {
        weatherRepository.upsertWeather(weatherData)
    }

    suspend fun deleteWeather(weatherData: WeatherData) {
        weatherRepository.deleteWeather(weatherData)
    }

    suspend fun getAllWeatherDataFromDb() {
        _weatherData.value = weatherRepository.getAllWeatherData()
        Log.d("WeatherViewModel", "getAllWeatherDataFromDb: ${_weatherData.value}")
    }

    fun getTheWeatherOfCityFromDb(cityName: String): WeatherData? {
        var tempWeatherData: WeatherData? = null
        viewModelScope.launch {
            tempWeatherData = weatherRepository.getTheWeatherOfCity(cityName)
        }
        return tempWeatherData
    }

    suspend fun getCities() {
        _cities.value = citiesRepository.getAllCities()
    }

    suspend fun fetchWeatherFromApi(cityName: String) {
        settings.addItemToListOfStates(context, StateOfRequest(cityName, State.Loading))
        try {
            val response = RetrofitClient.instance.getWeather(apiKey, cityName, 14)

            if (response.isSuccessful) {
                response.body()?.let { weatherData ->
                    Log.d("WeatherViewModel", "${weatherData.toString()}")
                    upsertWeather(
                        WeatherData(
                            location = apiToEntityLocation(weatherData.location),
                            current = apiToEntityCurrent(weatherData.current),
                            forecast = apiToEntityForecast(weatherData.forecast)
                        )
                    )
                    settings.addItemToListOfStates(context, StateOfRequest(cityName, State.Success))
                } ?: run {
                    settings.addItemToListOfStates(context, StateOfRequest(cityName, State.Success))
                    Toast.makeText(context, "Error: No data in response", Toast.LENGTH_SHORT).show()
                }
            } else {
                settings.addItemToListOfStates(context, StateOfRequest(cityName, State.Error))
                Toast.makeText(context, "Error: ${response.message()}", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            settings.addItemToListOfStates(context, StateOfRequest(cityName, State.Error))
            Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
            Log.d("WeatherViewModel", "fetchWeatherFromApi: ${e.message}")
        }

    }

    suspend fun fetchWeatherFromApiForAllCities() {
        settings.makeListOfStatesEmpty(context)
        _cities.value.forEach { city ->
                try {
                    Log.e("WeatherViewModel", "Try")
                    fetchWeatherFromApi(city.name)
                    Log.e("WeatherViewModel", "Succes")
                } catch (e: Exception) {
                    Log.e("WeatherViewModel", "Error fetching weather for ${city.name}", e)
                }
        }
    }

    init {
        viewModelScope.launch {
            Log.d("WeatherViewModel", "getCities")
            getCities()
            Log.d("WeatherViewModel", "fetchWeatherFromApiForAllCities")
            getAllWeatherDataFromDb()
//            fetchWeatherFromApiForAllCities()
            Log.d("WeatherViewModel", "getAllWeatherDataFromDb")
//            getAllWeatherDataFromDb()
        }
    }

}
