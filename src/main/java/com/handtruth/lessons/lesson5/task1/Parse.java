package com.handtruth.lessons.lesson5.task1;

class Parse {
    /**
     * Easy
     *
     * Дано число n от 0 до 99.
     * Вернуть его же в виде двухсимвольной строки, от "00" до "99"
     * Для конкатенации строк использовать метод concat()
     */
    public static String toDigitStr(int n) {
        String res = String.valueOf(n);
        if (n < 10) {
            return "0".concat(res);
        } else {
            return res;
        }
    }

    /**
     * Easy
     *
     * Дано seconds -- время в секундах, прошедшее с начала дня.
     * Вернуть текущее время в виде строки в формате "ЧЧ:ММ:СС".
     * Для конкатенации строк использовать StringBuilder
     */
    public static String timeSecondsToStr(int seconds) {
        // TODO your code
        return "";
    }

    /**
     * Easy
     *
     * Дано число. Если это число двоичное, вернуть true, иначе false.
     * (пример двоичного числа: 100101)
     */
    public static boolean isBin(String n) {
        // TODO your code
        return true;
    }

    /**
     * Medium
     *
     * Дана строка и индексы начала и конца промежутка. Вернуть содержимое строки в промежутке [n, m)
     * Не использовать стандартную функцию substring()
     */
    public static String substring(String str, int n, int m) {
        // TODO your code
        return "";
    }

    /**
     * Hard
     *
     * На входе простой математический пример в виде двух операндов и одной операции:
     * int <операция> int; Могут быть операции +-*.
     * Вернуть результат выражения.
     */
    public static int mathOperation(String example) {
        // TODO your code
        return 0;
    }
}
