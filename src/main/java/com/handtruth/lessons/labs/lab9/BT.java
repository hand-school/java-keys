package com.handtruth.lessons.labs.lab9;

public class BT {
    public static void main(String[] args) {

        BinaryTree_2<Integer> BST = new BinaryTree_2<>();

        BST.insert(12);
        BST.insert(7);
        BST.insert(5);
        BST.insert(4);
        BST.insert(25);
        BST.insert(14);
        BST.insert(8);
        BST.insert(9);

        BST.print();

        BST.delete(14);

        BST.print();

        BST.delete(7);

        BST.print();
//





    }
}