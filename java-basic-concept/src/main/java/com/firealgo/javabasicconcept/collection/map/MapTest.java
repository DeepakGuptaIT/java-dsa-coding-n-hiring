package com.firealgo.javabasicconcept.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true)
			compute();

	}

	private static void createMap() {
		Map<Map<String, String>, Map<String, String>> map = null;
		map.put(null, null);
		Map<Object, Object> map2 = null;
		map2.put(map2, null);
	}
	private static void compute() {
		Map<String, String> myMap = getMap();
		String key = "a", msg = "hi ";
		   myMap.compute(key, (k, v) -> (v == null) ? msg : v.concat(msg));
		System.out.println(myMap);
	}

	private static Map<String, String> getMap() {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("a", "b");
		myMap.put("c", "d");
		return myMap;
	}
	

}
