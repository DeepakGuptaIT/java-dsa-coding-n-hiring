package com.firealgo.dsandalgo.ds.linkedlist;

import com.firealgo.dsandalgo.ds.linkedlist.MySinglyLinkedListV1.Node;

public class LinkedListImplementTest {
	
	public static void main(String[] args) {
		MySinglyLinkedListV1 llist = new MySinglyLinkedListV1();
		llist.insertNode(5);
		llist.insertNode(10);
		llist.insertNode(20);
		printList(llist);
	}

	private static void printList(MySinglyLinkedListV1 llist) {
		// TODO Auto-generated method stub
		Node node = llist.head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
