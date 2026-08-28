package com.firealgo.javabasicconcept.core.string;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        Map<String, Integer> map = new HashMap<>();
        map.put(s1, 2);
        map.put(s2, 3);
        System.out.println(map.size());
    }
}
