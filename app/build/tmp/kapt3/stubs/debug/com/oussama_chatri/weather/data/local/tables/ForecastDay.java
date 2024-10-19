package com.oussama_chatri.weather.data.local.tables;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/oussama_chatri/weather/data/local/tables/ForecastDay;", "", "date", "", "date_epoch", "", "day", "Lcom/oussama_chatri/weather/data/local/tables/Day;", "astro", "Lcom/oussama_chatri/weather/data/local/tables/Astro;", "hour", "", "Lcom/oussama_chatri/weather/data/local/tables/Hour;", "(Ljava/lang/String;JLcom/oussama_chatri/weather/data/local/tables/Day;Lcom/oussama_chatri/weather/data/local/tables/Astro;Ljava/util/List;)V", "getAstro", "()Lcom/oussama_chatri/weather/data/local/tables/Astro;", "getDate", "()Ljava/lang/String;", "getDate_epoch", "()J", "getDay", "()Lcom/oussama_chatri/weather/data/local/tables/Day;", "getHour", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ForecastDay {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String date = null;
    private final long date_epoch = 0L;
    @androidx.room.Embedded
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.local.tables.Day day = null;
    @androidx.room.Embedded
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.local.tables.Astro astro = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> hour = null;
    
    public ForecastDay(@org.jetbrains.annotations.NotNull
    java.lang.String date, long date_epoch, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.Day day, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.Astro astro, @org.jetbrains.annotations.NotNull
    java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> hour) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return null;
    }
    
    public final long getDate_epoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.Day getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.Astro getAstro() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> getHour() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.Day component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.Astro component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.ForecastDay copy(@org.jetbrains.annotations.NotNull
    java.lang.String date, long date_epoch, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.Day day, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.local.tables.Astro astro, @org.jetbrains.annotations.NotNull
    java.util.List<com.oussama_chatri.weather.data.local.tables.Hour> hour) {
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