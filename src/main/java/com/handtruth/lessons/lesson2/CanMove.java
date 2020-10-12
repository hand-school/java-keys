package com.handtruth.lessons.lesson2;

public class CanMove {

    public static boolean canMove(int start_x, int start_y, int end_x, int end_y) {
        return true;
    }


    //  Medium (Шахматная доска)
//  Программа получает на вход четыре числа от 1 до 8 каждое.
//  Первые два числа — задают координаты местонахождения ладьи в данный момент (номер строки и столбца),
//  два других числа — координаты клетки, в которую необходимо переместить фигуру
//  (гарантируется, что клетки не совпадают).
//  Программа должна вернуть True", если из первой клетки ходом ладьи можно попасть во вторую, иначе — False.
    public static void main(String[] args) {
        System.out.println(canMove(1, 1, 1, 8));  // True
        System.out.println(canMove(2, 1, 5, 1));  // True
        System.out.println(canMove(1, 1, 5, 6));  // False
        System.out.println(canMove(5, 5, 4, 4));  // False
    }
}
