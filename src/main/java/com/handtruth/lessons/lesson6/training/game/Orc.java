package com.handtruth.lessons.lesson6.training.game;

public class Orc extends Character{

    public Orc(String name, Integer maxHealth, Integer health, Integer maxMana, Integer mana, Integer defense, Integer damage) {
        super(name, maxHealth, health, maxMana, mana, defense, damage);
    }

    @Override
    public void skill() {
        this.health /= 2;
        this.maxHealth /= 2;
        this.mana -= 30;
        this.damage *= 2;
    }
}
