package com.firealgo.javastreams.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumsForJava7Comparisn {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 2, 5, 6, 9, 3, 7);
        System.out.println(" ----------- even nums using java 7--------");
        List<Integer> result = new ArrayList<>();
        for(int num: nums) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }
        System.out.println(result);
        System.out.println(" ----------- even nums using Streams --------");
    }
}
