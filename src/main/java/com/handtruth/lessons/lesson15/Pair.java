package com.handtruth.lessons.lesson15;

public class Pair<T> {
    public T first;
    public T second;
    private String info;
    private final Integer info2 = 3;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
        this.info = "INFO";
    }

    public Pair() {
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String getInfo() {
        return info;
    }

    private String getInfo(String tail) {
        return info + tail;
    }

    @Override
    public String toString() {
        return "Pair{first=" + first + ", second=" + second + '}';
    }
}
