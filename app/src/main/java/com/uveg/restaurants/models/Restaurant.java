package com.uveg.restaurants.models;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class Restaurant implements Serializable {

    private String restaurantName;
    private Long id = new Random().nextLong();
    private List<Dish> dishList;
    private List<Drink> drinkList;
    private List<Complements> complementsList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public List<Complements> getComplementsList() {
        return complementsList;
    }

    public void setComplementsList(List<Complements> complementsList) {
        this.complementsList = complementsList;
    }
}
