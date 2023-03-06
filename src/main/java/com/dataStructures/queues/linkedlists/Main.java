package com.dataStructures.queues.linkedlists;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue("Apple");
        myQueue.enqueue("Ball");
        myQueue.enqueue("Cat");
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.peek());
    }
}
