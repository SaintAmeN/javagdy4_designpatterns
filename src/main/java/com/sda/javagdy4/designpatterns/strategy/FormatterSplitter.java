package com.sda.javagdy4.designpatterns.strategy;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tekstDoZamiany.length(); i++) {
            builder.append(tekstDoZamiany.charAt(i)).append(' ');
        }
        return builder.toString();
    }
}
