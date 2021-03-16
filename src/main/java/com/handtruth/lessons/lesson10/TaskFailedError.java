package com.handtruth.lessons.lesson10;

public class TaskFailedError extends RuntimeException {

    public TaskFailedError(String message) {
        super(message);
        System.out.println(message);
    }

}
