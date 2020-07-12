package com.sda.javagdy4.designpatterns.adapter;

import com.sda.javagdy4.designpatterns.adapter.adapters.CzajnikAdapter;
import com.sda.javagdy4.designpatterns.adapter.adapters.GazowkaAdapter;
import com.sda.javagdy4.designpatterns.adapter.adapters.ZelazkoAdapter;
import com.sda.javagdy4.designpatterns.adapter.devices.Czajnik;
import com.sda.javagdy4.designpatterns.adapter.devices.Gazowka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IHomeDevice> homeDevices = new ArrayList<>();
        homeDevices.add(new CzajnikAdapter(new Czajnik()));
        homeDevices.add(new GazowkaAdapter(new Gazowka()));
        homeDevices.add(new ZelazkoAdapter());

        turnAllDevicesOff(homeDevices);
    }

    private static void turnAllDevicesOff(List<IHomeDevice> homeDevices) {
        for (IHomeDevice homeDevice : homeDevices) {
            homeDevice.turnOff();
        }
    }
}
