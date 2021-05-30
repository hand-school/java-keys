//package com.handtruth.lessons.lesson14.task2;
//
//public class FirstStateThread extends Thread {
//
//    public Object lock;
//
//    @Override
//    public void run() {
//        synchronized (lock) {
//            System.out.println("Имя потока - " + Thread.currentThread().getName());
//            lock.notify();
//            try {
//                lock.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
