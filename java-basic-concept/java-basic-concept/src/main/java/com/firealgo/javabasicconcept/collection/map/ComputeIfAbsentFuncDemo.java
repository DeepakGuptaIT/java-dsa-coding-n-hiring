package com.firealgo.javabasicconcept.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentFuncDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.computeIfAbsent("C", key -> key.length());
        System.out.println(map);
        // map of string , List
        Map<String, List<Integer>> map2 = new HashMap<>();
        map2.put("A", List.of(1,2));
        map2.put("B", List.of(2,3));
        map2.computeIfAbsent("C", key -> new ArrayList<>()).add(4);
        System.out.println(map2);

    }
}
