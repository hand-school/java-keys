package com.handtruth.lessons.lesson1.task1;

public class RevertNumber {
//    public static int RevNum(int a) {
//        int LastDig = a % 10;
//        int FirstDig = a / 100;
//        int MidDig = (a / 10) % 10;
//        return LastDig*100 + MidDig*10 + FirstDig;
//    }
//    // TODO: необходимо напечатать число, полученное из заданного (758), перестановкой цифр в обратном порядке
//    public static void main(String[] args) {
//        int result = RevNum(758);
//        System.out.println(result);
//    }


    // TODO: необходимо напечатать число, полученное из заданного (758), перестановкой цифр в обратном порядке
    public static void main(String[] args) {
        int input = 758;
        int LastDig = input % 10;
        int FirstDig = input / 100;
        int MidDig = (input / 10) % 10;
        System.out.println(LastDig * 100 + MidDig * 10 + FirstDig);
    }
}