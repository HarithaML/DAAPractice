package com.algorithms.searching.linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,5,6,87,98,34,56,67};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(numbers,6));
        System.out.println(linearSearch.search(numbers,88));
    }
}
