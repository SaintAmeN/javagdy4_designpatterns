package com.sda.javagdy4.designpatterns.adapter.devices;

public final class Czajnik {
    private boolean wlaczony;

    public void on() {
        wlaczony = true;
    }

    public void off() {
        wlaczony = false;
    }

    public boolean isWlaczony() {
        return wlaczony;
    }
}
