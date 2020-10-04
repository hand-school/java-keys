package com.handtruth.lessons.lesson2.task2;

class Switch {

    /**
     * Trivial
     * <p>
     * Пользователь вводит число от 1 до 10
     * Ипользуя конструкцию switch case вернуть
     * символьное описание числа: 1-> один и т.д.
     * Если число не входит в заданный интервал, вернуть
     * строку "Число не входит в разрешенный интервал"
     */

    public static String switchNumber(int number) {
        //TODO your code
        return "";
    }

    /**
     * Trivial
     * <p>
     * На вход подается цвет, необходимо
     * вывести название цвета, т.е. White -> Белый и т.д.
     */
    public static String switchEnum(Color color) {
        //TODO your code
        return "";
    }


    enum Color {
        White(1), Black(2), Yellow(3);

        int code;

        Color(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
