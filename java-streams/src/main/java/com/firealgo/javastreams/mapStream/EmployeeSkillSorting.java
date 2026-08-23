package com.firealgo.javastreams.mapStream;

import java.util.*;

public class EmployeeSkillSorting {

    public static void main(String[] args) {

        Map<String, List<Integer>> scores = Map.of(
                "Amit", List.of(80, 90, 70),
                "Rahul", List.of(90, 95),
                "Priya", List.of(70, 75, 80, 85),
                "Neha", List.of(95),
                "Vikas", List.of(80, 85, 90)
        );

        List<Map.Entry<String, List<Integer>>> result =
                sortByAverage(scores);

        System.out.println(result);
    }

    /*
     * Problem:
     * Sort employees by their average score in descending order.
     *
     * If two employees have the same average score,
     * sort them by employee name in ascending order.
     *
     * Sample Input:
     *
     * Amit  -> [80, 90, 70]       -> 80.0
     * Rahul -> [90, 95]           -> 92.5
     * Priya -> [70, 75, 80, 85]   -> 77.5
     * Neha  -> [95]               -> 95.0
     * Vikas -> [80, 85, 90]       -> 85.0
     *
     * Expected Output:
     *
     * [
     *     Neha=[95],
     *     Rahul=[90, 95],
     *     Vikas=[80, 85, 90],
     *     Amit=[80, 90, 70],
     *     Priya=[70, 75, 80, 85]
     * ]
     */
    static List<Map.Entry<String, List<Integer>>> sortByAverage(
            Map<String, List<Integer>> scores) {

        // TODO: Implement using Stream API
        var res = scores.entrySet().stream()
                .sorted(
                        Comparator.comparing((Map.Entry<String, List<Integer>> e) -> e.getValue().stream().mapToInt(f -> f).average().orElse(0)).reversed()
                                .thenComparing(Map.Entry::getKey)
                )
                .toList();


        return res;
    }

    /*
     * Problem:
     * Sort employees by:
     *
     * 1. Number of skills DESC
     * 2. Employee name ASC
     *
     * Sample Input:
     * {
     *     Amit=[Java, Spring, AWS],
     *     Rahul=[Java, React],
     *     Priya=[Java, Spring, Kafka, Docker],
     *     Neha=[Java],
     *     Vikas=[Java, AWS, Docker],
     *     Sneha=[Java, React, AWS]
     * }
     *
     * Expected Output:
     * [
     *     Priya=[Java, Spring, Kafka, Docker],
     *     Amit=[Java, Spring, AWS],
     *     Sneha=[Java, React, AWS],
     *     Vikas=[Java, AWS, Docker],
     *     Rahul=[Java, React],
     *     Neha=[Java]
     * ]
     */
    static List<Map.Entry<String, List<String>>> sortBySkillCount(
            Map<String, List<String>> employees) {

        // TODO: Implement using Stream API
        var res = employees.entrySet().stream()
                .sorted(
                        Comparator.comparing((Map.Entry<String, List<String>> e) -> e.getValue().size()).reversed()
                                .thenComparing(Map.Entry::getKey)
                ).toList();


        return res;
    }
}