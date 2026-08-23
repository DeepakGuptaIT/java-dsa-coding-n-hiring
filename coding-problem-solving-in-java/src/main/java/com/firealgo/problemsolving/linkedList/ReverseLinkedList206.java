package com.firealgo.problemsolving.linkedList;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
// Create individual nodes
        ListNode head = new ListNode(10); // First node
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        // Linking nodes to form a list: 10 -> 20 -> 30 -> null
        head.next = second;
        second.next = third;

        // Display the linked list
        printLinkedList(head);
         head = reverseList(head);
        System.out.println("After reverse:");
        printLinkedList(head);

    }

    private static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // End of the list

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public static ListNode reverseListOld(ListNode head) {
        ListNode node = head;
        while (node != null) {
            ListNode second = node.next;
            second.next = node;
            node = node.next.next;

        }
        return node;
    }

}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

