package com.sda.javagdy4.designpatterns.builder;

import lombok.Builder;

public class Bohater {
    private String imie, nazwisko, imieOjca, imieMatki, imiePsa, imieKota;
    private int wiek, wzrost, rozmiarButa, waga, obwodGlowy;
    private boolean zyje, siedzi, zonaty, ukonczylStudia, maPrace;

    private Bohater(String imie, String nazwisko, String imieOjca, String imieMatki, String imiePsa, String imieKota, int wiek, int wzrost, int rozmiarButa, int waga, int obwodGlowy, boolean zyje, boolean siedzi, boolean zonaty, boolean ukonczylStudia, boolean maPrace) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.imieOjca = imieOjca;
        this.imieMatki = imieMatki;
        this.imiePsa = imiePsa;
        this.imieKota = imieKota;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.rozmiarButa = rozmiarButa;
        this.waga = waga;
        this.obwodGlowy = obwodGlowy;
        this.zyje = zyje;
        this.siedzi = siedzi;
        this.zonaty = zonaty;
        this.ukonczylStudia = ukonczylStudia;
        this.maPrace = maPrace;
    }

    public static class BohaterBuilder {

        private String imie;
        private String nazwisko;
        private String imieOjca;
        private String imieMatki;
        private String imiePsa;
        private String imieKota;
        private int wiek;
        private int wzrost;
        private int rozmiarButa;
        private int waga;
        private int obwodGlowy;
        private boolean zyje;
        private boolean siedzi;
        private boolean zonaty;
        private boolean ukonczylStudia;
        private boolean maPrace;

        public BohaterBuilder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public BohaterBuilder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public BohaterBuilder setImieOjca(String imieOjca) {
            this.imieOjca = imieOjca;
            return this;
        }

        public BohaterBuilder setImieMatki(String imieMatki) {
            this.imieMatki = imieMatki;
            return this;
        }

        public BohaterBuilder setImiePsa(String imiePsa) {
            this.imiePsa = imiePsa;
            return this;
        }

        public BohaterBuilder setImieKota(String imieKota) {
            this.imieKota = imieKota;
            return this;
        }

        public BohaterBuilder setWiek(int wiek) {
            this.wiek = wiek;
            return this;
        }

        public BohaterBuilder setWzrost(int wzrost) {
            this.wzrost = wzrost;
            return this;
        }

        public BohaterBuilder setRozmiarButa(int rozmiarButa) {
            this.rozmiarButa = rozmiarButa;
            return this;
        }

        public BohaterBuilder setWaga(int waga) {
            this.waga = waga;
            return this;
        }

        public BohaterBuilder setObwodGlowy(int obwodGlowy) {
            this.obwodGlowy = obwodGlowy;
            return this;
        }

        public BohaterBuilder setZyje(boolean zyje) {
            this.zyje = zyje;
            return this;
        }

        public BohaterBuilder setSiedzi(boolean siedzi) {
            this.siedzi = siedzi;
            return this;
        }

        public BohaterBuilder setZonaty(boolean zonaty) {
            this.zonaty = zonaty;
            return this;
        }

        public BohaterBuilder setUkonczylStudia(boolean ukonczylStudia) {
            this.ukonczylStudia = ukonczylStudia;
            return this;
        }

        public BohaterBuilder setMaPrace(boolean maPrace) {
            this.maPrace = maPrace;
            return this;
        }

        public Bohater createBohater() {
            return new Bohater(imie, nazwisko, imieOjca, imieMatki, imiePsa, imieKota, wiek, wzrost, rozmiarButa, waga, obwodGlowy, zyje, siedzi, zonaty, ukonczylStudia, maPrace);
        }
    }
}
