package com.dataStructures.arrays.problems;

import java.util.Arrays;

public class StringReversal {
    char[] array;


    public  StringReversal(String string) {
        array = string.toCharArray();

    }

    public String reverse() {
        int upperLimit;

        if (array.length % 2 == 0) {
            upperLimit = (array.length / 2) - 1;
        } else {
            upperLimit = ((array.length - 1) / 2) - 1;
        }



        return Arrays.toString(swap(array, upperLimit));

    }

    private char[] swap(char[] array, int upperLimit) {
        for (int i = 0; i <= upperLimit; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }





}
