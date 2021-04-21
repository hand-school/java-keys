package com.handtruth.lessons.labs.lab9;

public class BinaryTree_2 {

    private Node rootNode;

    public BinaryTree_2() {
        rootNode = null;
    }

    public Node findNodeByValue(int value) {
        Node currentNode = rootNode;
        while (currentNode.getValue() != value) {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getleft();
            } else {
                currentNode = currentNode.getright();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }


    public void insertNode(int value) {
        if (findNodeByValue(value) != null) {
            return;
        }
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value < currentNode.getValue()) {
                    currentNode = currentNode.getleft();
                    if (currentNode == null) {
                        parentNode.setleft(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getright();
                    if (currentNode == null) {
                        parentNode.setright(newNode);
                        return;
                    }
                }
            }
        }
    }

    public boolean deleteNode(int value) {
        Node currentNode = rootNode;
        Node parentNode = rootNode;

        return false;

    }

    static class Node {
        private int value; // ключ узла
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение :" + value);
        }

        private int getValue() {
            return this.value;
        }

        private void setValue(int value) {
            this.value = value;
        }

        private Node getleft() {
            return this.left;
        }

        private void setleft(Node left) {
            this.left = left;
        }

        private Node getright() {
            return this.right;
        }

        private void setright(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
