package com.algorithms.sorting.bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(numbers)));
    }
}
