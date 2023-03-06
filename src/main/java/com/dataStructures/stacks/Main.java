package com.dataStructures.stacks;

import com.dataStructures.stacks.arrays.Stack;
import com.dataStructures.stacks.problems.StackMin;
import com.dataStructures.stacks.problems.ThreeInOne;


public class Main {
    public static void main(String[] args) {

        System.out.println("Three In One Stack");

        int length = 30;
        ThreeInOne threeInOne = new ThreeInOne(length);
        //pushing values on different stacks

        threeInOne.push(10,1);
        threeInOne.push(10,2);
        threeInOne.push(10,3);
        threeInOne.push(20,1);
        threeInOne.push(20,2);
        threeInOne.push(20,3);
        threeInOne.push(30,1);
        threeInOne.push(30,2);
        threeInOne.push(30,3);
        threeInOne.push(40,1);
        threeInOne.push(40,2);
        threeInOne.push(40,3);
        threeInOne.push(50,1);
        threeInOne.push(50,2);
        threeInOne.push(50,3);

        threeInOne.displayStacks();

        System.out.println("\n");
        System.out.println("Minimum in a Stack");

        StackMin stackMin = new StackMin();
        stackMin.push(10);
        stackMin.push(30);
        stackMin.push(5);
        stackMin.push(3);
        stackMin.push(40);
        System.out.println(stackMin.min());








    }
}
