package com.handtruth.lessons.lesson7.task2;

import java.util.Objects;

import com.handtruth.lessons.lesson7.CustomList;

public class SinglyLinkedList<E> implements CustomList<E> {

    private Node<E> root;
    private Node<E> currentNode;
    private int size = 0;

    public boolean hasNext() {
        return currentNode.next != null;
    }

    public E next() {
        if (hasNext()) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public E root() {
        currentNode = root;
        return root.value;
    }

    public E end() {
        Node<E> el = root;
        while (el.next != null) {
            el = el.next;
        }
        return el.value;
    }

    public void reverse() {
        Node<E> prev = null;
        currentNode = root;
        Node<E> next = currentNode.next;

        while (next != null) {
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
            next = currentNode.next;
        }
        currentNode.next = prev;
        Node<E> tmp = root;
        root = currentNode;
        currentNode = tmp;

    }

    private void swap(Node<E> el1, Node<E> el2) {
        E tmp = el1.value;
        el1.value = el2.value;
        el2.value = tmp;

    }

    public void sort() {
        boolean needSwap = true;
        while (needSwap) {
            Node<E> el = root;
            needSwap = false;
            while (el.next != null)  {
                if ( (Integer) el.value > (Integer) el.next.value) {
                    swap(el, el.next);
                    needSwap = true;
                }
                el = el.next;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        Node<E> el = root;
        while (el.next != null) {
            if (el.value == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (size == 0) {
            root = newNode;
        } else {
            currentNode.next = newNode;
        }
        currentNode = newNode;
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> el = root;
        int i = 0;
        while (i < index - 1) {
            el = el.next;
            i++;
        }
        Node<E> el1 = new Node<>(element, el.next);
        el.next = el1;
    }

    @Override
    public E get(int index) {
        Node<E> element = root;
        int i = 0;
        while (i < index) {
            element = element.next;
            i++;
        }
        return element.value;
    }

    @Override
    public E set(int index, E newElement) {
        Node<E> el = root;
        int i = 0;
        while (i < index) {
            el = el.next;
            i++;
        }
        el.value = newElement;
        return el.value;
    }

    @Override
    public boolean remove(int index) {
        Node<E> el = root;
        int i = 0;
        if (index > size) {
            return false;
        }
        while (i < index - 1) {
            el = el.next;
            i++;
        }
        el.next = el.next.next;
        return true;
    }

    @Override
    public String toString() {
        String header = "SinglyLinkedList{" +
                "root=" + root +
                ", currentNode=" + currentNode +
                ", size=" + size +
                "}\n";
        StringBuilder builder = new StringBuilder(header);
        Node<E> currNode = root;
        int ind = 0;
        builder.append("ROOT: ").append(currNode.toString());
        while (currNode.next != null) {
            ind++;
            currNode = currNode.next;
            builder.append(currNode.toString());
        }
        return builder.toString();
    }

    static class Node<E> {
        Node<E> next;
        E value;

        public Node(E value, Node<E> next) {
            this.next = next;
            this.value = value;
        }

        @Override
        public String toString() {
            String nxt = "";
            if (next == null) {
                nxt = "null";
            }
            return "Node{hash=" + hashCode() + " value=" + value + "} ---> " + nxt;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node<?> node = (Node<?>) o;
            return Objects.equals(next, node.next) &&
                    value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(next, value);
        }
    }
}
