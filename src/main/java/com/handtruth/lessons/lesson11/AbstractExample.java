package com.handtruth.lessons.lesson11;

public abstract class AbstractExample {

    public boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    public abstract boolean isOdd(Integer num);
}
