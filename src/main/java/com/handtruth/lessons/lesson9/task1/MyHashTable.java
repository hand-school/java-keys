package com.handtruth.lessons.lesson9.task1;

import java.util.Hashtable;

public class MyHashTable<K, V> implements CustomHashTable<K, V> {

    private Node<K, V>[] table;
    private int size;
    private int capacity = 10;
    private int threshold;
    private float loadFactor;

    public MyHashTable() {
    }

    @Override
    public V get(K key) {
        int hash = key.hashCode();
        int index = (hash & 0xfffffff) % capacity;
        for (Node<K, V> node = table[index]; node != null; node = node.next) {
            if ((node.hash == hash) && (node.key.equals(key))) {
                return node.value;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int hash = key.hashCode();
        int index = (hash & 0xfffffff) % capacity;
        for (Node<K, V> node = table[index]; node != null; node = node.next) {
            if ((node.hash == hash) && (node.key.equals(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V put(K key, V value) {
        if (value == null) {
            throw new NullPointerException();
        }

        int hash = key.hashCode();
        int index = (hash & 0xfffffff) % capacity;
        Node<K, V> node = table[index];
//        for (; node != null; node = node.next) {
//            if ((node.hash == hash) && node.key.equals(key)) {
        if (containsKey(key)) {
            V old = node.value;
            node.value = value;
            return old;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
