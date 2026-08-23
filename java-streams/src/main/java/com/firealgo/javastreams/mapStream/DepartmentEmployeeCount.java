package com.firealgo.javastreams.mapStream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {

    public static void main(String[] args) {

        Map<String, String> employees = Map.of(
                "Amit", "IT",
                "Rahul", "HR",
                "Priya", "IT",
                "Neha", "Finance",
                "Vikas", "HR",
                "Sneha", "IT",
                "Rohit", "Finance",
                "Karan", "Sales"
        );

        Map<String, Long> result = findDepartments(employees);

        System.out.println(result);
    }

    /*
     * Problem:
     * Find departments having more than one employee.
     *
     * Return:
     * Map<Department, EmployeeCount>
     *
     * Sorting:
     * 1. Employee count descending
     * 2. Department name ascending
     *
     * Sample Input:
     * {
     *     Amit=IT,
     *     Rahul=HR,
     *     Priya=IT,
     *     Neha=Finance,
     *     Vikas=HR,
     *     Sneha=IT,
     *     Rohit=Finance,
     *     Karan=Sales
     * }
     *
     * Expected Output:
     * {
     *     IT=3,
     *     Finance=2,
     *     HR=2
     * }
     */
    static Map<String, Long> findDepartments(
            Map<String, String> employees) {

        var freq = employees.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));


        return freq.entrySet().stream().filter(e -> e.getValue() > 1)
                .sorted(Comparator.comparing(Map.Entry<String, Long>::getValue).reversed().thenComparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
    }
}