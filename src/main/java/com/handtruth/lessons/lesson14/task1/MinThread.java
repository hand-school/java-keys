package com.handtruth.lessons.lesson14.task1;

public class MinThread extends Thread {
    private int[] array;

    public MinThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число = " + min);
    }
}