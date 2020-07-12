package com.sda.javagdy4.designpatterns.decorator.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePizza implements IPizza {
    private List<String> ingredients = new ArrayList<>();
    private double price = 10.0;

    public SimplePizza() {
        this.ingredients.addAll(Arrays.asList("sos", "ser"));
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
