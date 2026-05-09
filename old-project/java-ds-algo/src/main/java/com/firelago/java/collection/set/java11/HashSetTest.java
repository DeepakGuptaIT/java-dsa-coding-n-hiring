package com.firelago.java.collection.set.java11;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createHashSet();

	}
	
	private static void createHashSet() {
		Set<String> set = new HashSet<>(5, 16);
		System.out.println(set.size());
	}

}
