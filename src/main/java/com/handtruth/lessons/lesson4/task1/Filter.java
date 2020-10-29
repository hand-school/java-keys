package com.handtruth.lessons.lesson4.task1;

public class Filter {
    public static void main(String[] args) {
        char filter = 'И';
        String[] lastNames = new String[]{"Петров", "Иванов", "Идоров"};
        int num = 0;
        for (int i = 0; i<lastNames.length; i++) {
            if (lastNames[i].charAt(0) == filter) {
                num++;
            }
        }
        System.out.println(num);;
    }
}
