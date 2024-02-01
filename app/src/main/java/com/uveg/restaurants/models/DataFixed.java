package com.uveg.restaurants.models;

import java.util.ArrayList;
import java.util.List;

public class DataFixed {

    private List<Restaurant> restaurantList;

    public DataFixed() {
        this.getData();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void getData(){
        Restaurant restaurant1 = new Restaurant("Delicias del Mar");
        List<Dish> dishList1 = new ArrayList<>();
        dishList1.add(new Dish("Paella de Mariscos", 18.99, "Arroz con mariscos y alioli."));
        dishList1.add( new Dish("Ceviche Mixto", 14.50, "Pescado y mariscos frescos con limón y cilantro."));
        dishList1.add(new Dish("Pulpo a la Gallega", 12.75, "Pulpo cocido con paprika y aceite de oliva."));
        dishList1.add(new Dish("Gambas al Ajillo", 16.25, "Gambas salteadas con ajo y guindilla."));

        List<Drink> drinkList1 = new ArrayList<>();
        drinkList1.add(new Drink("Sangría", 8.50, "Vino tinto, frutas y soda."));
        drinkList1.add(new Drink("Mojito de Mango", 7.25, "Ron, mango, menta y soda."));
        drinkList1.add( new Drink("Agua de Coco", 3.00, "Agua natural de coco."));
        drinkList1.add(new Drink("Limonada Fresca", 4.50, "Limones frescos exprimidos."));
        // Bebidas

        // Complementos
        List<Complements> complementsList1 = new ArrayList<>();
        complementsList1.add(new Complements("Pan con Alioli", 5.50, "Pan artesanal con salsa alioli."));
        complementsList1.add(new Complements("Ensalada Verde", 6.75, "Mezcla de hojas verdes con vinagreta."));
        complementsList1.add(new Complements("Papas Bravas", 5.00, "Papas fritas con salsa brava."));
        complementsList1.add(new Complements("Calamares a la Romana", 9.99, "Calamares fritos con limón."));

        restaurant1.setDishList(dishList1);
        restaurant1.setDrinkList(drinkList1);
        restaurant1.setComplementsList(complementsList1);

        // Restaurante "Sabor Mexicano"
        Restaurant restaurant2 = new Restaurant("Sabor Mexicano");
        List<Dish> dishList2 = new ArrayList<>();
        dishList2.add(new Dish("Tacos al Pastor", 12.99, "Tacos de cerdo adobado con piña."));
        dishList2.add(new Dish("Enchiladas Suizas", 11.50, "Tortillas rellenas de pollo con salsa verde."));
        dishList2.add(new Dish("Quesadillas de Huitlacoche", 10.75, "Tortillas de maíz rellenas de huitlacoche y queso."));
        dishList2.add(new Dish("Tamales de Elote", 9.25, "Tamales de maíz con salsa roja."));
        List<Drink> drinkList2 = new ArrayList<>();
        drinkList2.add(new Drink("Margarita Clásica", 8.00, "Tequila, triple sec y jugo de limón."));
        drinkList2.add(new Drink("Horchata Fresca", 3.50, "Bebida de arroz con canela y vainilla."));
        drinkList2.add(new Drink("Agua de Jamaica", 2.75, "Infusión de flor de jamaica."));
        drinkList2.add(new Drink("Refresco de Tamarindo", 2.50, "Refresco de tamarindo natural."));
        List<Complements> complementsList2 = new ArrayList<>();
        complementsList2.add(new Complements("Guacamole Fresco", 6.25, "Aguacate, tomate, cebolla y cilantro."));
        complementsList2.add(new Complements("Elote Asado", 4.99, "Maíz asado con mayonesa, queso y chile."));
        complementsList2.add(new Complements("Frijoles Charros", 5.50, "Frijoles cocidos con chorizo y tocino."));
        complementsList2.add(new Complements("Salsa Verde y Roja", 2.00, "Salsas picantes caseras."));

        restaurant2.setDishList(dishList2);
        restaurant2.setDrinkList(drinkList2);
        restaurant2.setComplementsList(complementsList2);

//      Restaurant 3
        Restaurant restaurant3 = new Restaurant("Cocina Oriental");
        List<Dish> dishList3 = new ArrayList<>();
        dishList3.add(new Dish("Sushi Variado", 22.99, "Variedad de rollos de sushi."));
        dishList3.add(new Dish("Pollo Teriyaki", 15.50, "Pollo a la parrilla con salsa teriyaki."));
        dishList3.add(new Dish("Ramen de Mariscos", 13.75, "Sopa de fideos con mariscos y verduras."));
        dishList3.add(new Dish("Dumplings de Cerdo", 10.25, "Empanadillas al vapor rellenas de cerdo."));
        List<Drink> drinkList3 = new ArrayList<>();
        drinkList3.add(new Drink("Sake Caliente", 9.00, "Sake japonés caliente."));
        drinkList3.add(new Drink("Té Verde Frío", 4.75, "Té verde con hielo."));
        drinkList3.add(new Drink("Refresco de Lichis", 3.25, "Refresco de lichis natural."));
        drinkList3.add(new Drink("Agua de Jengibre", 2.99, "Agua con infusión de jengibre."));
        List<Complements> complementsList3 = new ArrayList<>();
        complementsList3.add(new Complements("Edamames", 5.50, "Habas de soja al vapor con sal."));
        complementsList3.add(new Complements("Ensalada de Algas", 7.25, "Algas marinas con sésamo y aderezo."));
        complementsList3.add(new Complements("Tempura de Verduras", 8.00, "Verduras tempura con salsa de inmersión."));
        complementsList3.add(new Complements("Sopa Miso", 4.50, "Sopa de miso con tofu y algas."));

        restaurant3.setDishList(dishList3);
        restaurant3.setDrinkList(drinkList3);
        restaurant3.setComplementsList(complementsList3);


        // Restaurante "Carnes y Parrilla"
        Restaurant restaurant4 = new Restaurant("Carnes y Parrilla");
        List<Dish> dishList4 = new ArrayList<>();
        dishList4.add(new Dish("Churrasco Argentino", 25.99, "Bistec argentino a la parrilla."));
        dishList4.add(new Dish("Costillas BBQ", 18.50, "Costillas de cerdo con salsa barbacoa."));
        dishList4.add(new Dish("Brochetas de Res", 16.75, "Brochetas de carne de res con verduras."));
        dishList4.add(new Dish("Hamburguesa Gourmet", 14.25, "Hamburguesa con queso, tocino y aguacate."));
        List<Drink> drinkList4 = new ArrayList<>();
        drinkList4.add(new Drink("Vino Malbec", 12.00, "Vino tinto argentino."));
        drinkList4.add(new Drink("Whisky ahumado", 9.75, "Whisky ahumado con hielo."));
        drinkList4.add(new Drink("Cerveza Artesanal", 5.50, "Cerveza artesanal de la casa."));
        drinkList4.add(new Drink("Limonada de Frambuesa", 4.25, "Limonada con puré de frambuesa."));
        List<Complements> complementsList4 = new ArrayList<>();
        complementsList4.add(new Complements("Papas Asadas", 6.50, "Papas asadas con ajo y romero."));
        complementsList4.add(new Complements("Ensalada César", 8.25, "Lechuga romana, aderezo césar y crutones."));
        complementsList4.add(new Complements("Espárragos a la Parrilla", 7.00, "Espárragos asados con aceite de oliva."));
        complementsList4.add(new Complements("Chimichurri", 3.50, "Salsa de hierbas para acompañar las carnes."));

        restaurant4.setDishList(dishList4);
        restaurant4.setDrinkList(drinkList4);
        restaurant4.setComplementsList(complementsList4);


        // Add restaurants
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        restaurantList.add(restaurant3);
        restaurantList.add(restaurant4);

    }
}
