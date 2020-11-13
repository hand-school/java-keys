package com.handtruth.lessons.lesson6.training;

public class Orc extends Character{

    public Orc(String name, Integer maxHealth, Integer health, Integer maxMana, Integer mana, Integer defense, Integer damage) {
        super(name, maxHealth, health, maxMana, mana, defense, damage);
    }

    @Override
    public void skill() {
//        another skill
    }
}
