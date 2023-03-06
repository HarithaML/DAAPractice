package com.dataStructures.linkedlists;

public class ReturnKToLast {
    public Node returnK(Node node,int k){
        LinkedList  linkedList = new LinkedList<>();
        int count =0;
        while(node!=null){
            count++ ;
            if(count == k){
                 linkedList.setHead(node);
                 break;
            }
            node = node.next;
        }
        return linkedList.getHead();
    }
}
