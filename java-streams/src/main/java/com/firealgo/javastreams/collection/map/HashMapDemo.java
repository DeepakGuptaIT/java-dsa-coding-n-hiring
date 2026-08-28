package com.firealgo.javastreams.collection.map;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // Char freq
        String str = "Hello";
        var freq = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Integer> freq2 = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0)+1);
        }
        System.out.println(freq);
        System.out.println(freq2);
        System.out.println(freq2.get('e'));
    }
}
