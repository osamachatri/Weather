package com.oussama_chatri.weather.data.local.converters;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oussama_chatri.weather.data.local.tables.ForecastDay;
import com.oussama_chatri.weather.data.local.tables.Hour;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/oussama_chatri/weather/data/local/converters/ConverterOfLists;", "", "()V", "fromForecastDayList", "", "value", "", "Lcom/oussama_chatri/weather/data/local/tables/ForecastDay;", "fromHourList", "Lcom/oussama_chatri/weather/data/local/tables/Hour;", "toForecastDayList", "toHourList", "app_debug"})
public final class ConverterOfLists {
    
    public ConverterOfLists() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromForecastDayList(@org.jetbrains.annotations.NotNull
    java.util.List<com.oussama_chatri.weather.data.local.tables.ForecastDay> value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.oussama_chatri.weather.data.local.tables.ForecastDay> toForecastDayList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromHourList(@org.jetbrains.annotations.NotNull
    java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> toHourList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
}