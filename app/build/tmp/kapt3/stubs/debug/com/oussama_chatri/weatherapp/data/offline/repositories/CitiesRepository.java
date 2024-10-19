package com.oussama_chatri.weatherapp.data.offline.repositories;

import com.oussama_chatri.weather.data.local.doas.CityDao;
import com.oussama_chatri.weather.data.local.tables.City;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/oussama_chatri/weatherapp/data/offline/repositories/CitiesRepository;", "Lcom/oussama_chatri/weather/data/local/doas/CityDao;", "cityDao", "(Lcom/oussama_chatri/weather/data/local/doas/CityDao;)V", "getAllCities", "", "Lcom/oussama_chatri/weather/data/local/tables/City;", "upsert", "", "city", "(Lcom/oussama_chatri/weather/data/local/tables/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CitiesRepository implements com.oussama_chatri.weather.data.local.doas.CityDao {
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.local.doas.CityDao cityDao = null;
    
    public CitiesRepository(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.doas.CityDao cityDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.City city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.oussama_chatri.weather.data.local.tables.City> getAllCities() {
        return null;
    }
}