package com.oussama_chatri.weather.data.local.doas;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Upsert;
import com.oussama_chatri.weather.data.local.tables.WeatherData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/oussama_chatri/weather/data/local/doas/WeatherDao;", "", "getAllWeatherData", "", "Lcom/oussama_chatri/weather/data/local/tables/WeatherData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheWeatherOfCity", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertWeather", "", "weatherData", "(Lcom/oussama_chatri/weather/data/local/tables/WeatherData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface WeatherDao {
    
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertWeather(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.WeatherData weatherData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM weather_data")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.oussama_chatri.weather.data.local.tables.WeatherData>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM weather_data where name = :cityName")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTheWeatherOfCity(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.oussama_chatri.weather.data.local.tables.WeatherData> $completion);
}