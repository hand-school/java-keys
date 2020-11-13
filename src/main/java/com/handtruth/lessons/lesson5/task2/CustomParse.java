package com.handtruth.lessons.lesson5.task2;

class CustomParse {

    /**
     * Easy
     * <p>
     * Посчитать хэш-код строки методом
     * (c[0]*31 + c[1])*31 + ... (с[i] - символ строки)
     */
    public static int customHash(String str) {
        int res = 0;
        for (char c : str.toCharArray()) {
            res = (res + c) * 31;
        }
        return res;
    }

    /**
     * Medium
     * <p>
     * На вход набор скобок из набора ()[]{}.
     * Если на каждую открытую скобку есть закрытая, при этом не нарушются правила вложенности,
     * вывести true, иначе false.
     * Пример:
     * ([{({})}]()) -> true (все правила вложенности соблюдены)
     * [({)}] -> false (правила вложенности не соблюдены)
     * (((())) -> false (осталась одна не закрытая скобка)
     */
    public static boolean isClose(String str) {
        // TODO your code
        return false;
    }

    /**
     * Hard
     * <p>
     * Даны 2 строки. Определить, является ли вторая строка подстрокой перовой.
     * Рекомендации: для решения поставленной задачи использовать алгоритм Кнута-Морриса-Пратта
     */
    public static boolean contain(String model, String example) {
        // TODO your code
        return false;
    }
}
