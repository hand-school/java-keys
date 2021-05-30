package com.handtruth.lessons.labs.lab9;

public class BinaryTree_2<T extends Comparable<T>> {

    private static class Node<T extends Comparable<T>> {
        T val;
        Node<T> left;
        Node<T> right;

        public Node(T val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    private Node<T> root;

    private Node<T> insertNode(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }
        if (current.val.compareTo(value) < 0) {
            current.right = insertNode(current.right, value);
        } else if (current.val.compareTo(value) > 0) {
            current.left = insertNode(current.left, value);
        } else {
            return current;
        }
        return current;
    }

    public void insert(T value) {
        root = insertNode(root, value);
    }

    private boolean containsNode(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        if (value == current.val) {
            return true;
        }
        return current.val.compareTo(value) < 0
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }

    public boolean contains(T value) {
        return containsNode(root, value);
    }

    private Node<T> deleteNode(Node<T> current, T value) {
        if (current == null) {
            return null;
        }

        if (value.equals(current.val)) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            T smallestValue = findSmallestValue(current.right);
            current.val = smallestValue;
            current.right = deleteNode(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.val) < 0) {
            current.left = deleteNode(current.left, value);
            return current;
        }
        current.right = deleteNode(current.right, value);
        return current;
    }

    private T findSmallestValue(Node<T> root) {
        return root.left == null ? root.val : findSmallestValue(root.left);
    }

    public void delete(T value) {
        root = deleteNode(root, value);
    }

    public void print() {
        print("", root, false);
    }

    private void print(String prefix, Node<T> root, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + root.val);
            print(prefix + (isLeft ? "|   " : "    "), root.left, true);
            print(prefix + (isLeft ? "|   " : "    "), root.right, false);
        }
    }
}
