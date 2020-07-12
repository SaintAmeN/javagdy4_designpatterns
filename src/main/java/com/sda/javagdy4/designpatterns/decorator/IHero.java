package com.sda.javagdy4.designpatterns.decorator;

public interface IHero {

    int getAttackPoints();
    int getDefencePoints();
    int getArmor();
    int getSpeed();
    double getMorale();

    void hit(int points);
}
