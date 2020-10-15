package com.handtruth.lessons.lesson3.task1;

public class NOD {

// Задано двузначное число
// Программа выводит его наименьший делитель, не равный 1.
// В программе нельзя использовать вложенные условия.
// Если пользователь вводит не двузначное число
// — должна выводится строка “Введено неверное число” и заново запрашиваться ввод.
    public static void main(String[] args) {
        if (ND(55) != -1) {
            System.out.println(ND(55));
        } else {
            System.out.println("Введено неверное число");
        }
    }
    private static int ND(int num) {
        int n = 2;
        if (num > 9 && num < 100) {
            while (num % n != 0) {
                n++;
            }
            return n;
        } else {
            return -1;
        }
    }
}
