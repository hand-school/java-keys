package com.handtruth.lessons.lesson14.task1;

import java.util.Arrays;
import java.util.List;

// Запускаются два потока. Первый поток находит максимум в массиве, второй — минимум.
// Результаты вычислений возвращаются в метод main().
public class MaxMin_2 {

    public static void main(String[] args) {
        int[] array = new int[]{10, 12, 3324, 124, 52, 6124, 7, 800, 19, 1099};

        MaxThread maxThread = new MaxThread(array);
        MinThread minThread = new MinThread(array);

        maxThread.setDaemon(true);
        minThread.setDaemon(true);

        maxThread.start();

        try {
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        minThread.start();

        try {
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

