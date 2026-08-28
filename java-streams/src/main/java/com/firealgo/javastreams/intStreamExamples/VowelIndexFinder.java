package com.firealgo.javastreams.intStreamExamples;

import java.util.List;
import java.util.stream.IntStream;

public class VowelIndexFinder {
    public static void main(String[] args) {
        String str = "progrAmming";

        List<Integer> result = findVowelIndices(str);

        System.out.println(result);
    }
    /*
     * Question:
     * Given a String, find the indices of all vowels using
     * Java Stream API only.
     *
     * Input:
     * "programming"
     *
     * Output:
     * [2, 5, 8]
     *
     * Constraint:
     * Do not use traditional loops such as for or while.
     */
    public static List<Integer> findVowelIndices(String str) {

        // Write your Stream API solution here
        var res = IntStream.range(0, str.length())
                .filter(i -> "aeiou".indexOf(str.toLowerCase().charAt(i))!=-1)
                .map(i -> i+1)
                .boxed().toList();
        return res;
    }
}
