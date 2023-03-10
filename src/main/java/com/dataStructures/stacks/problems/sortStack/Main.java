package com.dataStructures.stacks.problems.sortStack;

public class Main {
    /*
    Input : [34, 3, 31, 98, 92, 23]
    Output : [3, 23, 31, 34, 92, 98]

    Input : [3, 5, 1, 4, 2, 8]
    Output : [1, 2, 3, 4, 5, 8]
    */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        SortStack sortStack = new SortStack(stack);
        Stack resultStack = sortStack.sort();
        resultStack.display();
    }
}
