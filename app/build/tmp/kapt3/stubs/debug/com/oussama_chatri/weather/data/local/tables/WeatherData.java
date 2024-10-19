package com.oussama_chatri.weather.data.local.tables;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/oussama_chatri/weather/data/local/tables/WeatherData;", "", "id", "", "location", "Lcom/oussama_chatri/weather/data/local/tables/Location;", "current", "Lcom/oussama_chatri/weather/data/local/tables/Current;", "forecast", "Lcom/oussama_chatri/weather/data/local/tables/Forecast;", "(ILcom/oussama_chatri/weather/data/local/tables/Location;Lcom/oussama_chatri/weather/data/local/tables/Current;Lcom/oussama_chatri/weather/data/local/tables/Forecast;)V", "getCurrent", "()Lcom/oussama_chatri/weather/data/local/tables/Current;", "getForecast", "()Lcom/oussama_chatri/weather/data/local/tables/Forecast;", "getId", "()I", "getLocation", "()Lcom/oussama_chatri/weather/data/local/tables/Location;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "weather_data")
public final class WeatherData {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private final com.oussama_chatri.weather.data.local.tables.Location location = null;
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private final com.oussama_chatri.weather.data.local.tables.Current current = null;
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private final com.oussama_chatri.weather.data.local.tables.Forecast forecast = null;
    
    public WeatherData(int id, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Location location, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Current current, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Forecast forecast) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Current getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Forecast getForecast() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Location component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Current component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.oussama_chatri.weather.data.local.tables.Forecast component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.WeatherData copy(int id, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Location location, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Current current, @org.jetbrains.annotations.Nullable
    com.oussama_chatri.weather.data.local.tables.Forecast forecast) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}