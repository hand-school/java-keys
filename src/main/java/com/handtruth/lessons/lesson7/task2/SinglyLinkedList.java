package com.handtruth.lessons.lesson7.task2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

import com.handtruth.lessons.lesson7.CustomList;

/**
 * ЗАДАНИЕ: реализовать оставшиеся методы
 *
 * @param <E> тип данных списка
 */
public class SinglyLinkedList<E> implements CustomList<E> {

    private Node<E> root;
    private Node<E> currentNode;
    private int size = 0;
    private int modCount = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        // TODO: реализовать
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
        // TODO: реализовать
    }

    @Override
    public E get(int index) {
        // TODO: реализовать
        return null;
    }

    @Override
    public E set(int index, E newElement) {
        // TODO: реализовать
        return null;
    }

    @Override
    public boolean remove(int index) {
        // TODO: реализовать
        return false;
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

    @Override
    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator();
    }

    class SinglyLinkedListIterator implements Iterator<E> {
        private Node<E> current;
        private final int expectedModCount;

        public SinglyLinkedListIterator() {
            this.current = new Node<E>(null, root);
            this.expectedModCount = modCount;
        }

        @Override
        public boolean hasNext() {
            checkModification();
            return size != 0 && current.next != null;
        }

        @Override
        public E next() {
            checkModification();
            if (hasNext()) {
                current = current.next;
            } else {
                throw new NoSuchElementException();
            }
            return current.value;
        }

        private void checkModification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

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
