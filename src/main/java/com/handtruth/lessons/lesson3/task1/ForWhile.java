package com.handtruth.lessons.lesson3.task1;

class ForWhile {

    /**
     * Trivial
     * <p>
     * Вычислить факториал
     */
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Trivial
     * <p>
     * Найти количество цифр в заданном числе
     */
    public static int counter(int n) {
        int s = 0;
        do {
            s++;
            n = n / 10;
        } while (n != 0);
        return s;
    }

    /**
     * Easy
     * <p>
     * Определить, являются ли два заданных числа m и n взаимно простыми.
     * Взаимно простые числа не имеют общих делителей, кроме 1.
     * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
     */
    public static boolean isCoPrime(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a == 1;
    }


    /**
     * Medium
     * <p>
     * Для заданного x рассчитать с заданной точностью eps
     * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
     * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
     */
    public static double sin(double x, double eps) {
        double res = 0;
        double n = 1;
        int m = 1;
        int sign = 1;
        while (n > eps) {
            n = Math.pow(x, m) / factorial(m);
            m += 2;
            res += sign * n;
            sign *= -1;
            // нормализовать
        }
        return res;
    }

    /**
     * Hard
     * <p>
     * Найти n-ю цифру последовательности из квадратов целых чисел:
     * 149162536496481100121144...
     * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
     */
    public static int squareSequenceDigit(int n) {
        // TODO your code
        return 0;
    }
}

