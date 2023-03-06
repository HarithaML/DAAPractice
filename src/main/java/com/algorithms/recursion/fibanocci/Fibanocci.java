package com.algorithms.recursion.fibanocci;
// Given a number N return the index value of the Fibonacci sequence, where the sequence is:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

//For example: fibonacciRecursive(6) should return 8



public class Fibanocci {

    public int  fibonacciIterative(int n){
        int x = 0;
        int y = 1;
        int z = 0;
        for(int i = 1; i<=n;++i){
           z = x + y;
           x = y;
           y = z;
        }
        return z;
    }

    public int  fibonacciRecursive(int n) {

        if ((n == 0) || (n==1) )
            return n;
        else
            return fibonacciRecursive(n-1 ) + fibonacciRecursive(n - 2);


    }

}
