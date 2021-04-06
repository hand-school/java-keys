package com.handtruth.lessons.labs.lab9;

public class MainLab9 {
    public static void main(String[] args) {

        BinaryTree newTree = new BinaryTree();

        newTree.insertNode(12);
        newTree.insertNode(4);
        newTree.insertNode(3);
        newTree.insertNode(9);
        newTree.insertNode(7);
        newTree.insertNode(8);
        newTree.insertNode(10);
        newTree.insertNode(1);
        newTree.insertNode(15);
        newTree.insertNode(20);
        newTree.insertNode(13);

        newTree.printTree();

        System.out.println(newTree.findNodeByValue(8));

        newTree.deleteNode(4);

        newTree.printTree();



    }
}
