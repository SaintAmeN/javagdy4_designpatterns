package com.sda.javagdy4.designpatterns.decorator;

public class HeroOnAHorse implements IHero {
    private final Hero hero;
    private int healthIncrease;
    private final int defenceIncrease;
    private final int speedIncrease;
    private final int attackIncrease;

    public HeroOnAHorse(Hero hero) {
        this.hero = hero;
        this.healthIncrease = 20;
        this.defenceIncrease = 30;
        this.speedIncrease = 20;
        this.attackIncrease = 15;
    }

    public HeroOnAHorse(Hero hero, int healthIncrease, int defenceIncrease, int speedIncrease, int attackIncrease) {
        this.hero = hero;
        this.healthIncrease = healthIncrease;
        this.defenceIncrease = defenceIncrease;
        this.speedIncrease = speedIncrease;
        this.attackIncrease = attackIncrease;
    }

    @Override
    public int getAttackPoints() {
        return hero.getAttackPoints() + attackIncrease;
    }

    @Override
    public int getDefencePoints() {
        return hero.getDefencePoints() + defenceIncrease;
    }

    @Override
    public int getArmor() {
        return hero.getArmor() * 2;
    }

    @Override
    public int getSpeed() {
        return hero.getSpeed() + speedIncrease;
    }

    @Override
    public double getMorale() {
        return hero.getMorale();
    }

    @Override
    public void hit(int points) {
        healthIncrease -= points;
        System.out.println("Hero on a horse hp: " + healthIncrease);
        if(healthIncrease <= 0){
            hero.hit(points);
            throw new DropHorse("Horse lost all health");
        }
    }
}
