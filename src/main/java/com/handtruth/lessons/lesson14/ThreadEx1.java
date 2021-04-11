package com.handtruth.lessons.lesson14;

import java.util.Random;

public class ThreadEx1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            i++;
            try {
                sleep(6);
            } catch (InterruptedException e) {
                System.out.printf("Мы внезапно прервались, сохраняем промежуточный результат: %s\n", i);
                Runtime.getRuntime().exit(0);
            }
        }
        Random random = new Random();
        try {
            if (random.nextBoolean()) {
                sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Мы внезапно прервались");
        }
        System.out.printf("Мы закончили и сохранили результаты {%s}!!!\n", i);
    }
}
