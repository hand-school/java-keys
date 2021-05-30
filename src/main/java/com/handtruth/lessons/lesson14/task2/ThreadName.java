package com.handtruth.lessons.lesson14.task2;

public class ThreadName {

    public static synchronized void getName(Thread thread) {
        System.out.println("Имя потока - " + thread.getName());
    }
}
