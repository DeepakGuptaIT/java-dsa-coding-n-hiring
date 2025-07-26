package com.firealgo.codingproblemsolvinginjava.codility_agileengine;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PositiveInterger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1,8};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // Implement your solution here
//        int max = Arrays.stream(A).max().getAsInt();
//        if(max <= 0) return 1;
//        return max + 1;
        int num = 1;
        List<Integer> arr = Arrays.stream(A).boxed().collect(Collectors.toList());
        while (arr.contains(num)) {
            num ++;
        }
        return num;
    }
}
