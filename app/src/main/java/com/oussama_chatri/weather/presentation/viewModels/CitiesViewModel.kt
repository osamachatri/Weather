package com.oussama_chatri.weather.presentation.viewModels

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oussama_chatri.weather.R
import com.oussama_chatri.weather.data.offline.repositories.CitiesRepository
import com.oussama_chatri.weather.data.offline.tables.City
import com.oussama_chatri.weather.data.online.citiesApi.RetrofitInstance
import com.oussama_chatri.weather.ui.state.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitiesViewModel @Inject constructor(
    private val context: Context,
    private val citiesRepository: CitiesRepository,
    private val retrofitInstance: RetrofitInstance
) : ViewModel() {

    //TODO() add some delay before fetch data from the api to decrease the number of requests

    private val _state = MutableStateFlow<State>(State.Initial)
    val state = _state.asStateFlow()

    private val _savedCities = MutableStateFlow<List<City>>(emptyList())
    val savedCities = _savedCities.asStateFlow()


    val apiKey = context.getString(R.string.cityApi)

    fun fetchCitiesFromDb() {
        viewModelScope.launch {
            val tempList = citiesRepository.getAllCities()
            tempList.forEach { city ->
                    _savedCities.value += city
                }
            }
    }

    private val _foundedCities =
        MutableStateFlow<List<com.oussama_chatri.weather.data.online.citiesApi.City>>(
            emptyList()
        )
    val foundedCities = _foundedCities.asStateFlow()

    private val _query = MutableStateFlow<String>("")
    val query = _query.asStateFlow()

    fun changeQuery(newQuery: String) {
        _query.value = newQuery
        _foundedCities.value = emptyList()
    }

    fun fetchCitiesFromApi(prefix: String) {
        Log.d("CitiesViewModel", "CitiesViewModel: created")

        _state.value = State.Loading
        viewModelScope.launch {
            try {
                // Make the API call using Retrofit
                val response = retrofitInstance.api.searchCities(namePrefix = prefix)

                // Check if the response is successful
                if (response.isSuccessful) {
                    response.body()?.let { cityResponse ->
                        if (cityResponse.data.isNotEmpty()) {
                            _state.value = State.Success
                            // Add each city to the _foundedCities list
                            cityResponse.data.forEach { city ->
                                _foundedCities.value += city
                                Log.d("CitiesViewModel", "fetchCitiesFromApi: $city")
                            }
                        } else {
                            _state.value = State.Error
                            Log.d("CitiesViewModel", "No cities found")
                        }
                    } ?: run {
                        _state.value = State.Error
                        Log.d("CitiesViewModel", "Error: Empty body in response")
                    }
                } else {
                    _state.value = State.Error
                    Log.d("CitiesViewModel", "Error: ${response.message()}")
                }
            } catch (e: Exception) {
                _state.value = State.Error
                Log.d("CitiesViewModel", "fetchCitiesFromApi: ${e.message}")
            }
        }
    }

    fun insertCity(city: City) {
        viewModelScope.launch {
            citiesRepository.upsert(city)
        }
    }

    fun deleteCity(city: City) {
        viewModelScope.launch {
            citiesRepository.delete(city)
        }
    }

}