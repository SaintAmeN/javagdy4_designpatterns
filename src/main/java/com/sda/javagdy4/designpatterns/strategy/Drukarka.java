package com.sda.javagdy4.designpatterns.strategy;

public class Drukarka {
    private IFormatterCzcionki formatter = null;

    public void setFormatter(IFormatterCzcionki formatter) {
        this.formatter = formatter;
    }

    public String drukuj(String tekst){
        return formatter.zamienTekst(tekst);
    }
}
