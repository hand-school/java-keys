package com.handtruth.lessons.lesson7.task1;

import com.handtruth.lessons.lesson7.CustomList;

import java.util.Arrays;

public class MyCutomLit<T> implements CustomList<T> {

    private Object[] data;

    public Object[] getData() {
        return data;
    }

    private final static int DEFAULT_SIZE = 2;
    private int size = 0;

    public MyCutomLit() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T element) {
        if (size == data.length) {
            this.data = Arrays.copyOf(data, (int) (data.length * 1.6));
        }
        data[size] = element;
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (size == data.length) {
            this.data = Arrays.copyOf(data, (int) (data.length * 1.6));
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;

    }

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public T set(int index, T newElement) {
        T n = (T) data[index];
        data[index] = newElement;
        return n;
    }

    @Override
    public boolean remove(int index) {
        if (index > size) {
            return false;
        }
        for (int i = index; i <= size; i++) {
            data[i] = data[i + 1];
        }
        return true;
    }
}