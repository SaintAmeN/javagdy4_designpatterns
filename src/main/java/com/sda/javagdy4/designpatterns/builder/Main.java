package com.sda.javagdy4.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Bohater.BohaterBuilder builder = new Bohater.BohaterBuilder();

        Bohater bohater = builder
                .setNazwisko("Nowak")
                .setImiePsa("Mruczek")
                .setObwodGlowy(20)
                .setSiedzi(true)
                .setImie("Cokolwiek")
                .createBohater();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("oiajwd").append("awifhg");

    }
}
