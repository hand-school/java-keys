package com.handtruth.lessons.lesson6.training.game;

public class Human extends Character {
    public Integer age;

    public Human(String name, Integer maxHealth, Integer health, Integer maxMana, Integer mana, Integer defense, Integer damage, Integer age) {
        super(name, maxHealth, health, maxMana, mana, defense, damage);
        this.age = age;

    }

    @Override
    public void skill() {
        this.health += 10;
        this.mana -= 30;
    }
}
