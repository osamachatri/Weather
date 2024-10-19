package com.oussama_chatri.weather.data.online.citiesApi;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/oussama_chatri/weather/data/online/citiesApi/CityApiService;", "", "searchCities", "Lcom/oussama_chatri/weather/data/online/citiesApi/CityResponse;", "namePrefix", "", "limit", "", "offset", "apiKey", "host", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CityApiService {
    
    @retrofit2.http.GET(value = "v1/geo/cities")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchCities(@retrofit2.http.Query(value = "namePrefix")
    @org.jetbrains.annotations.NotNull
    java.lang.String namePrefix, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @retrofit2.http.Header(value = "X-RapidAPI-Key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Header(value = "X-RapidAPI-Host")
    @org.jetbrains.annotations.NotNull
    java.lang.String host, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.oussama_chatri.weather.data.online.citiesApi.CityResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}