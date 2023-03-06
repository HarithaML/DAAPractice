package com.dataStructures.stacks.problems.QueueViaStacks;

import java.util.ArrayList;

public class QueueViaStacks {

    //FIFO
    Stack stack1;
    Stack stack2;

    public QueueViaStacks() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int value){
        if(stack1.isEmpty()){
            stack1.push(value);
        }else{
            //pushing s1 to s2
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            //push value to s1
            stack1.push(value);
            //push s2 to s1
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }



    public void dequeue(){

        this.stack1.pop();
    }

    public void display(){
        ArrayList<Integer> values = this.stack1.getList();
        for(int i=0;i<=values.size()-1;i++){
            System.out.println(values.get(i));
        }
    }
}
