package com.example.onepiecefilmsusingjson.modelAbu;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.onepiecefilmsusingjson.R;
import com.example.onepiecefilmsusingjson.serviceapi.OnePieceApiService;
import com.example.onepiecefilmsusingjson.serviceapi.RetrofitAbuInstances;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class OnePieceRepository {
    //acts as a bridge between the view model, which is the presentation layer and the data sources such as a network API for or a local database.
    //Its primary purpose is to abstract the data source details and provide a clean API for the ViewModel
    //to fetch and manage data.A repository abstracts the data sources, which could include remote data from a web service like our
    //application or a local data from a database that we have done in the previous apps using the room databaseIt shields
    //the ViewModel from the complexities of interacting directly with these sources.

    private ArrayList<OnePieceCollection> onePiece = new ArrayList<>();
    private MutableLiveData<List<OnePieceCollection>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public OnePieceRepository(Application application) {
        this.application = application;//this will allow us to access the resource file we could u the R.string.q to reference url instead
    }

    public MutableLiveData<List<OnePieceCollection>> getMutableLiveData() {
        OnePieceApiService onePieceApiService = RetrofitAbuInstances.getService();
        Call<Result> call = onePieceApiService.GetOnePieceTitle(application.getApplicationContext().getString(R.string.q);
    }

}
