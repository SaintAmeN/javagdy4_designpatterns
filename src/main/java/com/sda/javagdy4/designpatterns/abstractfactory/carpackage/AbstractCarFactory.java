package com.sda.javagdy4.designpatterns.abstractfactory.carpackage;

public abstract class AbstractCarFactory {
    public static Car createBMWe36() {
        return new Car("BMW", "e36", 1.6, 4, 5, 100, false);
    }

    public static Car createBMWe46() {
        return new Car("BMW", "e46", 2.0, 4, 5, 140, false);
    }
}
