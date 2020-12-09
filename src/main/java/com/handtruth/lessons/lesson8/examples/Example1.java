package com.handtruth.lessons.lesson8.examples;

import java.util.LinkedList;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("_____Stack examples_____");
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(5123);

        System.out.println("Последний элемент без удаления: " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Stack size = " + stack.size());

        System.out.println("_____Queue examples_____");
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(1);
        queue.offer(5123);

        System.out.println("Первый элемент без удаления: " + queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("Queue size = " + queue.size());
    }
}
