package com.handtruth.lessons.lesson7.lab9;

public class ObservingProccess {
    public static void main(String[] args) {
        NumObserved firstnum = new NumObserved();

        firstnum.changeNum(5);

        Observer firstObserver = new NumObserver("Observer");

        firstnum.addObserver(firstObserver);

        firstnum.changeNum(6);
        firstnum.changeNum(7);
    }
}
