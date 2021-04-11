package com.handtruth.lessons.lesson12.GenericExample;

public class Juul <T extends Cartridge> {

    private String bodyColor;
    private T cartridge;

    public Juul(String bodyColor, T cartridge) {
        this.bodyColor = bodyColor;
        this.cartridge = cartridge;
    }

    public T getCartridge() {
        return cartridge;
    }
}
