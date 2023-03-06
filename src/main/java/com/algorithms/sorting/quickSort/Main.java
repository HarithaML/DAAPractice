package com.algorithms.sorting.quickSort;

import java.util.Arrays;

//Always pick the first element as a pivot.
//Always pick the last element as a pivot (implemented below)
//Pick a random element as a pivot.
//Pick median as the pivot.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
}
