package com.sda.javagdy4.designpatterns.decorator.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomPizza implements IPizza {
    private final IPizza basePizza;
    private List<String> additionalIngredients = new ArrayList<>();

    public CustomPizza(IPizza simplePizza) {
        this.basePizza = simplePizza;
    }

    public CustomPizza(IPizza basePizza, List<String> additionalIngredients) {
        this.basePizza = basePizza;
        this.additionalIngredients = additionalIngredients;
    }

    public CustomPizza(IPizza basePizza, String... additionalIngredients) {
        this.basePizza = basePizza;
        this.additionalIngredients.addAll(Arrays.asList(additionalIngredients));
    }

    /**
     * Dzieki tej metodzie, mozemy dopisywac dodatki do pizzy.
     *
     * @param ingredient - nowy dodatek, ktory chcemy dodac do pizzy.
     */
    public void addIngredient(String ingredient) {
        additionalIngredients.add(ingredient);
    }

    @Override
    public List<String> getIngredients() {
        List<String> allIngredients = new ArrayList<>(additionalIngredients);
        allIngredients.addAll(basePizza.getIngredients());

        return allIngredients;
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + (additionalIngredients.size() * 2.50);
    }
}
