package com.handtruth.lessons.lesson1.task1;

class Simple {

    /**
     * Trivial
     * <p>
     * Вычислить дискриминант квадратного уравнения
     */
    public static double discriminant(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        return d;
    }

    /**
     * Trivial
     * <p>
     * Поиск одного из корней квадратного уравнения
     */
    public static double sqRoot(double a, double b, double c) {
        double d = discriminant(a, b, c);
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    /**
     * Trivial
     * <p>
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    public static double seconds(int hours, int minutes, int seconds) {
        //TODO your code
        return 0;
    }

    /**
     * Easy
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    public static int numberRevert(int number) {
        //TODO your code
        return 0;
    }
}
