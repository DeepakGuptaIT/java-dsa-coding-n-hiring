package com.firealgo.dsandalgo.ds.linkedlist;

/**
 * Singly Linked List Implementation
 *
 * Key Idea:
 * Each node stores:
 *  - data
 *  - reference to next node
 *
 * Unlike arrays:
 *  - No contiguous memory required
 *  - Dynamic size
 *
 * Trade-off:
 *  - Fast insert/delete (O(1) with reference)
 *  - Slow random access (O(n))
 */
public class MySinglyLinkedList {

    // Head points to the first node of the list
    // If head == null → list is empty
    private Node head;

    /* ================= INSERT ================= */

    /**
     * Insert at beginning (Head Insertion)
     *
     * Steps:
     * 1. Create new node
     * 2. Point new node's next to current head
     * 3. Move head to new node
     *
     * Why O(1)?
     * - No traversal needed
     */
    public void insertAtHead(int data) {
        Node node = new Node(data);

        // New node points to current head
        node.next = head;

        // Update head to new node
        head = node;
    }

    /**
     * Insert at end (Tail Insertion)
     *
     * Steps:
     * 1. Traverse till last node
     * 2. Attach new node at end
     *
     * Why O(n)?
     * - Need to traverse entire list
     *
     * Optimization:
     * - Maintain tail pointer → O(1)
     */
    public void insertAtTail(int data) {
        Node node = new Node(data);

        // If list is empty → new node becomes head
        if (head == null) {
            head = node;
            return;
        }

        Node curr = head;

        // Traverse to last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Attach new node
        curr.next = node;
    }

    /**
     * Insert at given position (0-based index)
     *
     * Example:
     * position = 0 → insert at head
     *
     * Steps:
     * 1. Traverse to (position - 1)
     * 2. Adjust pointers:
     *    newNode.next = curr.next
     *    curr.next = newNode
     *
     * Edge Case:
     * - If position invalid → ignore
     */
    public void insertAtPosition(int data, int position) {

        if (position == 0) {
            insertAtHead(data);
            return;
        }

        Node curr = head;

        // Move to node before desired position
        for (int i = 0; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Invalid position (beyond list size)
        if (curr == null) return;

        Node node = new Node(data);

        // Link new node
        node.next = curr.next;
        curr.next = node;
    }

    /* ================= DELETE ================= */

    /**
     * Delete head node
     *
     * Simply move head to next node
     *
     * Garbage Collector will clean old node
     */
    public void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Delete first occurrence of value
     *
     * Steps:
     * 1. Handle head separately
     * 2. Traverse list and find previous node
     * 3. Skip the node (curr.next = curr.next.next)
     *
     * Why careful?
     * - Need previous node to adjust pointer
     */
    public void deleteByValue(int value) {

        if (head == null) return;

        // If value is at head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node curr = head;

        // Find node before the target node
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        // If found → remove it
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    /* ================= SEARCH ================= */

    /**
     * Linear search
     *
     * Traverse node by node
     *
     * Time: O(n)
     */
    public boolean search(int value) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == value) return true;
            curr = curr.next;
        }

        return false;
    }

    /* ================= REVERSE ================= */

    /**
     * Reverse Linked List (Iterative)
     *
     * Core Idea:
     * Reverse direction of pointers
     *
     * Before:
     * A → B → C → null
     *
     * After:
     * null ← A ← B ← C
     *
     * Steps:
     * 1. Keep track of prev, curr, next
     * 2. Reverse link (curr.next = prev)
     * 3. Move pointers forward
     *
     * Critical Line:
     * Node next = curr.next;
     * (Without this → list is lost ❌)
     */
    public void reverse() {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            // Save next node before breaking link
            Node next = curr.next;

            // Reverse pointer
            curr.next = prev;

            // Move pointers forward
            prev = curr;
            curr = next;
        }

        // Update head to new front
        head = prev;
    }

    /* ================= UTILITY ================= */

    /**
     * Calculate size of list
     *
     * Traverse entire list
     */
    public int size() {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    /**
     * Print list for debugging
     *
     * Format:
     * 10 -> 20 -> 30 -> null
     */
    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    /* ================= NODE ================= */

    /**
     * Node structure
     *
     * data → value stored
     * next → reference to next node
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}