package com.handtruth.lessons.lesson6.training;

public class Character {
    public String name;
    public Integer maxHealth;
    public Integer health;
    public Integer maxMana;
    public Integer mana;
    public Integer defense;
    public Integer damage;

    public Character(String name, Integer maxHealth, Integer health, Integer maxMana, Integer mana, Integer defense, Integer damage) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.maxMana = maxMana;
        this.mana = mana;
        this.defense = defense;
        this.damage = damage;
    }

    public void attack(Character ch1) {
        ch1.health -= this.damage;
    }
    public void skill() {

    }

    @Override
    public String toString() {
        return "Character \n name = " + this.name;
// атака зависит от брони противника; хп < 0 => hp = 0;
//  придумать скиллы
    }
}
