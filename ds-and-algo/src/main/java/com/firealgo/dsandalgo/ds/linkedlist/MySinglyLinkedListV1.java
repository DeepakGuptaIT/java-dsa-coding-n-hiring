package com.firealgo.dsandalgo.ds.linkedlist;

public class MySinglyLinkedListV1 {


    public Node head;

    public MySinglyLinkedListV1() {
        this.head = null;
    }

    // Insertion is happening in front. New node is becoming head
    public void insertNode(int data) {
        Node node = new Node(data);
        if (this.head != null) {
            node.next = head;
        }
        this.head = node;
    }

    static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
