package com.dataStructures.queues.linkedlists;

public class Queue {
    public Node first;
    public Node last;
    public int length;

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    //FIFO
    public String peek(){
        if(this.length > 0){
            return this.first.value;
        }else{
            return null;
        }
    }

    public void enqueue(String value){
        Node node = new Node(value);
        if(this.length==0){
            this.first = node;
        }else if(this.length == 1){
            this.last = node;
            this.first.next = last;
        }else{
            this.last.next = node;
        }
        this.length++;

    }

    public void dequeue(){
        if (this.length > 0) {
            this.first = this.first.next;

            if (this.length == 1) {
                this.last = null;
            }
            this.length--;
        }
    }


    public boolean isEmpty(){
        return this.length == 0;
    }

}
