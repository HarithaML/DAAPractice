package com.algorithms.searching.linearSearch;

public class LinearSearch {
    public boolean search(int[] numbers,int x){
        boolean check = false;
        for (int number : numbers) {
            if( number == x){
                check = true;
            }
        }
        return check;
    }
}
