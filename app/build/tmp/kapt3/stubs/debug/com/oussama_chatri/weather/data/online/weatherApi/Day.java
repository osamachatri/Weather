package com.oussama_chatri.weather.data.online.weatherApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0011H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u0011H\u00c6\u0003J\t\u00109\u001a\u00020\u0011H\u00c6\u0003J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003J\t\u0010;\u001a\u00020\u0017H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u00d1\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0011H\u00d6\u0001J\t\u0010J\u001a\u00020KH\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d\u00a8\u0006L"}, d2 = {"Lcom/oussama_chatri/weather/data/online/weatherApi/Day;", "", "maxtemp_c", "", "maxtemp_f", "mintemp_c", "mintemp_f", "avgtemp_c", "avgtemp_f", "maxwind_mph", "maxwind_kph", "totalprecip_mm", "totalprecip_in", "totalsnow_cm", "avgvis_km", "avgvis_miles", "avghumidity", "", "daily_will_it_rain", "daily_chance_of_rain", "daily_will_it_snow", "daily_chance_of_snow", "condition", "Lcom/oussama_chatri/weather/data/online/weatherApi/Condition;", "uv", "(DDDDDDDDDDDDDIIIIILcom/oussama_chatri/weather/data/online/weatherApi/Condition;D)V", "getAvghumidity", "()I", "getAvgtemp_c", "()D", "getAvgtemp_f", "getAvgvis_km", "getAvgvis_miles", "getCondition", "()Lcom/oussama_chatri/weather/data/online/weatherApi/Condition;", "getDaily_chance_of_rain", "getDaily_chance_of_snow", "getDaily_will_it_rain", "getDaily_will_it_snow", "getMaxtemp_c", "getMaxtemp_f", "getMaxwind_kph", "getMaxwind_mph", "getMintemp_c", "getMintemp_f", "getTotalprecip_in", "getTotalprecip_mm", "getTotalsnow_cm", "getUv", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Day {
    private final double maxtemp_c = 0.0;
    private final double maxtemp_f = 0.0;
    private final double mintemp_c = 0.0;
    private final double mintemp_f = 0.0;
    private final double avgtemp_c = 0.0;
    private final double avgtemp_f = 0.0;
    private final double maxwind_mph = 0.0;
    private final double maxwind_kph = 0.0;
    private final double totalprecip_mm = 0.0;
    private final double totalprecip_in = 0.0;
    private final double totalsnow_cm = 0.0;
    private final double avgvis_km = 0.0;
    private final double avgvis_miles = 0.0;
    private final int avghumidity = 0;
    private final int daily_will_it_rain = 0;
    private final int daily_chance_of_rain = 0;
    private final int daily_will_it_snow = 0;
    private final int daily_chance_of_snow = 0;
    @org.jetbrains.annotations.NotNull
    private final com.oussama_chatri.weather.data.online.weatherApi.Condition condition = null;
    private final double uv = 0.0;
    
    public Day(double maxtemp_c, double maxtemp_f, double mintemp_c, double mintemp_f, double avgtemp_c, double avgtemp_f, double maxwind_mph, double maxwind_kph, double totalprecip_mm, double totalprecip_in, double totalsnow_cm, double avgvis_km, double avgvis_miles, int avghumidity, int daily_will_it_rain, int daily_chance_of_rain, int daily_will_it_snow, int daily_chance_of_snow, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.online.weatherApi.Condition condition, double uv) {
        super();
    }
    
    public final double getMaxtemp_c() {
        return 0.0;
    }
    
    public final double getMaxtemp_f() {
        return 0.0;
    }
    
    public final double getMintemp_c() {
        return 0.0;
    }
    
    public final double getMintemp_f() {
        return 0.0;
    }
    
    public final double getAvgtemp_c() {
        return 0.0;
    }
    
    public final double getAvgtemp_f() {
        return 0.0;
    }
    
    public final double getMaxwind_mph() {
        return 0.0;
    }
    
    public final double getMaxwind_kph() {
        return 0.0;
    }
    
    public final double getTotalprecip_mm() {
        return 0.0;
    }
    
    public final double getTotalprecip_in() {
        return 0.0;
    }
    
    public final double getTotalsnow_cm() {
        return 0.0;
    }
    
    public final double getAvgvis_km() {
        return 0.0;
    }
    
    public final double getAvgvis_miles() {
        return 0.0;
    }
    
    public final int getAvghumidity() {
        return 0;
    }
    
    public final int getDaily_will_it_rain() {
        return 0;
    }
    
    public final int getDaily_chance_of_rain() {
        return 0;
    }
    
    public final int getDaily_will_it_snow() {
        return 0;
    }
    
    public final int getDaily_chance_of_snow() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Condition getCondition() {
        return null;
    }
    
    public final double getUv() {
        return 0.0;
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
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
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Condition component19() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.oussama_chatri.weather.data.online.weatherApi.Day copy(double maxtemp_c, double maxtemp_f, double mintemp_c, double mintemp_f, double avgtemp_c, double avgtemp_f, double maxwind_mph, double maxwind_kph, double totalprecip_mm, double totalprecip_in, double totalsnow_cm, double avgvis_km, double avgvis_miles, int avghumidity, int daily_will_it_rain, int daily_chance_of_rain, int daily_will_it_snow, int daily_chance_of_snow, @org.jetbrains.annotations.NotNull
    com.oussama_chatri.weather.data.online.weatherApi.Condition condition, double uv) {
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