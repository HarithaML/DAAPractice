package com.dataStructures.stacks.linkedlists;

public class Stack {
    public Node top;
    public Node bottom;
    public int length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    // top most element
    public String peek(){
        if (length > 0) {
            return top.value;
        } else {
            return null;
        }
    }

    public void push(String value){
        Node node = new Node(value);
        if(length == 0 ){
            this.top = node;
            this.bottom = node;
        }
        else {
            node.next = this.top;
            this.top = node;
        }
        this.length++;
    }

    public void  pop(){
        if (length > 0) {
            top = top.next;

            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void printStack(){
        while(top!=null){
            System.out.println(top.value);
            top = top.next;
        }
    }

}
