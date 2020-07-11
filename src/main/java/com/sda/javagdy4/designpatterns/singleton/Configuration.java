package com.sda.javagdy4.designpatterns.singleton;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Data
public class Configuration {
    public static final Configuration INSTANCE = new Configuration();

    private String klucz;
    private String jakisSobieParametr;
    private int aTerazWartoscLiczbowa;
    private int maxDlugoscNazwiska;

    private Configuration() {
        Properties properties = new Properties();

        InputStream inputStream = Configuration.class.getResourceAsStream("/config.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        klucz = String.valueOf(properties.get("klucz"));
        jakisSobieParametr = String.valueOf(properties.get("jakis.sobie.parametr"));
        aTerazWartoscLiczbowa = Integer.parseInt(String.valueOf(properties.get("a.teraz.liczbowa")));
        maxDlugoscNazwiska = Integer.parseInt(String.valueOf(properties.get("maksymalna.dlugosc.nazwiska")));
    }
}
