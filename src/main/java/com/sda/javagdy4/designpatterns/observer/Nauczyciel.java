package com.sda.javagdy4.designpatterns.observer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Observable;
import java.util.Vector;

@Data
@NoArgsConstructor
public class Nauczyciel extends Observable{
    private Wiadomosc trescLekcji;

    public void setTrescLekcji(Wiadomosc trescLekcji) {
        this.trescLekcji = trescLekcji;

        setChanged();
        notifyObservers(trescLekcji);
    }
}
