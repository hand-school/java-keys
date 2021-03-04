package com.handtruth.lessons.lesson7.lab9;

public class NumObserver implements Observer{

    String name;

    public NumObserver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Integer num) {
        System.out.println(name + "\nyour number has changed to odd:\n" + num);
    }
}
