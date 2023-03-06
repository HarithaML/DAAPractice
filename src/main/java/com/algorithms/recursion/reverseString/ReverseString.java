package com.algorithms.recursion.reverseString;


import java.util.Arrays;

public class ReverseString {
    //Implement a function that reverses a string using iteration...and then recursion!
    public String reverseStringIterative(String string) {
        char[] characters = string.toCharArray();
        int length = characters.length;
        int maxLimit = 0;
        if(length%2 ==0){
            maxLimit = length/2;
        }else {
            maxLimit = (length-1)/2;
        }
        for(int i=0;i<maxLimit;i++){
            char temp = characters[i];
            characters[i] = characters[length-i-1];
            characters[length-i-1] = temp;
        }
        return Arrays.toString(characters);
    }

    //'yoyo mastery'
//should return: 'yretsam oyoy'

    public String reverseStringRecursive(String string){
        if(string == null || (string.length()<=1)){
            return string;
        }
        else {
           return reverseStringRecursive(string.substring(1))+string.charAt(0);
        }
    }
}
