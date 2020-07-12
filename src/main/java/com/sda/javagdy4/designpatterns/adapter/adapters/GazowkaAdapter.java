package com.sda.javagdy4.designpatterns.adapter.adapters;

import com.sda.javagdy4.designpatterns.adapter.IHomeDevice;
import com.sda.javagdy4.designpatterns.adapter.devices.Gazowka;

public class GazowkaAdapter implements IHomeDevice {
    private final Gazowka gazowka;

    public GazowkaAdapter(Gazowka gazowka) {
        this.gazowka = gazowka;
    }

    @Override
    public void turnOn() {
        gazowka.setOn(true);
    }

    @Override
    public void turnOff() {
        gazowka.setOn(false);
    }

    @Override
    public boolean getStatus() {
        return gazowka.isOn();
    }
}
