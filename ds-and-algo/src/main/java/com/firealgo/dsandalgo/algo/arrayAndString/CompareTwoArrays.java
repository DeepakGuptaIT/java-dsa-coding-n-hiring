package com.firealgo.dsandalgo.algo.arrayAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompareTwoArrays {

    public static void main(String[] args) {

        int[] a = {7, 8, 5};
        int[] b = {7, 8, 5};

        // ✅ 1. Exact equality (order matters)
        System.out.println("Exact Equal: " + areArraysEqual(a, b));

        // ✅ 2. Same contents (order does NOT matter)
        int[] x = {1, 1, 3, 4, 5};
        int[] y = {5, 4, 3, 1, 1};

        System.out.println("Same contents: " + haveSameElements(x, y));
    }

    /**
     * Checks if two arrays are exactly equal (same order + same elements)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    /**
     * Checks if two arrays have same elements (order doesn't matter)
     * Uses frequency map to avoid modifying original arrays
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static boolean haveSameElements(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length)
            return false;

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of elements in array 'a'
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Decrease frequency using array 'b'
        for (int num : b) {
            if (!freqMap.containsKey(num)) {
                return false;
            }

            freqMap.put(num, freqMap.get(num) - 1);

            if (freqMap.get(num) == 0) {
                freqMap.remove(num);
            }
        }

        return freqMap.isEmpty();
    }

    /**
     * Alternative approach (Sorting)
     * NOTE: Creates copies to avoid modifying original arrays
     */
    public static boolean haveSameElementsSorting(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length)
            return false;

        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        Arrays.sort(copyA);
        Arrays.sort(copyB);

        return Arrays.equals(copyA, copyB);
    }
}