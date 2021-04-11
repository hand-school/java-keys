package com.handtruth.lessons.lesson12.genericExample;

public class Main {

    public static void main(String[] args) {

        AppleCartridge apple = new AppleCartridge();
        MangoCartridge mango = new MangoCartridge();
        GrapeCartridge grape = new GrapeCartridge();

        Juul<MangoCartridge> juul = new Juul<>("Black", mango);

        juul.getCartridge().mango();
    }
}
