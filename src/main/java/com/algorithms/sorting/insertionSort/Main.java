package com.algorithms.sorting.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(numbers)));
    }
}
