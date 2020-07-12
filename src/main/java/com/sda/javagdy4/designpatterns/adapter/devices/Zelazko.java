package com.sda.javagdy4.designpatterns.adapter.devices;

public class Zelazko {
    private boolean enabled;

    public void turnDeviceOn() {
        enabled = true;
    }

    public void turnDeviceOff() {
        enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
