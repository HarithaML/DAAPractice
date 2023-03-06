package com.dataStructures.trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);

        tree.print();

        System.out.println(tree.lookup(6));
        System.out.println(tree.lookup(25));
        System.out.println(tree.lookup(170));
        System.out.println(tree.lookup(26));
    }
}
