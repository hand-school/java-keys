package com.handtruth.lessons.lesson12;

public class PairAfterCompilation {
    public Object first;
    public Object second;

    public PairAfterCompilation(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{first=" + first + ", second=" + second + '}';
    }
}
