package com.handtruth.lessons.lesson1.task1;

class Simple {

    /**
     * Trivial
     *
     * Вычислить дискриминант квадратного уравнения
     */
    double discriminant(double a, double b, double c) {
        //TODO your code
        return b*b-4*a*c;
    }

    /**
     * Trivial
     *
     * Поиск одного из корней квадратного уравнения
     */
    double sqRoot(double a, double b, double c) {
        return (discriminant(a,b,c) - b)/(2*a);
    }

    /**
     * Trivial
     *
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    double seconds(int hours, int minutes, int seconds) {
        //TODO your code
        return hours*3600+minutes*60+seconds;
    }

    /**
     * Easy
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    int numberRevert(int number) {
        //TODO your code
        return number%10*100+number%100/10*10+number/100;
    }
}
