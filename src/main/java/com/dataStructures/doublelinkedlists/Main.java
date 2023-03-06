package com.dataStructures.doublelinkedlists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.append(4);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.prepend(1);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        myDoublyLinkedList.remove(0);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        myDoublyLinkedList.insert(2, 200);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        System.out.println("length: " + myDoublyLinkedList.getLength());

        System.out.println("head value: " + myDoublyLinkedList.head.value);
        System.out.println("head.previous: " + myDoublyLinkedList.head.previous);

        System.out.println("tail value: " + myDoublyLinkedList.tail.value);
        System.out.println("tail.next: " + myDoublyLinkedList.tail.next);
    }
}
