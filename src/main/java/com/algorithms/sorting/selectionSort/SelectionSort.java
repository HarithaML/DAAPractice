package com.algorithms.sorting.selectionSort;

public class SelectionSort {
    public int[] sort(int[] numbers){
        for(int i =0 ;i<numbers.length;i++){
            int  min = i;
            for(int y = i+1;y<numbers.length;y++){
                if(numbers[y]<numbers[min]){
                    min = y;
                }
                int temp = numbers[min];
                numbers[min] = numbers[i];
                numbers[i] = temp;
            }

        }
        return numbers;
    }
}
