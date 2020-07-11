package com.sda.javagdy4.designpatterns.strategy;

public class FormatterUpper implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toUpperCase();
    }
}
