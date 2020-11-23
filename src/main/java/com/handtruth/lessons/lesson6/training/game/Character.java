package com.handtruth.lessons.lesson6.training.game;

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
        if (ch1.defense > 0) {
            ch1.defense -= this.damage;
        } else {
            if (ch1.defense < 0) {
                ch1.defense = 0;
            }
            ch1.health -= this.damage;
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public void skill() {
        System.out.println("error");
    }

    @Override
    public String toString() {
        return "Character \n name = " + this.name;
// атака зависит от брони противника; хп < 0 => hp = 0;
//  придумать скиллы : восстанавливает 10хп, следующая атакая наносит на 5 урона больше,
    }
}
