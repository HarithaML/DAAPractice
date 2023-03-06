package com.algorithms.sorting.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.mergeSort(numbers, numbers.length)));
    }
}
