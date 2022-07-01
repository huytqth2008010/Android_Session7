package com.example.android_session7.network;

import com.example.android_session7.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "https://dataservice.accuweather.com";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=fAr0sVK2d9dXtwsygNT3BMEKA4BaljQ5&language=vi-vn&metric=true")
    Call<List<Wheather>> getHour();

    @GET("/forecasts/v1/daily/5day/353412?apikey=fAr0sVK2d9dXtwsygNT3BMEKA4BaljQ5&language=vi-vn&metric=true")
    Call<List<Wheather>> getDay();
}
