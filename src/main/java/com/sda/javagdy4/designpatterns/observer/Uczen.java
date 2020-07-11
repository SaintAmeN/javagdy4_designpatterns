package com.sda.javagdy4.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Uczen implements Observer {
    private String imie;

    public Uczen(String imie) {
        this.imie = imie;
    }

//    public void trescLekcjiZostalaZmieniona(String trescLekcji) {
//        System.out.println("Jestem " + imie + " i zostaje powiadomiony o: " + trescLekcji);
//    }

    @Override
    public void update(Observable o, Object trescLekcji) {
        if(trescLekcji instanceof Wiadomosc){
            Wiadomosc tresc = (Wiadomosc) trescLekcji;
            System.out.println("Jestem " + imie + " i zostaje powiadomiony o: " + tresc.getTresc());
        }
    }
}
