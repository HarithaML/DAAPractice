package com.dataStructures.doublelinkedlists;

public class DoublyLinkedList {
    Node head;
    Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int[] printList() {
        int[] myList = new int[length];
        Node current = this.head;
        int i = 0;
        while (current != null) {
            myList[i] = current.value;
            current = current.next;
            i++;
        }
        return myList;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
            newNode.previous = current;
            newNode.next.previous = newNode;
            length++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            head = this.head.next;
            this.head.previous = null;
            length--;
        } else {
            Node current = head;
            int i;
            for (i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
            if (i == length - 1) {
                tail = current;
            } else {
                current.next.previous = current;
            }
        }
    }


}