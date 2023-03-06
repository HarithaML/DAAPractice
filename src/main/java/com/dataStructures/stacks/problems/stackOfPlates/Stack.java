package com.dataStructures.stacks.problems.stackOfPlates;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stackArray;
    int capacity;

    public Stack() {
        this.stackArray = new ArrayList<>();
        this.capacity =3;
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

    public void pop(){
        this.stackArray.remove(stackArray.size()-1);

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
