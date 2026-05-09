package com.firealgo.dsandalgo.ds.linkedlist;

public class MySinglyLinkedList {
	
	
	static class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public Node head;
	public MySinglyLinkedList() {
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

}
