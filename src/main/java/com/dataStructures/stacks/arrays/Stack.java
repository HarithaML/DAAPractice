package com.dataStructures.stacks.arrays;

import java.util.ArrayList;

public class Stack {
    ArrayList<String> stackArray;

    public Stack() {
        this.stackArray = new ArrayList<>();
    }

    //LIFO
    public String peek(){
        if(this.stackArray.size()>0){
            return this.stackArray.get(this.stackArray.size()-1);
        }else {
            return null;
        }
    }

    public void push(String value){
        this.stackArray.add(value);
    }

    public void pop(){
        this.stackArray.remove(stackArray.size()-1);
    }

    public boolean isEmpty() {
        return stackArray.size() == 0;
    }


}
