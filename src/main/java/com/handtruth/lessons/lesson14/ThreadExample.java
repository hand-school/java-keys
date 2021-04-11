package com.handtruth.lessons.lesson14;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new ThreadEx1();
        thread1.setDaemon(true);
        thread1.start();
        System.out.printf("Current thread_id = %d\n", Thread.currentThread().getId());
//        Thread.sleep(5);
//        thread1.interrupt();
//        System.out.println("Попытались остановить поток");
        thread1.join(120);
        System.out.println("Мы закончили!");
    }
}
