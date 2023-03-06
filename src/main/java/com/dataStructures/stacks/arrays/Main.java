package com.dataStructures.stacks.arrays;

import com.dataStructures.stacks.problems.ThreeInOne;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());



    }
}
