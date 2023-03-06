package com.dataStructures.linkedlists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);
        //append
        myLinkedList.append(12);
        myLinkedList.append(16);
        //prepend
        myLinkedList.prepend(20);
        myLinkedList.prepend(50);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //insert
        myLinkedList.insert(2, 25);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //remove
        myLinkedList.remove(4);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //reverse
        LinkedList linkedList2 = myLinkedList.reverse(myLinkedList);
        System.out.println("reverse linkedList" + Arrays.toString(linkedList2.printList()));

        System.out.println("------------------Remove Dups:");
        myLinkedList = new LinkedList<>(30);
        myLinkedList.append(40);
        myLinkedList.append(40);
        myLinkedList.append(50);
        myLinkedList.append(50);
        RemoveDups removeDups = new RemoveDups();
        removeDups.remove(myLinkedList.getHead());
        print(myLinkedList.getHead());

        System.out.println("------------------Return Kth to Last:");
        myLinkedList = new LinkedList<>(1);
        for(int i =2;i<=20;i++){
            myLinkedList.append(i);
        }
        ReturnKToLast returnKToLast = new ReturnKToLast();
        Node node = returnKToLast.returnK(myLinkedList.getHead(),10);
        print(node);

        System.out.println("------------------Delete Middle Node:");
        myLinkedList = new LinkedList<>(1);
        for(int i =2;i<=5;i++){
            myLinkedList.append(i);
        }
        print(myLinkedList.getHead());
        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        print(deleteMiddleNode.removeMiddleNode(myLinkedList.getHead()));

        System.out.println("------------------Partition:");
        myLinkedList = new LinkedList<>(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        int x = 5;
        print(myLinkedList.getHead());
        Partition partition = new Partition(myLinkedList.getHead());
        System.out.println("Partition by value: "+x);
        print(partition.divide(x));

        System.out.println("------------------Sum Lists:");
        LinkedList num1 = new LinkedList(7);
        num1.append(1);
        num1.append(6);
        print(num1.getHead());
        LinkedList num2 = new LinkedList(5);
        num2.append(9);
        num2.append(2);
        print(num2.getHead());
        SumLists sumLists = new SumLists(num1.getHead(),num2.getHead());
        print(sumLists.doSum());

        num1 = new LinkedList(7);
        num1.append(1);
        num1.append(6);
        num1.append(6);
        print(num1.getHead());
         num2 = new LinkedList(5);
        num2.append(9);
        num2.append(2);
        num2.append(6);
        print(num2.getHead());
         sumLists = new SumLists(num1.getHead(),num2.getHead());
        print(sumLists.doSum());

        System.out.println("------------------Palindrome:");
        num1 = new LinkedList(7);
        num1.append(6);
        num1.append(1);
        num1.append(6);
        num1.append(7);
        print(num1.getHead());
        Palindrome palindrome = new Palindrome(num1.getHead());
        System.out.println(palindrome.check());
        num1 = new LinkedList(7);
        num1.append(6);
        num1.append(1);
        num1.append(6);
        num1.append(8);
        print(num1.getHead());
         palindrome = new Palindrome(num1.getHead());
        System.out.println(palindrome.check());
        num1 = new LinkedList(7);
        num1.append(11);
        num1.append(1);
        num1.append(11);
        num1.append(7);
        print(num1.getHead());
        palindrome = new Palindrome(num1.getHead());
        System.out.println(palindrome.check());

        System.out.println("------------------Loop Detection :");
        num1 = new LinkedList(1);
        num1.append(2);
        num1.append(3);
        num1.append(4);
        num1.append(5);
        num1.append(3);
        print(num1.getHead());
        LoopDetection loopDetection = new LoopDetection(num1.getHead());
        System.out.println(loopDetection.find().value);



    }
    //private functions
    public static void print(Node node){
        while(node!=null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.println();
    }

}
