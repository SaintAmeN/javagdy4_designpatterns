package com.sda.javagdy4.designpatterns.abstractfactory;

import com.sda.javagdy4.designpatterns.abstractfactory.carpackage.AbstractCarFactory;
import com.sda.javagdy4.designpatterns.abstractfactory.carpackage.Car;
import com.sda.javagdy4.designpatterns.abstractfactory.carpackage.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.createBMWe36();


        Car car2 = AbstractCarFactory.createBMWe36();



//        Car samochod = new Car();
    }
}
