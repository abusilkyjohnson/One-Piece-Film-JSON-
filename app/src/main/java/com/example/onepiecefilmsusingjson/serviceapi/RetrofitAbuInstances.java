package com.example.onepiecefilmsusingjson.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAbuInstances {

    //acts as a central configuration point for defining how Http requests and responses should be handled.
    //It provides settings like base URL, converters and other configurations necessary for making API requests.

    private static Retrofit retrofitAbu;
    private static String BASE_URL ="https://api.jikan.moe/v4/";

    public static OnePieceApiService getService()
    {
        if(retrofitAbu == null){
            retrofitAbu = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();

        }//handles how data is converted
        return retrofitAbu.create(OnePieceApiService.class);
    }
}
