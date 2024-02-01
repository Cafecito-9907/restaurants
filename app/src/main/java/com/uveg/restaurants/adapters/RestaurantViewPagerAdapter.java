package com.uveg.restaurants.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.uveg.restaurants.ComidaFragment;
import com.uveg.restaurants.ComplementsFragment;
import com.uveg.restaurants.DrinkFragment;

public class RestaurantViewPagerAdapter extends FragmentPagerAdapter {

    private int behavior;

    public RestaurantViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ComidaFragment();

            case 1:
                return new DrinkFragment();

            case 2:
                return new ComplementsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return behavior;
    }
}
