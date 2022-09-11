package com.firealgo.dsandalgo.ds.linkedlist;

import com.firealgo.dsandalgo.ds.linkedlist.MySinglyLinkedList.Node;

public class LinkedListImplementTest {
	
	public static void main(String[] args) {
		MySinglyLinkedList llist = new MySinglyLinkedList();
		llist.insertNode(5);
		llist.insertNode(10);
		llist.insertNode(20);
		printList(llist);
	}

	private static void printList(MySinglyLinkedList llist) {
		// TODO Auto-generated method stub
		Node node = llist.head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
