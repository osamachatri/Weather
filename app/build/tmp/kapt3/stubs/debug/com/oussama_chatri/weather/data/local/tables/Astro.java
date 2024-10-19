package com.oussama_chatri.weather.data.local.tables;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\nH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/oussama_chatri/weather/data/local/tables/Astro;", "", "sunrise", "", "sunset", "moonrise", "moonset", "moon_phase", "moon_illumination", "is_moon_up", "", "is_sun_up", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "()I", "getMoon_illumination", "()Ljava/lang/String;", "getMoon_phase", "getMoonrise", "getMoonset", "getSunrise", "getSunset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Astro {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sunrise = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sunset = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String moonrise = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String moonset = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String moon_phase = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String moon_illumination = null;
    private final int is_moon_up = 0;
    private final int is_sun_up = 0;
    
    public Astro(@org.jetbrains.annotations.NotNull
    java.lang.String sunrise, @org.jetbrains.annotations.NotNull
    java.lang.String sunset, @org.jetbrains.annotations.NotNull
    java.lang.String moonrise, @org.jetbrains.annotations.NotNull
    java.lang.String moonset, @org.jetbrains.annotations.NotNull
    java.lang.String moon_phase, @org.jetbrains.annotations.NotNull
    java.lang.String moon_illumination, int is_moon_up, int is_sun_up) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSunrise() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSunset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoonrise() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoonset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoon_phase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoon_illumination() {
        return null;
    }
    
    public final int is_moon_up() {
        return 0;
    }
    
    public final int is_sun_up() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.local.tables.Astro copy(@org.jetbrains.annotations.NotNull
    java.lang.String sunrise, @org.jetbrains.annotations.NotNull
    java.lang.String sunset, @org.jetbrains.annotations.NotNull
    java.lang.String moonrise, @org.jetbrains.annotations.NotNull
    java.lang.String moonset, @org.jetbrains.annotations.NotNull
    java.lang.String moon_phase, @org.jetbrains.annotations.NotNull
    java.lang.String moon_illumination, int is_moon_up, int is_sun_up) {
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