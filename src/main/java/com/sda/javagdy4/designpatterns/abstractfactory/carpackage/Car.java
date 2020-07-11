package com.sda.javagdy4.designpatterns.abstractfactory.carpackage;

import lombok.Data;

@Data
public class Car {
    private String marka;
    private String model;
    private double pojSilnika;
    private int iloscKol;
    private int iloscDrzwi;
    private int iloscKoni;
    private boolean diesel;

    Car(String marka, String model, double pojSilnika, int iloscKol, int iloscDrzwi, int iloscKoni, boolean diesel) {
        this.marka = marka;
        this.model = model;
        this.pojSilnika = pojSilnika;
        this.iloscKol = iloscKol;
        this.iloscDrzwi = iloscDrzwi;
        this.iloscKoni = iloscKoni;
        this.diesel = diesel;
    }

}
