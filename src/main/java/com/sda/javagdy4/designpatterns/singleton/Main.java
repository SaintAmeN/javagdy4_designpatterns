package com.sda.javagdy4.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        int dlugosc = Configuration.INSTANCE.getMaxDlugoscNazwiska();
        System.out.println(dlugosc);

        int dlugosc2= Configurationv2.getINSTANCE().getMaxDlugoscNazwiska();

        int dlugosc3= Configurationv3.INSTANCE.getMaxDlugoscNazwiska();

//        Configuration configuration = new Configuration();
    }

    public static void metoda(){

    }
}
