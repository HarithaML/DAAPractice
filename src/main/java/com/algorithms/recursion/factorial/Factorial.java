package com.algorithms.recursion.factorial;


// Write two functions that finds the factorial of any number.
// One should use recursive, the other should just use a for loop
public class Factorial {

    public int factotrialIterative(int n){
        if(n == 0){
            return 1;
        }else {
            int x = 1;
            for(int i=1; i<=n ; i++){
                x = x*i;
            }
            return x;
        }
    }

    public int factorialRecursive(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return factorialRecursive(n - 1)*n;
    }



}
