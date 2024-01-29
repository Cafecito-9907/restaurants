package com.uveg.restaurants.models;

import java.util.Objects;

public class Dish {

    private String foodName;
    private Double foodCost;
    private String details;
    private String foodImage;

    public Dish(String foodName, Double foodCost, String details) {
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "foodName='" + foodName + '\'' +
                ", foodCost=" + foodCost +
                ", details='" + details + '\'' +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Double foodCost) {
        this.foodCost = foodCost;
    }
}
