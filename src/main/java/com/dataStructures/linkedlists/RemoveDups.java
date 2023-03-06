package com.dataStructures.linkedlists;

import java.util.HashSet;

public class RemoveDups {

    public void remove(Node node){
        HashSet<Integer> set = new HashSet<>();
        Node previous = null;
        while(node!=null){
            if(set.contains(node.value)){
                previous.next = node.next;
            }else{
                set.add(node.value);
                previous = node;
            }
            node = node.next;
        }
    }
}
