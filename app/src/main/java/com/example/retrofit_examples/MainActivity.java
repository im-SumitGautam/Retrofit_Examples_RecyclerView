package com.example.retrofit_examples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofit_examples.Adapters.CountryAdapter;
import com.example.retrofit_examples.Model.CountryModel;
import com.example.retrofit_examples.Model.Result;
import com.example.retrofit_examples.Services.GetCountryDataService;
import com.example.retrofit_examples.Services.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Result> results;
    RecyclerView recyclerView;
    CountryAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getCountry();


    }

    public Object getCountry() {
        GetCountryDataService getCountryDataService = RetrofitInstance.getServices();
        Call<CountryModel> call = getCountryDataService.getResult();

        call.enqueue(new Callback<CountryModel>() {
            @Override
            public void onResponse(Call<CountryModel> call, Response<CountryModel> response) {

                CountryModel countryModel = response.body();
                if(countryModel != null && countryModel.getResult() != null){
                    results = (ArrayList<Result>) countryModel.getResult();

//                    for(Result r : results){
//                        Log.d("RESULT" , " "+ r.getName());
//                    }
                    viewData();
                }
            }

            @Override
            public void onFailure(Call<CountryModel> call, Throwable t) {

            }
        });
        return results;
    }

    private void viewData() {
        recyclerView = findViewById(R.id.recylerView);
        countryAdapter = new CountryAdapter(results);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(countryAdapter);

    }
}