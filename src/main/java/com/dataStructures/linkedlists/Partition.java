package com.dataStructures.linkedlists;

public class Partition {

    Node head;
    Node node;


    public Partition(Node head) {
        this.head = head;
        this.node = this.head;

    }

    public Node divide(int x) {
        Node lessStart = null;
        Node lessEnd = null;
        Node moreStart = null;
        Node moreEnd = null;

        while (node != null) {
            Node next = node.next;
            node.next = null;
            if (node.value < x) {
                ///*Insert node into end of before list*/
                if (lessStart == null) {
                    lessStart = node;
                    lessEnd = lessStart;
                } else {
                    lessEnd.next = node;
                    lessEnd = lessEnd.next;
                }
            } else {
                // Insert node into end of after list*/
                if (moreStart == null) {
                    moreStart = node;
                    moreEnd = moreStart;
                } else {
                    moreEnd.next = node;
                    moreEnd = moreEnd.next;
                }
            }
            node = next;
        }

        if (lessStart == null) {
            return moreStart;
        }
        /* Merge before list and after list */

        lessEnd.next = moreStart;
        return lessStart;

    }
}
