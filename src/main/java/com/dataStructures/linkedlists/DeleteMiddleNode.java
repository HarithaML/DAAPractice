package com.dataStructures.linkedlists;

public class DeleteMiddleNode {

    public Node removeMiddleNode(Node head){
        int middle = findMiddle(head);
        Node node = head;
        for(int i =1;i<middle;i++){
                node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
    public int findMiddle(Node head){
        Node node = head;
        int count =1;
        while(node.next!=null){
            node = node.next;
            count++;
        }
        int middle;
        if(count%2==0){
            middle = count/2;
        }else{
            middle = (count-1)/2;
        }
        return middle;
    }
}
