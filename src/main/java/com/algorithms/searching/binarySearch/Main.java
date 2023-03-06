package com.algorithms.searching.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,67,78,90};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.runBinarySearchRecursively(numbers,4,0,numbers.length-1);
        System.out.println(index);
    }
}
