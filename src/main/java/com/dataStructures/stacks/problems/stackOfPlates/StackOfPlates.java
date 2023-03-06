package com.dataStructures.stacks.problems.stackOfPlates;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class StackOfPlates {

    ArrayList<Stack> stackOfPlates ;

    public StackOfPlates() {
        this.stackOfPlates = new ArrayList<>();
    }

    //create a new stack when exceeds capacity

    public void push(int value){
        if(stackOfPlates.isEmpty()){
            Stack stack = new Stack();
            stack.push(value);
            stackOfPlates.add(stack);
        }else{
            int number = stackOfPlates.size()-1;
            Stack stackToPush = stackOfPlates.get(number);
            if(!stackToPush.isFull()){
                stackToPush.push(value);
            }else{
                Stack stack = new Stack();
                stack.push(value);
                stackOfPlates.add(stack);
            }
        }

    }
    public void pop(){
        if(stackOfPlates.isEmpty()){
            System.out.println("Cannot pop the stack is empty");
        }else{
            int number = stackOfPlates.size()-1;
            Stack stackToPop = stackOfPlates.get(number);
            if(!stackToPop.isEmpty()){
                stackToPop.pop();
                if(stackToPop.isEmpty()){
                    stackOfPlates.remove(stackToPop);
                }
            }else{
                stackToPop = stackOfPlates.get(number-1);
                stackToPop.pop();
                if(stackToPop.isEmpty()){
                    stackOfPlates.remove(stackToPop);
                }
            }
        }

    }

    public void display(){
        AtomicInteger count = new AtomicInteger(1);
        stackOfPlates.forEach(stack -> {
            System.out.println("Stack :"+count);
            count.getAndIncrement();
            stack.stackArray.forEach(System.out::println);
        });
    }


    public void popAt(int number) {
        int index = number-1;
        if(index<=stackOfPlates.size()){
            //able to pop
            Stack stackToPop = stackOfPlates.get(index);
            if(!stackToPop.isEmpty()){
                stackToPop.pop();
                if(stackToPop.isEmpty()){
                    stackOfPlates.remove(stackToPop);
                }
            }else{
                System.out.println("Is empty");
            }

        }else{
            System.out.println("The number exceeds size of the stack of plates");
        }
    }
}
