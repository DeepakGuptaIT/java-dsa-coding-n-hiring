package com.firealgo.javabasicconcept.collection.factoryMethodsforImmutableListSetAndMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsforImmutableListSetAndMap {

	public static void main(String[] args) {
//		immutableList();
//		immutableSet();
		immutableMap();

	}
	
	private static void immutableList() {
		//Empty List Example
		List immutableList = List.of();
		immutableList = List.of("one","two","three");
		System.out.println(immutableList);
	}
	
	private static void immutableSet() {
		Set<String> set = Set.of("a","b","c");
		System.out.println(set);
	}
	
	private static void immutableMap() {
		Map<Integer,String> nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
		System.out.println(nonemptyImmutableMap);
	}

}
