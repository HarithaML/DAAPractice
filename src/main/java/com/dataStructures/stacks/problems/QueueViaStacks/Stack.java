package com.dataStructures.stacks.problems.QueueViaStacks;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stackArray;
    int capacity;

    public Stack() {
        this.stackArray = new ArrayList<>();
        this.capacity =10;
    }

    //LIFO
    public Integer peek(){
        if(this.stackArray.size()>0){
            return this.stackArray.get(this.stackArray.size()-1);
        }else {
            return null;
        }
    }

    public void push(Integer value){
        this.stackArray.add(value);

    }

    public int pop(){
        int x = this.stackArray.get(stackArray.size()-1);
        this.stackArray.remove(stackArray.size()-1);
        return x;

    }

    public boolean isEmpty() {
        return stackArray.size() == 0;
    }

    public boolean isFull(){
        return this.stackArray.size() == capacity;
    }

    public ArrayList<Integer> getList(){
        return this.stackArray ;
    }

}
