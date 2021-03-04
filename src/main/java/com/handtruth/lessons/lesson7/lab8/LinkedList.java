package com.handtruth.lessons.lesson7.lab8;

public class LinkedList {

    private Node first;
    private Node last;
    private int index = 0;
    private int size = 0;

    private static class Node {
        int element;
        Node previous;
        Node next;

        public Node(int element) {
            this.element = element;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node el = first;
        while (el != null) {
            builder.append("Node value=").append(el.element).append("---->");
            el = el.next;
        }
            return builder.toString();
    }
    public void evenAction() {
        int inde1 = 0;
        Node el = first;
        while (el.next != null) {
            if (inde1 % 2 == 0) {
                if (el.next.element < 0) {
                    el.element += el.next.element;
                }
            }
            el = el.next;
            inde1++;
        }

    }

    public void oddAction() {
        Node el = last;
        while (el.previous != null) {
            if (index % 2 != 0) {
                if (el.previous.element > 0) {
                    el.element += el.previous.element;
                }
            }
            el = el.previous;
            index--;
        }

    }

    public void add(int element) {
        Node newNode = new Node(element);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
        index++;
    }

    public void add(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (index == 0) {
            add(element);
        }
        if (index == size) {
            last.next = newNode;
            last = newNode;
        }
        Node oldNode = first;
        for (int i = 0; i < index; i++) {
            oldNode = oldNode.next;
        }
        Node oldPrevious = oldNode.previous;
        oldPrevious.next = newNode;
        oldNode.previous = newNode;

        newNode.previous = oldPrevious;
        newNode.next = oldNode;
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (get(i) == element) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }


    public boolean isEmpty() {
        return size == 0;

    }

    public boolean removeElement(int element) {
        return false;
    }

    public void set(int index, int element) {

    }
    private Node findNodeBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }
        int count = 0;
        Node node = first;
        while (node.next != null) {
            if (count == index - 1) {
                return node;
            }
            count++;
            node = node.next;
        }
        return null;
    }

        private Node findByIndex(int index) {
            if (index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException();
            }
            int tmpIndex = 0;
            if (first == null) {
                throw new IndexOutOfBoundsException();
            }

            if (index == 0) {
                return first;
            }

            Node node = first;
            while (node.next != null) {
                node = node.next;
                tmpIndex++;
                if (tmpIndex == index) {
                    return node;
                }
            }
            throw new IndexOutOfBoundsException();
        }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            first = first.next;
        } else {
            Node node = findNodeBeforeByIndex(index);
            Node tmp = findByIndex(index);
            node.next = tmp.next;
        }
        size--;
        return false;
    }
}