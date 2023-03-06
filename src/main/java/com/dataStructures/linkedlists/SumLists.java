package com.dataStructures.linkedlists;

public class SumLists {
    Node head1;
    Node node1;
    Node head2;
    Node node2;

    public SumLists(Node head1, Node head2) {
        this.head1 = head1;
        this.head2 = head2;
        node1 = this.head1;
        node2 = this.head2;
    }

    public Node doSum(){
        int a= node1.value,b = node2.value;
        int count1 = 0,count2 = 0;
        while(node1.next!=null){
            node1 = node1.next;
            count1++;
            a = a+ (int) ((node1.value)*(Math.pow(10,count1)));
        }
        while(node2.next!=null){
            node2 = node2.next;
            count2++;
            b = b+ (int) ((node2.value)*(Math.pow(10,count2)));
        }
        int c = a+b;

        LinkedList linkedList = new LinkedList(c%10);
        c = c/10;

        while(c>0){
            linkedList.append(c%10);
            c = c/10;
        }

       return  linkedList.getHead();
    }

}
