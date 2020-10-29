package com.handtruth.lessons.lesson2;

public class TableColors {

    public static boolean tableColor(int pointX1, int pointY1, int pointX2, int pointY2) {
        return firstPointRes(pointX1, pointY1) == secondPointRes(pointX2, pointY2);
    }

    private static boolean firstPointRes(int pointX1, int pointY1) {
        if (pointX1 % 2 == 0) {
            return pointY1 % 2 == 0;
        } else {
            return pointY1 % 2 != 0;
        }
    }
    private static boolean secondPointRes(int pointX2, int pointY2) {
        if (pointX2 % 2 == 0) {
            return pointY2 % 2 == 0;
        } else {
            return pointY2 % 2 != 0;
        }
    }

    //  Medium (Шахматная доска)
//  Программа получает на вход четыре числа от 1 до 8 каждое.
//  Первые два числа — задают координаты первой клетки (номер строки и столбца),
//  вторые — координаты второй клетки (гарантируется, что клетки не совпадают).
//  Программа должна вернуть True, если выбранные клетки одинакового цвета, иначе — False.
    public static void main(String[] args) {
        System.out.println(tableColor(1, 1, 1, 1));  // True
        System.out.println(tableColor(1, 1, 8, 8));  // True
        System.out.println(tableColor(4, 4, 7, 5));  // True
        System.out.println(tableColor(2, 3, 8, 8));  // False
    }
}
