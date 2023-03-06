package com.algorithms.sorting.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for(int j = 0;j<i;j++){
                if(numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

}
