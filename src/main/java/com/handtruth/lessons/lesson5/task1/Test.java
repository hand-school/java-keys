package com.handtruth.lessons.lesson5.task1;

public class Test {
    public static void main(String[] args) {
        String str = "5+5";
        char[] ch = str.toCharArray();
        int tmp = Integer.parseInt(String.valueOf(str.charAt(0)));
//         ???????????????????????????????????????????????????????????????????? HOW THE FUCK IS THIS WORKING????????????/ >:(
        int tmp2 = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
        System.out.println(tmp + tmp2);
        System.out.println(firstNum(str));
    }
    public static String firstNum(String str) {
        StringBuilder tmp = new StringBuilder();
        str = str.replaceAll("[^0-9]", " ");
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char tmp1 = str.charAt(i);
            String a = Character.toString(tmp1);
            while (!a.equals(" ")) {
                tmp.append(ch[i]);
            }
        }
        return tmp.toString();
    }
}
// Почему -1, если 5-1 = 4,а символов 5;