package com.firealgo.javastreams.charStream;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToCharStream {
    public static void main(String[] args) {
//        stringToCharStream();
        findFirstUniqueChar("abcab");
    }

    private static void findFirstUniqueChar(String s) {
        Set<Character> set = new HashSet<>();
//        var freq = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Integer> freq = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c: chars) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for (char c: chars) {
            if(freq.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("No unique");

    }

    private static void stringToCharStream() {
        String str = "deepakkumar";
        str.chars().mapToObj(c -> (char) c).forEach(System.out::println);
    }


}
