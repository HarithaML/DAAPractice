package com.algorithms.recursion.fibanocci;

public class Main {
    public static void main(String[] args) {
        Fibanocci fibanocci = new Fibanocci();
        System.out.println(fibanocci.fibonacciIterative(5));
        System.out.println(fibanocci.fibonacciRecursive(3));
    }

}
