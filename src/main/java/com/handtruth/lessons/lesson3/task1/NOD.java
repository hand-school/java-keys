package com.handtruth.lessons.lesson3.task1;

public class NOD {

// Задано двузначное число
// Программа выводит его наименьший делитель, не равный 1.
// В программе нельзя использовать вложенные условия.
// Если пользователь вводит не двузначное число
// — должна выводится строка “Введено неверное число” и заново запрашиваться ввод.
    public static void main(String[] args) {
        int n = ND(97);
        if (n != -1) {
            System.out.println(n);
        } else {
            System.out.println("Введено неверное число");
        }
    }
    private static int ND(int num) {
        if (num > 9 && num < 100) {
            for (int i = 2; i <= num/2; i++ ) {
                if (num % i == 0) {
                    return i;
                }
            }
            return num;
        } else {
            return -1;
        }
    }
}
