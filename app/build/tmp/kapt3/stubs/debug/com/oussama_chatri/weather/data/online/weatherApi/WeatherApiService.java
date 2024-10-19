package com.oussama_chatri.weather.data.online.weatherApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/oussama_chatri/weather/data/online/weatherApi/WeatherApiService;", "", "getWeather", "Lretrofit2/Call;", "Lcom/oussama_chatri/weather/data/online/weatherApi/WeatherData;", "apiKey", "", "location", "days", "", "app_debug"})
public abstract interface WeatherApiService {
    
    @retrofit2.http.GET(value = "v1/forecast.json")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.oussama_chatri.weather.data.online.weatherApi.WeatherData> getWeather(@retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String location, @retrofit2.http.Query(value = "days")
    int days);
}