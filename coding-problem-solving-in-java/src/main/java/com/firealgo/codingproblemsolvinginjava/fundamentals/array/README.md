# DSA Fundamentals - Array Problems

This directory contains solutions to fundamental Array-based Data Structure and Algorithm problems.

## Table of Contents

1. [MergeSortedArray](#mergesortedarray)
2. [MoveZeros](#movezeros)
3. [Array Patterns](#patterns)

---

## MergeSortedArray

**LeetCode Problem**: [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### Problem Statement
Merge two sorted integer arrays `nums1` and `nums2` into a single sorted array in-place.

### Solution Approaches
- **Optimal (Two Pointer)**: Start from the end and merge backwards
  - Time: O(m + n), Space: O(1)
- **Alternative**: Use extra space for easier implementation
  - Time: O(m + n), Space: O(m + n)

### File Location
- Solution: [MergeSortedArray.java](MergeSortedArray.java)
- Tests: [MergeSortedArrayTest.java](../../test/java/com/firealgo/dsa/MergeSortedArrayTest.java)

### Example
```java
int[] nums1 = {1,2,3,0,0,0};
MergeSortedArray.merge(nums1, 3, new int[]{2,5,6}, 3);
// Result: [1,2,2,3,5,6]
```

### Key Insights
- Working backwards avoids overwriting unseen elements
- No need for extra space with this approach
- Good example of two-pointer technique

---

## MoveZeros

**Problem**: Move all zeros to the end while maintaining relative order of non-zero elements.

### Solution Approaches
- **Optimal**: Two passes - collect non-zeros, then fill with zeros
  - Time: O(n), Space: O(1)
- **Swap-based**: Minimize writes by only swapping when needed
  - Time: O(n), Space: O(1)

### File Location
- Solution: [MoveZeros.java](MoveZeros.java)
- Tests: [MoveZerosTest.java](../../test/java/com/firealgo/dsa/MoveZerosTest.java)

### Example
```java
int[] nums = {0, 1, 0, 3, 12};
MoveZeros.moveZeroes(nums);
// Result: [1, 3, 12, 0, 0]
```

### Key Insights
- Can be solved without explicitly tracking zero positions
- Maintains relative order automatically
- Good practice for in-place array manipulation

---

## Patterns Covered

### Two Pointer Technique
- [MergeSortedArray](#mergesortedarray)

### Array Traversal & Modification
- [MoveZeros](#movezeros)

### In-Place Operations
All solutions in this section use O(1) space complexity

---

## Common Patterns in Array Problems

| Pattern | Problems | Time | Space |
|---------|----------|------|-------|
| Two Pointer | Merge, Move Zeros | O(n) | O(1) |
| Prefix/Suffix | Product, Remove | O(n) | O(1) |
| Sliding Window | Subarrays, Windows | O(n) | O(k) |

---

## Running Tests

Run all array tests:
```bash
mvn test -Dtest=*ArrayTest
```

Run specific test:
```bash
mvn test -Dtest=MergeSortedArrayTest
```

---

## Practice Tips

1. **Understand the constraints**
   - Is in-place required?
   - What is the memory limit?
   
2. **Start with brute force**
   - Get a working solution first
   - Then optimize
   
3. **Think about edge cases**
   - Empty arrays
   - Single elements
   - All same elements

4. **Practice other similar problems**
   - Merge k Sorted Arrays
   - Remove Duplicates
   - Product of Array Except Self

---

## Related Topics

- [Two Pointer Techniques](../../techniques/twopointer/)
- [String Fundamentals](../string/)
- [Array Interview Questions](../../interview/)

---

## Difficulty Level
🟢 **Easy to Medium**

## Topics
- Array Manipulation
- In-place Algorithms
- Two Pointer Technique
