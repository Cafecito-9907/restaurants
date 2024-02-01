package com.uveg.restaurants.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.uveg.restaurants.R;
import com.uveg.restaurants.adapters.RestaurantViewPagerAdapter;
import com.uveg.restaurants.models.Restaurant;

public class RestaurantTabsActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    TabItem comidaFragmentTab;
    TabItem drinkFragmentTab;
    TabItem complementsFragmentTab;

    RestaurantViewPagerAdapter restaurantViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        tabLayout = findViewById(R.id.restaurants_tabs);
        viewPager = findViewById(R.id.restaurant_pager);

        // Corregir la asignación de los TabItem
        comidaFragmentTab = findViewById(R.id.foodItem);
        drinkFragmentTab = findViewById(R.id.drinkItem);
        complementsFragmentTab = findViewById(R.id.complementsItem);

        restaurantViewPagerAdapter = new RestaurantViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(restaurantViewPagerAdapter);

        // Obtener el objeto Restaurant de la Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("selectedRestaurant")) {
            Restaurant selectedRestaurant = (Restaurant) intent.getSerializableExtra("selectedRestaurant");

            // Configurar el texto del TextView con el nombre del restaurante
            TextView textView = findViewById(R.id.restaurant_name_text_view);
            textView.setText(selectedRestaurant.getRestaurantName());
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                // Verificar la posición del tab seleccionado de manera individual
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2) {
                    restaurantViewPagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
