package com.handtruth.lessons.lesson14;

public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                storage.value += 1;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                storage.value -= 1;
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(storage.value);
    }
}
