package com.handtruth.lessons.labs.lab9;

public class BST {

    class Node {
        int value;
        Node left;
        Node right;

    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public Node createNewNode(int k) {
        Node node = new Node();
        node.value = k;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node delete(Node node, int val) {
        if(node == null) {
            return node;
        }

        if(val < node.value) {
            node.left = delete(node.left, val);
        } else if(val > node.value) {
            node.right = delete(node.right, val);
        } else {
            if(node.left == null || node.right == null) {
                Node temp = node.left != null ? node.left : node.right;

                if(temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.value = successor.value;

                node.right = delete(node.right, successor.value);
                return node;
            }
        }

        return node;
    }

    public Node getSuccessor(Node node) {
        if(node == null) {
            return null;
        }

        Node temp = node.right;

        while(temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }

}
