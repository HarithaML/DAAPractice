package com.dataStructures.stacks.problems;

import com.dataStructures.stacks.arrays.Stack;

import java.util.Arrays;

public class ThreeInOne {
    int array[];
    int stackPointer[];
    int referencePointer[];

    int length;


    public ThreeInOne(int length) {
        this.length = length;
        this.array = new int[length];
        this.stackPointer = new int[3];
        this.referencePointer = new int[3];




        //initialize stack pointer of each array

        stackPointer[1] = length/3 ;
         stackPointer[2] = length/3 * 2;

         //initialize reference pointer of each array

        referencePointer[1] = stackPointer[1];
        referencePointer[2] = stackPointer[2];





    }



    public  void push(int value, int stackNumber){
        System.out.println("//Pushing "+value+" in "+stackNumber);
        if(referencePointer[0] == length/3 && stackNumber == 1) {
            System.out.println("-------Stack is full");
            return;
        }else if(referencePointer[1] == (length/3)*2 && stackNumber == 2){
            System.out.println("-------Stack is full");
            return;
        }else if(referencePointer[2] == (length/3)*3 && stackNumber == 3){
            System.out.println("-------Stack is full");
            return;
        }

        for (int i =0;i<length;i++){
            if(i == referencePointer[stackNumber-1]){
                array[i]= value;
                System.out.println("Pushed "+value+" in "+stackNumber);
            }

        }
        referencePointer[stackNumber-1] = referencePointer[stackNumber-1]+1;

    }



    public void displayStacks(){
        for(int i = 0;i<length;i++){
            if(i==stackPointer[0]){
                System.out.println("Stack 1");
                System.out.print("[ ");
            }
            if(i==stackPointer[1]){
                System.out.print(" ]");
                System.out.println("\nStack 2");
                System.out.print("[ ");
            }
            if(i==stackPointer[2]){
                System.out.print(" ]");
                System.out.println("\nStack 3");
                System.out.print("[ ");
            }
            System.out.print(array[i]+" , ");

        }
        System.out.print(" ]");
    }


}
