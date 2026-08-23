package com.firealgo.javastreams.practise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

record Emp(
        int id,
        String name,
        String department,
        double salary,
        int age) {
}

public class StreamPractise {
    public static void main(String[] args) {

        // Input:
        List<Emp> emps = List.of(
                new Emp(1, "Deepak", "IT", 80000, 30),
                new Emp(2, "Alice", "HR", 60000, 28),
                new Emp(3, "Amit", "IT", 90000, 35),
                new Emp(4, "David", "Finance", 75000, 40),
                new Emp(5, "Emma", "HR", 65000, 32)
        );
        op1(emps);
//        op2(emps);


    }

    private static void op1(List<Emp> emps) {
//        var res = emps.stream().sorted(Comparator.comparing(Emp::department).thenComparing(Emp::salary, Comparator.reverseOrder())).toList();
//        var res = emps.stream().max(Comparator.comparing(Emp::salary)).orElse(null);
        var res = emps.stream().map(Emp::department).distinct().toList();
        System.out.println(res);
    }

    private static void op2(List<Emp> emps) {
        var res = emps.stream()
                .collect(Collectors.groupingBy(Emp::department,
                                Collectors.minBy(Comparator.comparing(Emp::age).reversed())

                        )
                );

        System.out.println(res);
    }

    private static Double op3(List<Emp> emps) {
        return emps.stream()
                .map(Emp::salary)
                .reduce(0.0, (a, b) -> a + b);

    }
}
