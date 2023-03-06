package com.dataStructures.stacks.linkedlists;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println("Is stack empty?"+myStack.isEmpty());
        myStack.push("Discord");
        myStack.push("Udemy");
        myStack.push("google");
        System.out.println("Is stack empty?"+myStack.isEmpty());
        myStack.printStack();


    }
}
