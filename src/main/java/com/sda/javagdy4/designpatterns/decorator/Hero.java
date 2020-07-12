package com.sda.javagdy4.designpatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public final class Hero implements IHero {
    private String name;
    private int healthPoints;

    private int attackPoints;
    private int defencePoints;
    private int armor;
    private int speed;
    private double morale;

    public Hero(String name) {
        this.name = name;
    }


    public static Hero createSimpleMarianHero() {
        return new HeroBuilder()
                .armor(10)
                .attackPoints(100)
                .defencePoints(50)
                .healthPoints(100)
                .name("Marian")
                .morale(100.0)
                .speed(30)
                .build();
    }

    @Override
    public void hit(int points) {
        healthPoints -= points;
        System.out.println("Health points in hero: " + healthPoints);
    }
}
