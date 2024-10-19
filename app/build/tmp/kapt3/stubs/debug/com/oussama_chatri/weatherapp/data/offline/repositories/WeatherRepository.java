package com.oussama_chatri.weatherapp.data.offline.repositories;

import com.oussama_chatri.weather.data.local.doas.WeatherDao;
import com.oussama_chatri.weather.data.local.tables.WeatherData;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/oussama_chatri/weatherapp/data/offline/repositories/WeatherRepository;", "Lcom/oussama_chatri/weather/data/local/doas/WeatherDao;", "weatherDao", "(Lcom/oussama_chatri/weather/data/local/doas/WeatherDao;)V", "getAllWeatherData", "", "Lcom/oussama_chatri/weather/data/local/tables/WeatherData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheWeatherOfCity", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertWeather", "", "weatherData", "(Lcom/oussama_chatri/weather/data/local/tables/WeatherData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepository implements com.oussama_chatri.weather.data.local.doas.WeatherDao {
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.local.doas.WeatherDao weatherDao = null;
    
    @javax.inject.Inject
    public WeatherRepository(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.doas.WeatherDao weatherDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object upsertWeather(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.WeatherData weatherData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAllWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.oussama_chatri.weather.data.local.tables.WeatherData>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTheWeatherOfCity(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.oussama_chatri.weather.data.local.tables.WeatherData> $completion) {
        return null;
    }
}