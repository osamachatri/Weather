package com.oussama_chatri.weather.data.local.dbs;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.oussama_chatri.weather.data.local.converters.ConverterOfLists;
import com.oussama_chatri.weather.data.local.doas.CityDao;
import com.oussama_chatri.weather.data.local.doas.WeatherDao;
import com.oussama_chatri.weather.data.local.tables.City;
import com.oussama_chatri.weather.data.local.tables.WeatherData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/oussama_chatri/weather/data/local/dbs/WeatherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cityDao", "Lcom/oussama_chatri/weather/data/local/doas/CityDao;", "weatherDao", "Lcom/oussama_chatri/weather/data/local/doas/WeatherDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.oussama_chatri.weather.data.local.tables.WeatherData.class, com.oussama_chatri.weather.data.local.tables.City.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.oussama_chatri.weather.data.local.converters.ConverterOfLists.class})
public abstract class WeatherDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.oussama_chatri.weather.data.local.dbs.WeatherDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.oussama_chatri.weather.data.local.dbs.WeatherDatabase.Companion Companion = null;
    
    public WeatherDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.oussama_chatri.weather.data.local.doas.WeatherDao weatherDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.oussama_chatri.weather.data.local.doas.CityDao cityDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/oussama_chatri/weather/data/local/dbs/WeatherDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/oussama_chatri/weather/data/local/dbs/WeatherDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.oussama_chatri.weather.data.local.dbs.WeatherDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}