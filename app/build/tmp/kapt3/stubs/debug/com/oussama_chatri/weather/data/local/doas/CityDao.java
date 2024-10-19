package com.oussama_chatri.weather.data.local.doas;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Upsert;
import com.oussama_chatri.weather.data.local.tables.City;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/oussama_chatri/weather/data/local/doas/CityDao;", "", "getAllCities", "", "Lcom/oussama_chatri/weather/data/local/tables/City;", "upsert", "", "city", "(Lcom/oussama_chatri/weather/data/local/tables/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface CityDao {
    
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.City city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "select * from cities")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.oussama_chatri.weather.data.local.tables.City> getAllCities();
}