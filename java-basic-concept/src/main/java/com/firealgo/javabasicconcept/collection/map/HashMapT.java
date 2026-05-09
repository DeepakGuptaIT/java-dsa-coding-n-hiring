package com.firealgo.javabasicconcept.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapT {

	public static void main(String[] args) {
//		verientyT();
		computeT();

	}

	private static void computeT() {
		Map<String, String> mp = new HashMap<>();
		mp.put("a", "one");
		mp.put("b", "two");
		mp.put("c", null);
		String msg = "5";
		mp.compute("a", (k, v) -> (v == null) ? msg : v.concat(msg));
		System.out.println(mp);
		
	}

	private static void verientyT() {
		Map<Boolean,Boolean> boolMap = new HashMap<>();
		boolMap.put(true, false);
		boolMap.put(false, true);
		boolMap.replace(true, true);//cool
		System.out.println(boolMap);
		boolMap.remove(true);
		boolean f = boolMap.getOrDefault(true, true);
		System.out.println(f);
		
	}
	

}
