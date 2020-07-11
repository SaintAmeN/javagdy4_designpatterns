package com.sda.javagdy4.designpatterns.singleton;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Configurationv3 {
    INSTANCE;

    private String klucz;
    private String jakisSobieParametr;
    private int aTerazWartoscLiczbowa;
    private int maxDlugoscNazwiska;

    Configurationv3() {
        Properties properties = new Properties();

        InputStream inputStream = Configurationv3.class.getResourceAsStream("/config.properties");
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

    public String getKlucz() {
        return klucz;
    }

    public void setKlucz(String klucz) {
        this.klucz = klucz;
    }

    public String getJakisSobieParametr() {
        return jakisSobieParametr;
    }

    public void setJakisSobieParametr(String jakisSobieParametr) {
        this.jakisSobieParametr = jakisSobieParametr;
    }

    public int getaTerazWartoscLiczbowa() {
        return aTerazWartoscLiczbowa;
    }

    public void setaTerazWartoscLiczbowa(int aTerazWartoscLiczbowa) {
        this.aTerazWartoscLiczbowa = aTerazWartoscLiczbowa;
    }

    public int getMaxDlugoscNazwiska() {
        return maxDlugoscNazwiska;
    }

    public void setMaxDlugoscNazwiska(int maxDlugoscNazwiska) {
        this.maxDlugoscNazwiska = maxDlugoscNazwiska;
    }
}
