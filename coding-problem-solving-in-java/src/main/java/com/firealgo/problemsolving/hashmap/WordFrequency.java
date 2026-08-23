package com.firealgo.problemsolving.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "John is an employee of ABC company, JOHN is from India, JOHN! is good in java.";

        String[] arr = str.replace(",", "")
                .replace("!", "").split("\\s");
        HashMap<String, Integer> frequency = new HashMap<>();
        for(var word : arr) {
            frequency.put(word.toLowerCase(), frequency.getOrDefault(word.toLowerCase(),0)+1);
        }
//        System.out.println(frequency);
        int max = frequency.values().stream().mapToInt(e->e).max().getAsInt();
//        System.out.println(max);
        StringBuilder sb = new StringBuilder();
        for(var entry: frequency.entrySet()) {
            if(entry.getValue() == max) {
                //find the first word
                String s = Arrays.stream(arr).filter(e-> e.equalsIgnoreCase(entry.getKey())).findFirst().get();
                sb.append(s).append(", ");
            }
        }
        sb.append("& frequency - ").append(max);
        System.out.println(sb.toString());
        List<String> strs = new ArrayList<>();

    }
}
