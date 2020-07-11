package com.sda.javagdy4.designpatterns.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drukarka drukarka = new Drukarka();

        String komenda;

        do {
            komenda = scanner.nextLine();

            if (komenda.startsWith("zmien")) {        // zmien inverter
                obslugaZmianyFormattera(drukarka, komenda.split(" ")[1]);
            }else if(komenda.startsWith("formatuj")){
                obslugaWypisu(drukarka, komenda.split(" ", 2)[1]);
            }

        } while (!komenda.equalsIgnoreCase("quit"));
    }

    private static void obslugaWypisu(Drukarka drukarka, String tekstDoDruku) {
        System.out.println(drukarka.drukuj(tekstDoDruku));;
    }

    private static void obslugaZmianyFormattera(Drukarka drukarka, String type) {
        if (type.equalsIgnoreCase("inverter")) {
            drukarka.setFormatter(new FormatterInverter());
        } else if (type.equalsIgnoreCase("upper")) {
            drukarka.setFormatter(new FormatterUpper());
        } else if (type.equalsIgnoreCase("splitter")) {
            drukarka.setFormatter(new FormatterSplitter());
        }
    }
}
