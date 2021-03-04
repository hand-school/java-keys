package com.handtruth.lessons.lesson7.lab9;

import java.util.ArrayList;
import java.util.List;

public class NumObserved implements Observed{

    Observer numObserver;
    List<Observer> observers = new ArrayList<>();
    Integer num;

    public void changeNum(Integer num) {
        this.num = num;
        if (this.num % 2 != 0) {
            notifyObserver();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.handleEvent(this.num);
        }
    }
}
