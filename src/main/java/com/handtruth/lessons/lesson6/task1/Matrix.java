package com.handtruth.lessons.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Необходимо реализовать все методы класса Матрица.
 */
@SuppressWarnings("WeakerAccess")
public class Matrix {
    private int height;
    private int weight;
    private int[][] matrix;

    /**
     * Easy
     * 
     * Реализовать конструктор
     *
     * @param matrix - исходная матрица
     */
    public Matrix(int[][] matrix) {
        assert matrix.length > 0 && matrix[0].length > 0 : "Значения ширины и высоты не могут быть меньше нуля!";
        this.matrix = matrix;
        this.weight = matrix.length;
        this.height = matrix[0].length;
    }

    /**
     * Easy
     * 
     * Реализовать конструктор
     *
     * @param height высота матрицы
     * @param weight ширина матрицы
     * @param e      чем заполнять
     */
    public Matrix(int height, int weight, int e) {
        assert height > 0 && weight > 0 : "Значения ширины и высоты не могут быть меньше нуля!";
        this.height = height;
        this.weight = weight;
        matrix = new int[weight][height];
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {
               this.matrix[i][j] = e;
            }
        }

    }

    /**
     * Trivial
     *
     * @return значение высоты
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Trivial
     *
     * @param height новое значние высоты
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Trivial
     *
     * @return значение ширины
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Trivial
     *
     * @param weight новое значение ширины
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Trivial
     *
     * @return текущая конфигурация матрицы
     */
    public int[][] getMatrix() {
        return this.matrix;
    }

    /**
     * Trivial
     *
     * @param matrix новая матрица
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Trivial
     *
     * @param weight ширина элемента
     * @param height высота элемента
     * @return значение в заданных индексах
     */
    public int getByIndex(int weight, int height) {
        return matrix[weight][height];
    }

    /**
     * Trivial
     * <p>
     * Метод для генерации Матрциы
     *
     * @param height высота матрицы
     * @param weight ширина матрицы
     * @param e      чем заполнять
     * @return объект матрицы
     */
    public static Matrix createMatrix(int height, int weight, int e) {
        int[][] matrix = new int[height][weight];
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = e;
            }
        }
        return null;
    }
}
    /**
//     * Medium
//     * <p>
//     * Реализовать метод проверки на равенство матриц.
//     * Вместо матрица может прийти другой объект!
//     * Не забудьте, что ссылка на сравниваемый объкт может совпадать с
//     * сылкой на текущий объект.
//     *
//     * @param o - объект для сравнения
//     * @return true, если объекты совпадают, иначе false
//     */
//    @Override
//    public boolean equals(Object o) {
//        //TODO your code
//        return false;
//    }
//
//    /**
//     * Medium
//     * <p>
//     * Реализовать получение hashcode матрицы.
//     *
//     * @return значение типа int
//     */
//    @Override
//    public int hashCode() {
//        return -1; //TODO your code
//    }