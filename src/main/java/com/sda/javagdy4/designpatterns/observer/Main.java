package com.sda.javagdy4.designpatterns.observer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Uczen uczen1= new Uczen("Marian");
        Uczen uczen2= new Uczen("Ania");
        Uczen uczen3= new Uczen("Gosia");
        Uczen uczen4= new Uczen("Rafal");
        Uczen uczen5= new Uczen("Mirek");

        Nauczyciel nauczyciel = new Nauczyciel();
        nauczyciel.addObserver(uczen1);
        nauczyciel.addObserver(uczen2);
        nauczyciel.addObserver(uczen3);
        nauczyciel.addObserver(uczen4);
        nauczyciel.addObserver(uczen5);

        nauczyciel.setTrescLekcji(new Wiadomosc("Ja", "Dzisiaj nie ma zajec"));
    }
}
