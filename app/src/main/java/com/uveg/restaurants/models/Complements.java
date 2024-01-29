package com.uveg.restaurants.models;

public class Complements {

    private String drinkName;
    private Double drinkCost;
    private String details;
    private String drinkImage;

    public Complements(String drinkName, Double drinkCost, String details) {
        this.drinkName = drinkName;
        this.drinkCost = drinkCost;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Complements{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkCost=" + drinkCost +
                ", details='" + details + '\'' +
                ", drinkImage='" + drinkImage + '\'' +
                '}';
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Double getDrinkCost() {
        return drinkCost;
    }

    public void setDrinkCost(Double drinkCost) {
        this.drinkCost = drinkCost;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(String drinkImage) {
        this.drinkImage = drinkImage;
    }
}