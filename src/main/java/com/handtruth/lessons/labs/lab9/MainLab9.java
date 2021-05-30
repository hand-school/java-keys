package com.handtruth.lessons.labs.lab9;

public class MainLab9 {
    public static void main(String[] args) {

        BinaryTree newTree = new BinaryTree();

        newTree.insertNode(12);
        newTree.insertNode(7);
        newTree.insertNode(5);
        newTree.insertNode(4);
        newTree.insertNode(25);
        newTree.insertNode(14);
        newTree.insertNode(8);
        newTree.insertNode(9);

        newTree.printTree();

        System.out.println(newTree.findNodeByValue(8));

        newTree.deleteNode(14);

        newTree.printTree();

        newTree.deleteNode(7);

        newTree.printTree();



    }
}
