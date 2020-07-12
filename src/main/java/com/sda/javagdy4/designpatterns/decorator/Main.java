package com.sda.javagdy4.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Hero hero = Hero.createSimpleMarianHero();

        HeroOnAHorse heroOnAHorse = new HeroOnAHorse(hero);
        System.out.println("Hero attack: " + hero.getAttackPoints());
        System.out.println("Hero protec: " + hero.getDefencePoints());
        System.out.println("Hero speed: " + hero.getSpeed());

        System.out.println("heroOnAHorse attack: " + heroOnAHorse.getAttackPoints());
        System.out.println("heroOnAHorse protec: " + heroOnAHorse.getDefencePoints());
        System.out.println("heroOnAHorse speed: " + heroOnAHorse.getSpeed());

        try {
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
            heroOnAHorse.hit(5);
        } catch (DropHorse dh) {
            System.err.println("Hero lost horse.");
        }
    }
}
