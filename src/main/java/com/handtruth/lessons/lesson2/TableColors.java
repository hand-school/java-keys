package com.handtruth.lessons.lesson2;

public class TableColors {

    public static boolean tableColor(int pointX1, int pointY1, int pointX2, int pointY2) {
        return false;
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
