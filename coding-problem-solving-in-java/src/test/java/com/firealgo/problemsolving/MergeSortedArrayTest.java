package com.firealgo.problemsolving.fundamentals.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for MergeSortedArray solution.
 * 
 * @author DSA Practice
 * @version 1.0
 */
@DisplayName("Merge Sorted Array Tests")
class MergeSortedArrayTest {

    @Test
    @DisplayName("Should merge two sorted arrays correctly")
    void testMergeBasicCase() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
    }

    @Test
    @DisplayName("Should handle empty nums2")
    void testMergeEmptyNums2() {
        int[] nums1 = { 1 };
        int[] nums2 = {};
        MergeSortedArray.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[] { 1 }, nums1);
    }

    @Test
    @DisplayName("Should handle empty nums1")
    void testMergeEmptyNums1() {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        MergeSortedArray.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[] { 1 }, nums1);
    }

    @Test
    @DisplayName("Should merge when all nums1 elements are greater")
    void testMergeAllNums1Greater() {
        int[] nums1 = { 5, 6, 7, 0, 0, 0 };
        int[] nums2 = { 1, 2, 3 };
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 3, 5, 6, 7 }, nums1);
    }

    @Test
    @DisplayName("Should merge when all nums2 elements are greater")
    void testMergeAllNums2Greater() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 5, 6, 7 };
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 3, 5, 6, 7 }, nums1);
    }

    @Test
    @DisplayName("Should handle negative numbers")
    void testMergeWithNegatives() {
        int[] nums1 = { -5, -1, 0, 0, 0 };
        int[] nums2 = { -3, -2, 2 };
        MergeSortedArray.merge(nums1, 2, nums2, 3);
        assertArrayEquals(new int[] { -5, -3, -2, -1, 2 }, nums1);
    }

    @Test
    @DisplayName("Should merge with extra space approach")
    void testMergeWithExtraSpace() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 5, 6 };
        int[] result = MergeSortedArray.mergeWithExtraSpace(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, result);
    }

    @ParameterizedTest
    @DisplayName("Parameterized test for various inputs")
    @CsvSource({
            "'1,2,3,0,0,0', 3, '2,5,6', 3, '1,2,2,3,5,6'",
            "'1', 1, '1', 1, '1,1'",
            "'0', 0, '1', 1, '1'"
    })
    void testMergeParameterized(String nums1Str, int m, String nums2Str, int n, String expectedStr) {
        // Parse inputs
        int[] nums1 = parseArray(nums1Str);
        int[] nums2 = parseArray(nums2Str);
        int[] expected = parseArray(expectedStr);

        MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    /**
     * Helper method to parse CSV array representation.
     */
    private int[] parseArray(String str) {
        String[] parts = str.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }
}
