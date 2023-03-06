package com.algorithms.searching.traversals.tree;

import com.algorithms.searching.binarySearch.BinarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(9);
        binarySearchTree.lookup(4);
        System.out.println(binarySearchTree.lookup(5));
        System.out.println(binarySearchTree.lookup(10));
        binarySearchTree.insert(10);
        System.out.println(binarySearchTree.lookup(10));
        binarySearchTree.delete(10);
        System.out.println(binarySearchTree.lookup(10));
        binarySearchTree.inorderTraverse();
        System.out.println();
        binarySearchTree.preorderTraverse();
        System.out.println();
        binarySearchTree.postorderTraverse();
        System.out.println();
        binarySearchTree.traverseLevelOrder(binarySearchTree.root);
    }
}
