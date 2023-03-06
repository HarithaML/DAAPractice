package com.dataStructures.stacks.problems.QueueViaStacks;

public class Main {


    public static void main(String[] args) {
        QueueViaStacks queueViaStacks = new QueueViaStacks();
        queueViaStacks.enqueue(10);
        queueViaStacks.enqueue(20);
        queueViaStacks.enqueue(30);
        queueViaStacks.enqueue(40);
        System.out.println("--------Push-------");
        queueViaStacks.display();
        queueViaStacks.dequeue();
        System.out.println("--------Pop-------");
        queueViaStacks.display();


    }
}
