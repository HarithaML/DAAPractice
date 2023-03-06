package com.dataStructures.queues.stacks;


import java.util.Stack;

public class Queue<N> {
    // this is the main stack which we will use as queue
    Stack<Integer> inputStack = new Stack<>();
    // rev stack
    Stack<Integer> outputStack = new Stack<>();

    public void push(int x) {
        if (this.inputStack.size() == 0) {
            this.inputStack.push(x);
        } else {
            while (this.inputStack.size() != 0) {
                this.outputStack.push(this.inputStack.pop());
            }
            this.outputStack.push(x);
            while (this.outputStack.size() != 0) {
                this.inputStack.push(this.outputStack.pop());
            }
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public Integer pop() {
        if (this.inputStack.size() > 0) {
            return this.inputStack.pop();
        } else {
            return null;
        }

    }

    /**
     * Get the front element.
     */
    public Integer peek() {
        if (this.inputStack.size() > 0) {
            return this.inputStack.get(this.inputStack.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return this.inputStack.size() == 0;
    }
}
