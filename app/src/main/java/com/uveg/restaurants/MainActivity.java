package com.uveg.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.uveg.restaurants.activity.RestaurantTabsActivity;
import com.uveg.restaurants.adapters.RestaurantAdapter;
import com.uveg.restaurants.databinding.ActivityMainBinding;
import com.uveg.restaurants.models.DataFixed;
import com.uveg.restaurants.models.Restaurant;
import com.uveg.restaurants.vieModels.MainViewModel;

import java.util.List;


public class MainActivity extends AppCompatActivity implements RestaurantAdapter.OnRestaurantClickListener {

    ActivityMainBinding binding;
    MainViewModel viewModel;

    private RecyclerView recyclerView;
    private RestaurantAdapter restaurantAdapter;

    List<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.reClyRestaurants.setLayoutManager(new LinearLayoutManager(this));

        // Obtener la lista de restaurantes desde DataFixed
        DataFixed dataFixed = new DataFixed();
        restaurantList = dataFixed.getRestaurantList();

        // Configurar RecyclerView y su adaptador
        recyclerView = findViewById(R.id.reClyRestaurants);
        restaurantAdapter = new RestaurantAdapter(restaurantList, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(restaurantAdapter);
    }

    @Override
    public void onRestaurantClick(Restaurant restaurant) {
        // Manejar el clic en el restaurante aquí
        Log.e("acta", "Restaurant clicked: " + restaurant.getRestaurantName());

        // Crear un Intent para abrir RestaurantTabsActivity
        Intent intent = new Intent(MainActivity.this, RestaurantTabsActivity.class);
        intent.putExtra("selectedRestaurant", restaurant);
        startActivity(intent);
    }
}
