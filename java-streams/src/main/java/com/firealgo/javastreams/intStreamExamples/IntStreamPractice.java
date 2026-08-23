package com.firealgo.javastreams.intStreamExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class IntStreamPractice {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        List<int[]> result = sortByFrequency(arr);

        result.forEach(e ->
                System.out.println(Arrays.toString(e))
        );
    }
    /*
     * Problem:
     * Find the frequency of each unique value.
     *
     * Return:
     * [value, frequency]
     *
     * Sort by frequency in descending order.
     *
     * Sample Input:
     * arr = {10, 20, 10, 30, 20, 10}
     *
     * Expected Output:
     * [[10, 3], [20, 2], [30, 1]]
     */
    static List<int[]> sortByFrequency(int[] arr) {

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var res = freq.entrySet().stream()
                .sorted(Comparator.comparingLong((Map.Entry<Integer, Long> e) -> e.getValue()).reversed())
                .map( e -> new int[]{e.getKey(), e.getValue().intValue()})
                .toList();


        return res;
    }
    /*
     * Problem:
     * Sort elements by value in ascending order.
     *
     * Preserve the original index.
     *
     * Return:
     * [originalIndex, value]
     *
     * Sample Input:
     * arr = {40, 10, 30, 20}
     *
     * Expected Output:
     * [[1, 10], [3, 20], [2, 30], [0, 40]]
     */
    static List<int[]> sortByValue(int[] arr) {

        // TODO: Implement using IntStream + mapToObj + sorted
        var res = IntStream.range(0, arr.length)
                .mapToObj(i -> new int[]{i, arr[i]})
                .sorted(Comparator.comparingInt(e -> e[1]))
                .toList();

        return res;
    }
    /*
     * Problem:
     * Find all even numbers.
     *
     * Return each result as:
     * [index, value]
     *
     * Sample Input:
     * arr = {10, 15, 20, 25, 30, 35}
     *
     * Expected Output:
     * [[0, 10], [2, 20], [4, 30]]
     */
    static List<int[]> findEvenElements(int[] arr) {


        var res = IntStream.range(0, arr.length)
                .filter(i -> arr[i] % 2 ==0)
                .mapToObj(i -> new int[]{i, arr[i]})
                .toList();

        return res;
    }


    /*
     * Problem:
     * Select elements at even indices.
     *
     * Map:
     * Key   -> index
     * Value -> arr[index] * 2
     *
     * Sample Input:
     * arr = {10, 20, 30, 40, 50}
     *
     * Expected Output:
     * {0=20, 2=60, 4=100}
     */
    static Map<Integer, Integer> mapEvenIndices(int[] arr) {

        var res = IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), i -> arr[i]*2));



        return res;
    }

    /*
     * Problem:
     * Find indices where the current element is greater
     * than the previous element.
     *
     * Convert the result into a Map:
     * Key   -> index
     * Value -> arr[index]
     *
     * Sample Input:
     * arr = {10, 15, 12, 20, 25, 18}
     *
     * Expected Output:
     * {1=15, 3=20, 4=25}
     */
    static Map<Integer, Integer> findIncreasingElements(int[] arr) {
//        IntStream.range(3, 6).forEach(System.out::println);


        return IntStream.range(1, arr.length)
//                .skip(1)
                .filter(i -> arr[i] > arr[i -1])
                .boxed()
                .collect(Collectors.toMap(Function.identity(), i -> arr[i]));
    }

    /*
     * Problem:
     * Find the indices of all even numbers in the array.
     *
     * Sample Input:
     * arr = {10, 15, 20, 25, 30, 35}
     *
     * Expected Output:
     * [0, 2, 4]
     */
    static List<Integer> findEvenNumberIndices(int[] arr) {
        
        // TODO: Implement using IntStream
        var res = IntStream.range(0, arr.length)
                .filter(i -> arr[i] % 2 ==0)
                .boxed().toList();

        
        return res;
    }
    /*
     * Problem:
     * Find the indices of elements whose value occurs
     * more than once in the array.
     *
     * Sample Input:
     * arr = {10, 20, 10, 30, 20, 40}
     *
     * Expected Output:
     * [0, 1, 2, 4]
     */
    static List<Integer> findDuplicateValueIndices(int[] arr) {

        // TODO: Implement using IntStream
        var f = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var res = IntStream.range(0, arr.length)
                .filter(i -> f.get(arr[i]) > 1)
                .boxed().toList();


        return res;
    }


}