package com.sda.javagdy4.designpatterns.abstractfactory.carpackage;

public class CarFactory {
    public Car createBMWe36() {
        return new Car("BMW", "e36", 1.6, 4, 5, 100, false);
    }

    public Car createBMWe46() {
        return new Car("BMW", "e46", 2.0, 4, 5, 140, false);
    }
}
