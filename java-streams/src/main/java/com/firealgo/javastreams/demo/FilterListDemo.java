package com.firealgo.javastreams.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterListDemo {
    public static void main(String[] args) {
        // Enter data using BufferReader
        List<Integer> nums = Arrays.asList(1, 3, 2, 5, 6, 9, 3, 7);
        System.out.println(nums);
//        System.out.println(findOddNumbers(nums));
        System.out.println(findEvenNumbersUsingStreams(nums));
        System.out.println(findEvenNumbersJava7(nums));

    }

    private static List<Integer> findEvenNumbersJava7(List<Integer> nums) {
        System.out.println(" ----------- even nums using java 7--------");
        List<Integer> result = new ArrayList<>();
        for(int num: nums) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    private static List<Integer> findEvenNumbersUsingStreams(List<Integer> nums) {
        System.out.println(" ----------- even nums using Streams --------");
        return nums.stream().filter(e -> e % 2 == 0).toList();
    }

    private static List<Integer> findOddNumbers(List<Integer> nums) {
        System.out.println(" ----------- odd nums --------");
        return nums.stream()
                .filter(e -> e % 2 != 0)
                .toList();
    }

}
