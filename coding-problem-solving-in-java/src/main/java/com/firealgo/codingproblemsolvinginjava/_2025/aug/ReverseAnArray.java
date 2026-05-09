package com.firealgo.codingproblemsolvinginjava._2025.aug;

import java.util.Arrays;

/**
 * <a href="https://www.geeksforgeeks.org/program-to-reverse-an-array/">...</a>
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Using inbuilt method in Java
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i]
                    = originalArray[originalArray.length - 1
                    - i];
        }

        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}
