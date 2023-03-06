package com.algorithms.sorting.quickSort;
// 10 , 80, 30, 90,40,50,70
//partition around 70
// 10,30,40,50    ||    90,80
//partition around 50      ||  partition around 80
//10,30,40             {}     ||  {} 90
//partition around 40
//{10,30}    {}
//partition around 30
//{10}  {}
public class QuickSort {
    public int partition(int a[],int begin, int end){
        int pivot = a[end];
        int i = (begin-1);
        for(int j = begin; j< end;j++){
            if(a[j]<=pivot){
                i++;
                int swapTemp = a[i];
                a[i] = a[j];
                a[j] = swapTemp;
            }
        }
        int swapTemp = a[i+1];
        a[i+1] = a[end];
        a[end] = swapTemp;

        return i+1;
    }
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
}
