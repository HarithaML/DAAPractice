package com.dataStructures.linkedlists;

import java.util.ArrayList;

public class LoopDetection {
    Node head;

    public LoopDetection(Node head) {
        this.head = head;
    }

    public Node find(){
        Node node = this.head;
        Node node1 = null;
        ArrayList<Integer> arrayList = new ArrayList();
        while (node.next!=null){
            if(arrayList.contains(node.value)){
                node1 = node;
            }else{
                arrayList.add(node.value);
                node1 = null;
            }
            node = node.next;
        }
        return node1;
    }
}
