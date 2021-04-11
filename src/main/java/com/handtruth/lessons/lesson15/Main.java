package com.handtruth.lessons.lesson15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair.toString());
        pair.setInfo("dsfdsf");

        Class<? extends Pair> pairClass = pair.getClass();
        log(pairClass.getName());
        log(pairClass.getCanonicalName());
        log(Arrays.toString(pairClass.getConstructors()));
        log(Arrays.toString(pairClass.getDeclaredMethods()));
        log(Arrays.toString(pairClass.getDeclaredFields()));

        System.out.println();
        // Достаем приватное поле
        try {
            Field infoField = pairClass.getDeclaredField("info");
            infoField.setAccessible(true);
            log(infoField.get(pair));
            infoField.set(pair, "HELLOGEY");
            log(infoField.get(pair));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            Method getInfoMethod1 = pairClass.getDeclaredMethod("getInfo");
            Method getInfoMethod2 = pairClass.getDeclaredMethod("getInfo", String.class);

            System.out.println(getInfoMethod1);
            getInfoMethod1.setAccessible(true);
            Object result1 = getInfoMethod1.invoke(pair);
            System.out.println(result1);

            System.out.println();

            System.out.println(getInfoMethod2);
            getInfoMethod2.setAccessible(true);
            Object result2 = getInfoMethod2.invoke(pair, "SDFDSF");
            System.out.println(result2);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Достаем приватное финальное поле
        try {
            Field info2Field = pairClass.getDeclaredField("info2");
            info2Field.setAccessible(true);

            Field modFields = Field.class.getDeclaredField("modifiers");
            modFields.setAccessible(true);
            modFields.setInt(info2Field, info2Field.getModifiers() & ~Modifier.FINAL);

            info2Field.setInt(pair, 100);
            log(info2Field.get(pair));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println();
    }


    static void log(Object obj) {
        System.out.println(obj.toString());
    }
}
