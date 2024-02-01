package com.uveg.restaurants.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.uveg.restaurants.ComidaFragment;
import com.uveg.restaurants.ComplementsFragment;
import com.uveg.restaurants.DrinkFragment;
import com.uveg.restaurants.R;
import com.uveg.restaurants.adapters.RestaurantViewPagerAdapter;

public class RestaurantActivity extends AppCompatActivity {

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

        comidaFragmentTab =  findViewById(R.id.foodItem);
        drinkFragmentTab = findViewById(R.id.drinkItem);
        comidaFragmentTab = findViewById(R.id.complementsItem);

        restaurantViewPagerAdapter = new RestaurantViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(restaurantViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == (0 | 1 | 2)){
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