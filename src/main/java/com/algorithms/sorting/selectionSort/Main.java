package com.algorithms.sorting.selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(numbers)));
    }
}
