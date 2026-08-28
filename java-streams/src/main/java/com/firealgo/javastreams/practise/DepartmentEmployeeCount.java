package com.firealgo.javastreams.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {

    public static void main(String[] args) {

        Map<String, String> employees = Map.of(
                "Amit", "IT", "Rahul", "HR",
                "Priya", "IT", "Neha", "Finance",
                "Vikas", "HR", "Sneha", "IT",
                "Rohit", "Finance", "Karan", "Sales"
        );

        System.out.println(findDepartments(employees));// {IT=3, Finance=2, HR=2}
    }


    /**
     * Find departments having more than one employee.
     * Sort by employee count descending, then department name ascending.
     */
    static Map<String, Long> findDepartments(Map<String, String> employees) {
        var res = employees.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));
        var res2 = res.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .sorted(Comparator.comparing(Map.Entry<String, Long>::getValue).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                        (v1,v2) -> v1,
                        LinkedHashMap::new));

        System.out.println();

        return res2;

    }
}