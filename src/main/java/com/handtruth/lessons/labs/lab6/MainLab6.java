package com.handtruth.lessons.labs.lab6;

public class MainLab6 {
    public static void main(String[] args) {
        NewString tr = new NewString("My name is");

        System.out.println(tr.length());

        System.out.println(tr.indexOf('e'));

        System.out.println(tr.subSequence(1, 5));

        System.out.println(tr.SequenceContains("name"));

        System.out.println(tr.SequenceContains("mef"));
    }
}
