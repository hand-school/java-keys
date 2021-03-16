package com.handtruth.lessons.lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    public static void main(String[] args) {
        try {
            copyFile("filename");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } finally {
            System.out.println("Конец");
        }
        System.out.println("Программа продолжает работать");

        checkTask();
    }


    public static void copyFile(String fileName) throws FileNotFoundException{
        // TODO
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
    }

    public static void foo(String fileName) throws IOException{
        if (fileName == null || fileName.isEmpty()) {
            throw new IOException();
        }
    }

    public static void foo1(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Index ...");
        }
    }

    public static void checkTask() {
        throw new TaskFailedError("Задание 1 выполнено неверно!");
    }
}
