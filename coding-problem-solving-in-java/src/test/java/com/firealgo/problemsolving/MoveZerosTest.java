package com.firealgo.problemsolving.fundamentals.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for MoveZeros solution.
 * 
 * @author DSA Practice
 * @version 1.0
 */
@DisplayName("Move Zeros Tests")
class MoveZerosTest {

    @Test
    @DisplayName("Should move zeros to end maintaining order")
    void testMoveZeroesBasic() {
        int[] nums = { 0, 1, 0, 3, 12 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
    }

    @Test
    @DisplayName("Should handle array with no zeros")
    void testMoveZeroesNoZeros() {
        int[] nums = { 1, 2, 3 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    @DisplayName("Should handle array with all zeros")
    void testMoveZeroesAllZeros() {
        int[] nums = { 0, 0, 0 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 0, 0, 0 }, nums);
    }

    @Test
    @DisplayName("Should handle single element array")
    void testMoveZeroesSingleElement() {
        int[] nums = { 0 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 0 }, nums);

        nums = new int[] { 1 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1 }, nums);
    }

    @Test
    @DisplayName("Should handle zeros at different positions")
    void testMoveZeroesVariousPositions() {
        int[] nums = { 0, 0, 1 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 0, 0 }, nums);

        nums = new int[] { 1, 0, 0 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 0, 0 }, nums);
    }

    @Test
    @DisplayName("Should work with negative numbers")
    void testMoveZeroesNegative() {
        int[] nums = { 0, -1, 0, -2, 0 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { -1, -2, 0, 0, 0 }, nums);
    }

    @Test
    @DisplayName("Should use optimized approach correctly")
    void testMoveZeroesOptimized() {
        int[] nums = { 0, 1, 0, 3, 12 };
        MoveZeros.moveZeroesOptimized(nums);
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
    }

    @Test
    @DisplayName("Optimized: no zeros")
    void testMoveZeroesOptimizedNoZeros() {
        int[] nums = { 1, 2, 3 };
        MoveZeros.moveZeroesOptimized(nums);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    @DisplayName("Should maintain relative order of non-zero elements")
    void testMoveZeroesOrder() {
        int[] nums = { 1, 0, 2, 0, 3, 0, 4 };
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 0, 0, 0 }, nums);
    }
}
