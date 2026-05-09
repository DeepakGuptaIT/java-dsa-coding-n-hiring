package com.firealgo.dsandalgo.practise.ds;

public class MyLinkedList {

    Node head;

    public void add(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = head.next;
            }
            current.next = newNode;
        }

    }

    public void printNodes() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
//        System.out.println(current.data);
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
