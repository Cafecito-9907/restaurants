package com.uveg.restaurants.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uveg.restaurants.R;
import com.uveg.restaurants.models.Restaurant;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private List<Restaurant> restaurantList;
    private Context context;

    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_list_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);

        // Configurar las vistas dentro del ViewHolder con los datos del restaurante
        holder.restaurantNameTextView.setText(restaurant.getRestaurantName());
        // También puedes configurar otras vistas según tus necesidades
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        public TextView restaurantNameTextView;
        // Puedes agregar más vistas según tus necesidades

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            restaurantNameTextView = itemView.findViewById(R.id.restaurant_name);
            // Inicializar otras vistas aquí según tus necesidades
        }
    }
}
