package com.dataStructures.queues.stacks;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        // the last element in the queueStack will be our first item of queue.
        System.out.println("queue: "+myQueue.inputStack);
        System.out.println("peek: "+myQueue.peek());
        System.out.println("pop: "+myQueue.pop());
        System.out.println("queue: "+myQueue.inputStack);
        System.out.println("peek: "+myQueue.peek());
        System.out.println("is queue empty: "+myQueue.empty());
    }
}
