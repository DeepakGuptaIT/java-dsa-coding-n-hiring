# DSA Techniques - Two Pointer

This directory contains solutions using the **Two Pointer** technique, a fundamental algorithmic approach for solving array and string problems efficiently.

## Overview

The two pointer technique maintains two pointers at different positions and moves them based on problem conditions. This reduces nested loops and improves efficiency from O(n²) to O(n).

## Table of Contents

1. [ContainerWithMostWater](#containerwithmostwater)
2. [Two Pointer Pattern](#two-pointer-pattern)
3. [When to Use Two Pointers](#when-to-use-two-pointers)

---

## ContainerWithMostWater

**LeetCode Problem**: [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

### Problem Statement
Given an array of heights, find two lines that together with the x-axis form a container such that the container contains the most water.

### Solution Approaches
- **Optimal**: Two pointers starting from both ends, moving the shorter one inward
  - Time: O(n), Space: O(1)
- **Brute Force**: Check all pairs of lines
  - Time: O(n²), Space: O(1)

### File Location
- Solution: [ContainerWithMostWater.java](ContainerWithMostWater.java)
- Tests: [ContainerWithMostWaterTest.java](../../test/java/com/firealgo/dsa/ContainerWithMostWaterTest.java)

### Example
```java
int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
int maxArea = ContainerWithMostWater.maxArea(height);
// Result: 49 (using indices 1 and 8: min(8,7) * (8-1) = 7*7 = 49)
```

### Algorithm Breakdown

```
Why moving the shorter pointer works:
1. Area = min(height[left], height[right]) * (right - left)
2. If we move the taller pointer inward:
   - Distance decreases (bad)
   - Min height stays same or increases (maybe good, but unlikely to compensate)
3. If we move the shorter pointer inward:
   - Distance decreases (bad)
   - Min height might increase (good, could compensate)
4. We never miss the optimal solution this way
```

### Key Insights
- **Greedy approach works here** because moving shorter pointer gives us a chance to find taller lines
- **Correctness**: We only miss a solution if we skip over it, but we never skip potential better solutions
- **Why O(n)**: Each element visited at most once

### Visualization

```
Initial state:
[1, 8, 6, 2, 5, 4, 8, 3, 7]
 ^                        ^
left=0 (h=1)          right=8 (h=7)
Area = min(1, 7) * 8 = 8

Move left (smaller):
[1, 8, 6, 2, 5, 4, 8, 3, 7]
    ^                     ^
left=1 (h=8)         right=8 (h=7)
Area = min(8, 7) * 7 = 49

And so on...
```

---

## Two Pointer Pattern

### Generic Templates

#### Pattern 1: Approaching from Both Ends
```java
public Type twoPtrFromEnds(Type[] arr) {
    int left = 0, right = arr.length - 1;
    Type result = null;
    
    while (left < right) {
        if (/* condition */) {
            right--;
        } else {
            left++;
        }
        // Update result
    }
    return result;
}
```

#### Pattern 2: One Fast, One Slow
```java
public Type twoPtrFastSlow(Type[] arr) {
    int slow = 0, fast = 0;
    
    while (fast < arr.length) {
        if (/* condition */) {
            slow++;
        }
        fast++;
    }
    return result;
}
```

#### Pattern 3: Two Pointers in Same Direction
```java
public Type twoPtrSameDir(Type[] arr1, Type[] arr2) {
    int ptr1 = 0, ptr2 = 0;
    
    while (ptr1 < arr1.length && ptr2 < arr2.length) {
        if (arr1[ptr1] < arr2[ptr2]) {
            ptr1++;
        } else {
            ptr2++;
        }
    }
    return result;
}
```

---

## When to Use Two Pointers

### Indicators This Technique Works Well:
- ✅ Array/string problems
- ✅ Need to find pairs or subarrays
- ✅ Array is sorted (often, but not always)
- ✅ Need to compare elements at different positions
- ✅ Can reduce nested loop complexity

### Anti-Patterns (When NOT to use):
- ❌ Need all pairs (requires O(n²))
- ❌ Unsorted array without preprocessing
- ❌ Complex conditions that don't have monotonic property

### Common Problems Using Two Pointers

| Problem | Link | Pointers |
|---------|------|----------|
| Container With Most Water | [LeetCode 11](https://leetcode.com/problems/container-with-most-water/) | Both ends |
| Two Sum II (Sorted) | [LeetCode 167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Both ends |
| Merge Sorted Arrays | [LeetCode 88](https://leetcode.com/problems/merge-sorted-array/) | Both same |
| Valid Palindrome | [LeetCode 125](https://leetcode.com/problems/valid-palindrome/) | Both ends |
| Remove Duplicates | [LeetCode 26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Fast/Slow |
| Reverse String | [LeetCode 344](https://leetcode.com/problems/reverse-string/) | Both ends |

---

## Running Tests

Run all two pointer tests:
```bash
mvn test -Dtest=*TwoPointerTest
```

Run specific test:
```bash
mvn test -Dtest=ContainerWithMostWaterTest
```

---

## Time & Space Complexity Comparison

### This Problem vs Brute Force

| Approach | Time | Space | Notes |
|----------|------|-------|-------|
| **Brute Force** | O(n²) | O(1) | Check all pairs |
| **Two Pointer** | **O(n)** | **O(1)** | Optimal solution |

---

## Proof of Correctness

**Theorem**: The two-pointer approach finds the maximum area.

**Proof sketch**:
1. Suppose optimal solution is at indices `i` and `j` where `i < j`
2. Our algorithm starts at 0 and n-1
3. If 0 < i and n-1 > j:
   - We'll eventually reach (i, j) or find better solution
4. If the algorithm skips over (i, j):
   - Must have moved from position with taller height
   - Area at (i, j) < area at skipped position (by greedy property)
   - So (i, j) wasn't optimal anyway

---

## Practice Tips

1. **Draw out the example**
   - Visualize pointer movements
   - Understand why algorithm works

2. **Identify pointer movement strategy**
   - Which pointer should move?
   - When should it move?

3. **Test edge cases**
   - Empty arrays
   - Single element
   - All same values
   - Boundary conditions

4. **Compare with brute force**
   - Understand the optimization
   - See why O(n) works instead of O(n²)

5. **Solve related problems**
   - Apply same pattern to different problems
   - Build intuition

---

## Advanced Variants

### Sliding Window vs Two Pointer
- **Sliding Window**: Variables window size as needed
- **Two Pointer**: Fixed start/end movement pattern

### Multi-Pointer
Some problems need 3 or more pointers:
- 3Sum: Sort array, then two-pointer for target difference
- Merge K sorted arrays: Pointer for each array

---

## Related Techniques

- [Sliding Window](../slidingwindow/)
- [Binary Search](../algorithms/)
- [Array Problems](../../fundamentals/array/)

---

## Difficulty Level
🟡 **Medium**

## Topics
- Two Pointer Technique
- Array Problems
- Greedy Algorithms
- Optimization
