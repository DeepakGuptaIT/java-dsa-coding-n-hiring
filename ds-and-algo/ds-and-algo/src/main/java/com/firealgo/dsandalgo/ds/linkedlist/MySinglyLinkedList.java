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
		// TODO Auto-generated constructor stub
		this.head = null;
	}
	public void insertNode(int data) {
		Node node = new Node(data);
//		if(this.head == null) {
//			this.head = node;
//		} else {
//			
//			node.next = head;
//		}
		if (this.head != null) {
			node.next = head;
		}
		this.head = node;
	}

}
