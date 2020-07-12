package com.sda.javagdy4.designpatterns.decorator.zad2;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza implements IPizza {
    private final SimplePizza simplePizza;
    private List<String> additionalIngredients = new ArrayList<>();

    public CustomPizza(SimplePizza simplePizza) {
        this.simplePizza = simplePizza;
    }

    /**
     * Dzieki tej metodzie, mozemy dopisywac dodatki do pizzy.
     * @param ingredient - nowy dodatek, ktory chcemy dodac do pizzy.
     */
    public void addIngredient(String ingredient){
        additionalIngredients.add(ingredient);
    }

    @Override
    public List<String> getIngredients() {
        List<String> allIngredients = new ArrayList<>(additionalIngredients);
        allIngredients.addAll(simplePizza.getIngredients());

        return allIngredients;
    }

    @Override
    public double getPrice() {
        return simplePizza.getPrice() + (additionalIngredients.size() * 2.50);
    }
}
