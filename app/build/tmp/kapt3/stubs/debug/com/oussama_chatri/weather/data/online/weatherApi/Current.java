package com.oussama_chatri.weather.data.online.weatherApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00f5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0007\u00a2\u0006\u0002\u0010$J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\u0007H\u00c6\u0003J\t\u0010N\u001a\u00020\nH\u00c6\u0003J\t\u0010O\u001a\u00020\nH\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010U\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010V\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\t\u0010W\u001a\u00020\u0007H\u00c6\u0003J\t\u0010X\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0007H\u00c6\u0003J\t\u0010[\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0007H\u00c6\u0003J\t\u0010]\u001a\u00020\u0007H\u00c6\u0003J\t\u0010^\u001a\u00020\u0007H\u00c6\u0003J\t\u0010_\u001a\u00020\u0007H\u00c6\u0003J\t\u0010`\u001a\u00020\nH\u00c6\u0003J\t\u0010a\u001a\u00020\fH\u00c6\u0003J\t\u0010b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010d\u001a\u00020\nH\u00c6\u0003J\u00b8\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010j\u001a\u00020\nH\u00d6\u0001J\t\u0010k\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0016\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010#\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\"\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010!\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010 \u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bF\u00101R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bG\u00101\u00a8\u0006l"}, d2 = {"Lcom/oussama_chatri/weather/data/online/weatherApi/Current;", "", "last_updated_epoch", "", "last_updated", "", "temp_c", "", "temp_f", "is_day", "", "condition", "Lcom/oussama_chatri/weather/data/online/weatherApi/Condition;", "wind_mph", "wind_kph", "wind_degree", "wind_dir", "pressure_mb", "pressure_in", "precip_mm", "precip_in", "humidity", "cloud", "feelslike_c", "feelslike_f", "windchill_c", "windchill_f", "heatindex_c", "heatindex_f", "dewpoint_c", "dewpoint_f", "vis_km", "vis_miles", "uv", "gust_mph", "gust_kph", "(JLjava/lang/String;DDILcom/oussama_chatri/weather/data/online/weatherApi/Condition;DDILjava/lang/String;DDDDIIDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DDDDDDD)V", "getCloud", "()I", "getCondition", "()Lcom/oussama_chatri/weather/data/online/weatherApi/Condition;", "getDewpoint_c", "()D", "getDewpoint_f", "getFeelslike_c", "getFeelslike_f", "getGust_kph", "getGust_mph", "getHeatindex_c", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHeatindex_f", "getHumidity", "getLast_updated", "()Ljava/lang/String;", "getLast_updated_epoch", "()J", "getPrecip_in", "getPrecip_mm", "getPressure_in", "getPressure_mb", "getTemp_c", "getTemp_f", "getUv", "getVis_km", "getVis_miles", "getWind_degree", "getWind_dir", "getWind_kph", "getWind_mph", "getWindchill_c", "getWindchill_f", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;DDILcom/oussama_chatri/weather/data/online/weatherApi/Condition;DDILjava/lang/String;DDDDIIDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DDDDDDD)Lcom/oussama_chatri/weather/data/online/weatherApi/Current;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Current {
    private final long last_updated_epoch = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String last_updated = null;
    private final double temp_c = 0.0;
    private final double temp_f = 0.0;
    private final int is_day = 0;
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.online.weatherApi.Condition condition = null;
    private final double wind_mph = 0.0;
    private final double wind_kph = 0.0;
    private final int wind_degree = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String wind_dir = null;
    private final double pressure_mb = 0.0;
    private final double pressure_in = 0.0;
    private final double precip_mm = 0.0;
    private final double precip_in = 0.0;
    private final int humidity = 0;
    private final int cloud = 0;
    private final double feelslike_c = 0.0;
    private final double feelslike_f = 0.0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double windchill_c = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double windchill_f = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double heatindex_c = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double heatindex_f = null;
    private final double dewpoint_c = 0.0;
    private final double dewpoint_f = 0.0;
    private final double vis_km = 0.0;
    private final double vis_miles = 0.0;
    private final double uv = 0.0;
    private final double gust_mph = 0.0;
    private final double gust_kph = 0.0;
    
    public Current(long last_updated_epoch, @org.jetbrains.annotations.NotNull
    java.lang.String last_updated, double temp_c, double temp_f, int is_day, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.online.weatherApi.Condition condition, double wind_mph, double wind_kph, int wind_degree, @org.jetbrains.annotations.NotNull
    java.lang.String wind_dir, double pressure_mb, double pressure_in, double precip_mm, double precip_in, int humidity, int cloud, double feelslike_c, double feelslike_f, @org.jetbrains.annotations.Nullable
    java.lang.Double windchill_c, @org.jetbrains.annotations.Nullable
    java.lang.Double windchill_f, @org.jetbrains.annotations.Nullable
    java.lang.Double heatindex_c, @org.jetbrains.annotations.Nullable
    java.lang.Double heatindex_f, double dewpoint_c, double dewpoint_f, double vis_km, double vis_miles, double uv, double gust_mph, double gust_kph) {
        super();
    }
    
    public final long getLast_updated_epoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLast_updated() {
        return null;
    }
    
    public final double getTemp_c() {
        return 0.0;
    }
    
    public final double getTemp_f() {
        return 0.0;
    }
    
    public final int is_day() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Condition getCondition() {
        return null;
    }
    
    public final double getWind_mph() {
        return 0.0;
    }
    
    public final double getWind_kph() {
        return 0.0;
    }
    
    public final int getWind_degree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWind_dir() {
        return null;
    }
    
    public final double getPressure_mb() {
        return 0.0;
    }
    
    public final double getPressure_in() {
        return 0.0;
    }
    
    public final double getPrecip_mm() {
        return 0.0;
    }
    
    public final double getPrecip_in() {
        return 0.0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int getCloud() {
        return 0;
    }
    
    public final double getFeelslike_c() {
        return 0.0;
    }
    
    public final double getFeelslike_f() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getWindchill_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getWindchill_f() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getHeatindex_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getHeatindex_f() {
        return null;
    }
    
    public final double getDewpoint_c() {
        return 0.0;
    }
    
    public final double getDewpoint_f() {
        return 0.0;
    }
    
    public final double getVis_km() {
        return 0.0;
    }
    
    public final double getVis_miles() {
        return 0.0;
    }
    
    public final double getUv() {
        return 0.0;
    }
    
    public final double getGust_mph() {
        return 0.0;
    }
    
    public final double getGust_kph() {
        return 0.0;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component22() {
        return null;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final double component25() {
        return 0.0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    public final double component27() {
        return 0.0;
    }
    
    public final double component28() {
        return 0.0;
    }
    
    public final double component29() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Condition component6() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Current copy(long last_updated_epoch, @org.jetbrains.annotations.NotNull
    java.lang.String last_updated, double temp_c, double temp_f, int is_day, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.online.weatherApi.Condition condition, double wind_mph, double wind_kph, int wind_degree, @org.jetbrains.annotations.NotNull
    java.lang.String wind_dir, double pressure_mb, double pressure_in, double precip_mm, double precip_in, int humidity, int cloud, double feelslike_c, double feelslike_f, @org.jetbrains.annotations.Nullable
    java.lang.Double windchill_c, @org.jetbrains.annotations.Nullable
    java.lang.Double windchill_f, @org.jetbrains.annotations.Nullable
    java.lang.Double heatindex_c, @org.jetbrains.annotations.Nullable
    java.lang.Double heatindex_f, double dewpoint_c, double dewpoint_f, double vis_km, double vis_miles, double uv, double gust_mph, double gust_kph) {
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