package com.handtruth.lessons.lesson2.task1;

class IfElse {

    /**
     * Trivial
     * <p>
     * На вход подаются два числа.
     * Если первое больше второго, вывести 1,
     * Если равны - 0,
     * Если второе больше первого - -1
     */
    public static int compare(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a > b) {
            return 1;
        }
        if (a < b) {
            return -1;
        }
        return 0;
    }


    /**
     * Easy
     * <p>
     * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
     * вернуть строку вида: «21 год», «32 года», «12 лет».
     */
    public static String ageDescription(int age) {
        // TODO your code
        return "TODO";
    }

    /**
     * Easy
     * <p>
     * Треугольник задан длинами своих сторон a, b, c.
     * Проверить, является ли данный треугольник остроугольным (вернуть 0),
     * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
     * Если такой треугольник не существует, вернуть -1.
     */
    public static int triangleKind(double a, double b, double c) {
        // TODO your code
        return -1;
    }

    public static float multi_div(int a, int b, boolean isDivision) {
        // TODO your code
        return 1f;
    }

    /**
     * Medium
     * <p>
     * Даны четыре точки на одной прямой: A, B, C и D.
     * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
     * Найти длину пересечения отрезков AB и CD.
     * Если пересечения нет, вернуть -1.
     */

    public static int segmentLength(int a, int b, int c, int d) {
        // TODO your code
        return -1;
    }
}
