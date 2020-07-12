package com.sda.javagdy4.designpatterns.decorator.zad2;

public class PizzaFactory {
    public static CustomPizza createMiesnaPizza() {
        return new CustomPizza(new SimplePizza(), "kurczak", "bekon", "salami", "szynka", "prosciuto");
    }
}
