package com.handtruth.lessons.lesson5.task1;


import java.util.Arrays;

import static java.lang.String.join;

public class Example {

    public static void main(String[] args) {
//        String s1 = "Hello ";
//        String s2 = "world";
//
//        String res1 = s1 + s2;
//        System.out.println(res1);
//
//        String res2 = s1.concat(s2);
//        System.out.println(res2);
//        System.out.println(res1 == res2);  // false
//
//        String s3 = "";
//        String res3 = s1.concat(s3);  // "Hello " + "" = "Hello "
//        System.out.println(s1 == res3);  // true
//
//        String res4 = String.join(" ", s1, s2);
//        System.out.println(res4);
//
//        System.out.println(res1.equals(res2));
//
//        System.out.println(res1.indexOf('l'));
//        System.out.println(res1.indexOf("llo"));
//
//        System.out.println(res1.startsWith("Hello"));
//        System.out.println(res1.startsWith("world"));
//
//        System.out.println(res1.contains("ello"));
//
//        String s5 = "  sdFKNDSJKF  sdfkjsdf     ";
//        System.out.println(s5.trim());

//        String s6 = "Hello world";
//        System.out.println(s6.substring(1, 8));  // ello wo

        String s7 = "Hello world my friends!!!";
        String[] arr = s7.split("l");
        System.out.println(Arrays.toString(arr));

        String s8 = s7.replace("l", "______");
        System.out.println(s8);

    }
}
