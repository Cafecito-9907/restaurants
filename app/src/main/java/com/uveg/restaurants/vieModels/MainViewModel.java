package com.uveg.restaurants.vieModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.uveg.restaurants.models.DataFixed;
import com.uveg.restaurants.models.Restaurant;

import java.util.List;
public class MainViewModel extends ViewModel{

    private final MutableLiveData<List<Restaurant>> resturants = new MutableLiveData<List<Restaurant>>();

    public MainViewModel() {
    }

    public MutableLiveData<List<Restaurant>> getResturants() {
        DataFixed data = new DataFixed();

        return resturants;
    }
}
