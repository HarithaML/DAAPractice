package com.dataStructures.arrays.problems;

public class MergeSortedArrays {

    int[] arr1;
    int[] arr2;


    public MergeSortedArrays(int[] array1,int[] array2){
        this.arr1 = array1;
        this.arr2 = array2;

    }

    public int[]  merger(){

        // i is index count of arr1
        // j is index count of arr2
        // k is index count of mergedArray
        int i = 0, j = 0, k = 0;

        // mergedArrayLength will be total length of arr1 and arr2.
        int mergedArrayLength = arr1.length + arr2.length;

        // create mergedArray {an array which will have merged elements}
        int[] mergedArray = new int[mergedArrayLength];

        // checking elements of both array and adding the least element first in the merged array.
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        /*
         some or one of the elements of one of the arrays will
         be remaining to be put into the merged array,
         because those elements would be greater than the elements of
         the other array.
         */

        // adding remaining elements of arr1 into mergedArray, if any.
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        // adding remaining elements of arr2 into mergedArray, if any.
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArray;

    }

}
