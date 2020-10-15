package com.handtruth.lessons.lesson2;

import java.util.Random;

public class Example2 {

    public static void main(String[] args) {
        Color color = Color.White;

        switch (color) {
            case White:
                System.out.println("It is White");
                break;
            case Black:
                System.out.println("It is Black");
                break;
            case Yellow:
                System.out.println("It is Yellow");
                break;
            default:
                System.out.println("This color is undefined");
        }

//        double random = Math.random() * 10;
//        System.out.println(random);
//        int i  = (int) random;
//        System.out.println(i);
//        switch (i) {
//            case 0:
//                System.out.println("Выход там");
//                break;
//            case 1:
//                System.out.println("Добро пожаловать");
//                break;
//            case 2:
//                System.out.println("Держите меню");
//                break;
//            case 3:
//                System.out.println("Я Леха");
//                break;
//            default:
//                System.out.println("Я такой команды не знаю");
//        }
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
