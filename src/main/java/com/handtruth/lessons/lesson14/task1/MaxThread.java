package com.handtruth.lessons.lesson14.task1;

public class MaxThread extends Thread {
    private int[] array;

    public MaxThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
        }
        System.out.println("Максимальное число = " + max);
    }
}