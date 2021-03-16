package com.handtruth.lessons.lesson7;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions {

     public static void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("S = " + s);
    }

    public static void print1(String s) throws IOException {
         throw new IOException();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Firt");
        list.add("econd");
        list.add(null);
        list.add("Fourth");

        try {
            print1("vg");
        } catch (IOException d) {
            System.out.println("Ошибка");
        }

        for(String s:list) {
            try {
                print(s);
            }
//            Ловить NPE не рекомендуется СОВСЕМ
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed");
            }
            finally {
                System.out.println("finally");
            }
            System.out.println("-----------------");
        }
        }
    }
