package com.algorithms.recursion.reverseString;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseStringIterative("yoyo mastery"));
        System.out.println(reverseString.reverseStringIterative("Haritha"));
        System.out.println(reverseString.reverseStringIterative("Naveen"));
        System.out.println(reverseString.reverseStringRecursive("yoyo mastery"));
        System.out.println(reverseString.reverseStringRecursive("Haritha"));
        System.out.println(reverseString.reverseStringRecursive("Naveen"));
    }
}
