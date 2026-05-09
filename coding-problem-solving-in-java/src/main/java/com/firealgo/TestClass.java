package com.firealgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class TestClass {
	
	
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static class LinkedList {
		Node head;
		LinkedList() {
			this.head = null;
		}
		public void insertNode(int data) {
			Node node  = new Node(data);
			if(head != null) {
				this.head.next = node;
			}
			this.head = node;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,4));
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int i: list) {
//			boolean flag = set.add(i);
//			if(flag == false) {
//				result.add(i);
//			}
			
			
		}
		List<Integer> result2 = list.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println(result);
		System.out.println(set);
		
		
		

	}
	//singlton 
	// factory
	
	// traverse the list and delete the prev element
//	for(int i=0;i< list.)
//	hashmap, key = a, 1//read
//			b, 2// update to 3
			
			
	// 
			
			

}
