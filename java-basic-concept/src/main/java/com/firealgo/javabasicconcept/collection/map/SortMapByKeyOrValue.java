package com.firealgo.javabasicconcept.collection.map;

import com.firealgo.javabasicconcept.vo.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKeyOrValue {

	public static void main(String[] args) {
//		sortMapByKey();
		// comare by value
		/* To sort the map by value 
		 * change .sorted(Map.Entry.comparingByKey()) to 
		 * .sorted(Map.Entry.comparingByValue()) */
//		sortMapByValue();
		sortEmployeeMapByValue();

	}

	private static void sortEmployeeMapByValue() {
		Map<String, Student> map = new HashMap<>();
		map.put("a", new Student(1, "deepak", "kumar", "deepak@gmail.com"));
		map.put("p", new Student(2, "rohan", "gupta", "rohan@gmail.com"));
		map.put("b", new Student(3, "mony", "kumari", "amony@gmail.com"));
		 System.out.println("Original...");
	        System.out.println(map);
	        Map<String, Student> result = map.entrySet().stream()
//	        		.sorted(Map.Entry.comparingByValue((e1,e2)-> Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId()))))
	        		.sorted(Map.Entry.comparingByValue((e1,e2)-> Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId()))))
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	        				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
	        System.out.println("Sorted emplyee map by value...");
	        System.out.println(result);
	        // e1.getFirstName().compareTo(e2.getFirstName())
		
	}

	private static void sortMapByValue() {
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("a", 6);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("Original...");
        System.out.println(unsortMap);
        
     // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortMap.entrySet().stream()
        		.sorted(Map.Entry.comparingByValue())
        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted by value...");
        System.out.println(result);
	}

	private static void sortMapByKey() {
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("a", 6);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("Original...");
        System.out.println(unsortMap);
        
     // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortMap.entrySet().stream()
        		.sorted(Map.Entry.comparingByKey())
        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted by key...");
        System.out.println(result);
		
	}

}
