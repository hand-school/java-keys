//package com.handtruth.lessons.lesson14.task2;
//
//public class SecondStateThread extends Thread {
//    @Override
//    public void run() {
//        synchronized (lo) {
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
