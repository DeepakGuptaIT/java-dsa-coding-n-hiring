package com.firealgo.javabasicconcept.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
//		addArrayItems();
//		mergeTwoArrayAndSort();
		
	}

	private static void mergeTwoArrayAndSort() {
		// TODO Auto-generated method stub
		int[] a = {10,2,5};
		int[] b = {9,2,3};
		int[] res = new int[a.length + b.length];
		List<Integer> list = new ArrayList<>();
		for(int i: a) {
			list.add(i);
		}
		for(int i:b) {
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);
		
		
	}

	private static void addArrayItems() {
		int[] arr = new int[3];
		Arrays.fill(arr, 5);
		for(int i: arr) {
			System.out.println(i);
		}
		//List<Integer> list = Arrays.stream(arr).map(e -> e+1).boxed().collect(Collectors.toList());
		for(int i=0;i< arr.length; i++) {
			arr[i] = arr[i]+i;
		}
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
