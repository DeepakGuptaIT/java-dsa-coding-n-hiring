package com.firealgo.javastreams.mapStream;

import java.util.*;
import java.util.stream.*;

public class MapStreamPractice {

    public static void main(String[] args) {

        Map<String, Integer> salary = Map.of(
                "Amit", 90000,
                "Rahul", 120000,
                "Priya", 95000,
                "Neha", 150000,
                "Vikas", 110000,
                "Sneha", 150000,
                "Rohit", 80000
        );

        List<Map.Entry<String, Integer>> result =
                findTop3Employees(salary);

        System.out.println(result);
    }

    /*
     * Problem:
     * Find the top 3 highest-paid employees.
     *
     * Sorting:
     * 1. Salary descending
     * 2. Employee name ascending when salary is equal
     *
     * Return:
     * List<Map.Entry<String, Integer>>
     *
     * Sample Input:
     * {
     *     Amit=90000,
     *     Rahul=120000,
     *     Priya=95000,
     *     Neha=150000,
     *     Vikas=110000,
     *     Sneha=150000,
     *     Rohit=80000
     * }
     *
     * Expected Output:
     * [Neha=150000, Sneha=150000, Rahul=120000]
     */
    static List<Map.Entry<String, Integer>> findTop3Employees(
            Map<String, Integer> salary) {

        // TODO: Implement using Stream API
        var res = salary.entrySet().stream().sorted(
                Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry<String, Integer>::getKey))
                .limit(3)
                .toList();

        return res;
    }
}