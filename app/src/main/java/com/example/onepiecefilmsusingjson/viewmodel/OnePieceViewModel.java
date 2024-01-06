package com.example.onepiecefilmsusingjson.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.onepiecefilmsusingjson.modelAbu.OnePieceCollection;
import com.example.onepiecefilmsusingjson.modelAbu.OnePieceRepository;

import java.util.List;

public class OnePieceViewModel extends AndroidViewModel{
    //View Model exposes data to the UI components using live data and other observable mechanisms.
    //Live data is a data holder class that can be observed by UI components When data changes in the view
    //model, live data notifies the UI allowing it to interact and update accordingly.The basic view model, it's not Android specific and doesn't have a reference to the Android application
    //or context.It designed to be used in conjunction with live data to expose data to UI components, example activity
    //and fragments in a lifecycle aware manner.Typically ViewModel instances are created using the ViewModel provider and don't require access to Android
    //specific components.We use ViewModel for holding and managing data related to the UI, such as configuration changes and
    //data that should survive across screen rotations.
    //It's suitable for non Android specific logic like data transformation and presentation logic.
    //But since I'm using Viewmodels in Android applications that we need to access Android specific components,
    //I'm going to use Android view model here.Android View model is a subclass of a view model that is aware of Android application context.
    //It's intended for cases where the view model needs to access Android specific components such as resources

    private OnePieceRepository repositoryOp;

    public OnePieceViewModel(@NonNull Application application) {
        super(application);
        this.repositoryOp = new OnePieceRepository(application);
    }

    //live Date
    public LiveData<List<OnePieceCollection>> getAllOnePiece()
    {
        return repositoryOp.getMutableLiveData();
    }

}
