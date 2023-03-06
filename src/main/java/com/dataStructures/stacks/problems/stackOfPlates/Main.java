package com.dataStructures.stacks.problems.stackOfPlates;


public class Main {
    public static void main(String[] args) {
       StackOfPlates stackOfPlates = new StackOfPlates();
       System.out.println("-------Push---------");
       stackOfPlates.push(10);
       stackOfPlates.push(20);
        stackOfPlates.push(30);
        stackOfPlates.push(40);
        stackOfPlates.push(50);
        stackOfPlates.push(60);
        stackOfPlates.push(70);
        stackOfPlates.display();
        System.out.println("-------Pop---------");
        stackOfPlates.pop();
        stackOfPlates.display();
        stackOfPlates.push(70);
        System.out.println("-------Pop At---------");
        stackOfPlates.popAt(1);
        stackOfPlates.display();



    }

}
