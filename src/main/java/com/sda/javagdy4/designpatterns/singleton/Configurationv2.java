package com.sda.javagdy4.designpatterns.singleton;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Data
public class Configurationv2 {
    private static Configurationv2 INSTANCE = null;

    private String klucz;
    private String jakisSobieParametr;
    private int aTerazWartoscLiczbowa;
    private int maxDlugoscNazwiska;

//    W pelni bezpieczna wielowatkowo implementacja lazy singleton
//    private final static Object lock = new Object();
//    public synchronized static Configurationv2 getINSTANCE() {
//        if(INSTANCE == null){
//            synchronized (lock) {
//                if(INSTANCE == null) {
//                    INSTANCE = new Configurationv2();
//                }
//            }
//        }
//        return INSTANCE;
//    }
//

    public static Configurationv2 getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new Configurationv2();
        }
        return INSTANCE;
    }

    private Configurationv2() {
        Properties properties = new Properties();

        InputStream inputStream = Configurationv2.class.getResourceAsStream("/config.properties");
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
