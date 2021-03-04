package com.handtruth.lessons.lesson7.lab9;

public interface Observed {
   public void addObserver(Observer observer);

   public void removeObserver(Observer observer);

   public void notifyObserver();

}
