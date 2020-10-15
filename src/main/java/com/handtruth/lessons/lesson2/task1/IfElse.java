package com.handtruth.lessons.lesson2.task1;

import org.w3c.dom.ls.LSOutput;

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
        if (age > 0 && age < 200) {
            if (age % 10 >= 5 || age % 10 == 0 || (age % 100 >= 10 && age % 100 <= 19)) {
                return age + " лет";
            } else if (age % 10 == 1) {
                return age + " год";
            } else {
                return age + " года";
            }
        } else {
            return "invalid";
        }
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
        double max = max(a, b, c);
        double min = min(a, b, c);
        double other = a + b + c - max - min;
        if (a + b > c && a + c > b && b + c > a) {
            if (max * max == min * min + other * other) {
                return 1;
            } else {
                if (max * max > min * min + other * other) {
                    return 2;
                } else {
                    return 0;
                }
            }
        } else {
            return -1;
        }
    }

    private static double max(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    private static double min(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
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
        // 5 7 1 3
        if (b >= c && d >= a) {
            if (avgFirst(a, b, c, d) < avgSecond(a, b, c, d)) {
                return avgSecond(a, b, c, d) - avgFirst(a, b, c, d);
            } else {
                return avgFirst(a, b, c, d) - avgSecond(a, b, c, d);
            }
        } else {
            return -1;
        }
    }

    private static int avgSecond(int a, int b, int c, int d) {
        if (b < d) {
            return b;
        } else {
            return d;
        }
    }

    private static int avgFirst(int a, int b, int c, int d) {
        if (c > a) {
            return c;
        } else {
            return a;
        }
    }

}