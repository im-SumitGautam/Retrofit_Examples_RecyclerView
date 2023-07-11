package com.example.retrofit_examples.Services;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static Retrofit retrofit = null;
    public static String BASE_URL = "https://api.printful.com/";

    //Singleton Pattern used to create an Instance of Retrofit
    public static GetCountryDataService getServices(){

        // Instance is not created before
        if(retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        // Instance is already created
        return retrofit.create(GetCountryDataService.class);
    }
}
