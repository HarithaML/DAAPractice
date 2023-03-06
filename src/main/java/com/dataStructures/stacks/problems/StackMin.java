package com.dataStructures.stacks.problems;

import java.util.ArrayList;

public class StackMin {
    ArrayList<Integer> stackArray;

    public StackMin() {
        this.stackArray = new ArrayList<>();
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

    public int min(){
        int min = this.stackArray.get(0);
        for (Integer integer : this.stackArray) {
            if (integer <= min) {
                min = integer;
            }
        }
        return min;
    }

}
