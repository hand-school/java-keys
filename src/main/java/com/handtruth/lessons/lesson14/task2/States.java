package com.handtruth.lessons.lesson14.task2;

// Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя ПО ОЧЕРЕДИ.
public class States {

    static class ThreadPrint extends Thread {
        public Object lock;

        public ThreadPrint(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            for (int i=0; i < 50; i++) {
                synchronized (lock) {
                    System.out.println("Имя потока - " + Thread.currentThread().getName());
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();
        ThreadPrint threadPrint = new ThreadPrint(lock);
        ThreadPrint threadPrint1 = new ThreadPrint(lock);

        threadPrint.start();
        threadPrint1.start();


    }
}
