package com.example.onepiecefilmsusingjson.serviceapi;

import com.example.onepiecefilmsusingjson.modelAbu.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OnePieceApiService {

    //In retrofit The service interface is a key component that defines the structure and behavior of the
    //API requests.It acts as a bridge between your Android app and the remote API.
    //In this service API interface, we define the endpoints and the query parameters.


    @GET("anime") //our end point
    Call<Result> GetOnePieceTitle(@Query("q") String apiKey); //Call class to represent a network request and its response response type should be replaced with the
                                 //This the question mark and query parameters //actual data model class that represents the expected response from the API.

}
