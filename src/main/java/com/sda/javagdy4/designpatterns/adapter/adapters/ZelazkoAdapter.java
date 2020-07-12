package com.sda.javagdy4.designpatterns.adapter.adapters;

import com.sda.javagdy4.designpatterns.adapter.IHomeDevice;
import com.sda.javagdy4.designpatterns.adapter.devices.Zelazko;

public class ZelazkoAdapter extends Zelazko implements IHomeDevice {
    @Override
    public void turnOn() {
        turnDeviceOn();
    }

    @Override
    public void turnOff() {
        turnDeviceOff();
    }

    @Override
    public boolean getStatus() {
        return false;
    }
}
