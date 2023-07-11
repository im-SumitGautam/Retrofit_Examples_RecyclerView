package com.example.retrofit_examples.Services;

import com.example.retrofit_examples.Model.CountryModel;
import com.example.retrofit_examples.Model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {
    //Retrofit Interface

    @GET("countries")
    Call<CountryModel> getResult();
}
