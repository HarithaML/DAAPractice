package com.dataStructures.linkedlists;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    Node head;
    Node node;





    public Palindrome(Node head) {
        this.head = head;
        this.node = this.head;
    }
    public boolean check(){
        Node node1 = this.head;
        Node node2 = reverse();
        while (node1!=null&&node2!=null){
            if(node1.value!=node2.value){
                return false;
            }
            node1 = node1.next;
            node2=node2.next;
        }
        return true;
    }

    public Node reverse(){
       Node node1 = this.node;
       while(node1.next!=null){
           node1 = node1.next;
       }
       node1.next = this.node;
       node1.next.next =null;
       return node1;
    }



}
