package com.algorithms.sorting.bubbleSort;

public class BubbleSort {
    public int[] sort(int[] numbers){
        for(int i = 0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]>=numbers[i]){
                    int temp = numbers[j];
                    numbers[j] =numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }


}
