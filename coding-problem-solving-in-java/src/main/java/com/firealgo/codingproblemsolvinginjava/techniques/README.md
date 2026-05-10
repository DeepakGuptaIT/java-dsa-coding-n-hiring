# DSA Techniques

Welcome to the Techniques section! Here you'll learn fundamental algorithmic patterns that apply to many problems.

## Overview

Techniques are powerful problem-solving strategies that work across multiple domains. Learning these patterns will significantly improve your problem-solving ability.

## Structure

```
techniques/
├── slidingwindow/           # Sliding window pattern
├── twopointer/             # Two pointer pattern
├── dynamicprogramming/      # DP problems
└── backtracking/            # Backtracking problems
```

## Techniques Explained

### 1. Two Pointer ⭐ START HERE
**Use When**: Working with sorted arrays, finding pairs, comparing elements
**Difficulty**: 🟡 Medium
**Time to Learn**: 2-3 days

**When It Works**:
- ✅ Sorted array problems
- ✅ Finding pairs/triplets
- ✅ Comparing opposite ends
- ✅ Fast/slow scenarios

**Key Patterns**:
- Both ends approaching
- Fast and slow pointers
- One pointer for each array

**Common Problems**:
- Container With Most Water
- Two Sum II (Sorted Array)
- Valid Palindrome
- Merge Sorted Arrays

[→ Browse Two Pointer Problems](twopointer/)

### 2. Sliding Window
**Use When**: Finding subarrays, substrings with specific properties
**Difficulty**: 🟡 Medium
**Time to Learn**: 3-4 days

**When It Works**:
- ✅ Contiguous subarrays/substrings
- ✅ "Longest/shortest/max/min" problems
- ✅ Substring conditions
- ✅ Window size varies

**Key Patterns**:
- Expand and contract window
- HashMap for character tracking
- Two pointers for window bounds

**Common Problems**:
- Longest Substring Without Repeating
- Minimum Window Substring
- Longest Repeating Character Replacement
- Fruits Into Baskets

[→ Browse Sliding Window Problems](slidingwindow/)

### 3. Dynamic Programming
**Use When**: Problems have optimal substructure and overlapping subproblems
**Difficulty**: 🔴 Hard
**Time to Learn**: 2-3 weeks

**Characteristics**:
- Optimal substructure
- Overlapping subproblems
- Can be solved top-down (memoization) or bottom-up

**Common Problems**:
- Fibonacci
- Coin Change
- House Robber
- Longest Increasing Subsequence

[→ Browse DP Problems](dynamicprogramming/)

### 4. Backtracking
**Use When**: Finding all solutions, exploring possibilities
**Difficulty**: 🔴 Hard
**Time to Learn**: 2 weeks

**Pattern**:
1. Choose
2. Explore
3. Unchoose

**Common Problems**:
- Permutations/Combinations
- Sudoku Solver
- N-Queens
- Word Search

[→ Browse Backtracking Problems](backtracking/)

## Learning Path

### Week 1: Two Pointer & Basics
- [ ] Understand two pointer concept
- [ ] Solve 5 two pointer problems
- [ ] Practice complexity analysis

### Week 2: Sliding Window
- [ ] Learn sliding window pattern
- [ ] Solve 5 sliding window problems
- [ ] Compare with nested loop approach

### Week 3-4: Dynamic Programming
- [ ] Learn DP concepts (memoization, tabulation)
- [ ] Start with simple DP (Fibonacci)
- [ ] Solve medium DP problems

### Week 5+: Backtracking & Combinations
- [ ] Learn backtracking pattern
- [ ] Practice permutation/combination
- [ ] Complex problems

## Technique Comparison Table

| Technique | Time | Space | Use Case |
|-----------|------|-------|----------|
| Two Pointer | O(n) | O(1) | Sorted arrays |
| Sliding Window | O(n) | O(k) | Substrings/subarrays |
| DP | Varies | O(n) | Optimal solutions |
| Backtracking | Varies | O(h) | All solutions |

## Key Insights

### Two Pointer Insight
"Moving the smaller pointer might find something better, while moving the larger pointer definitely won't help."

### Sliding Window Insight
"Instead of rechecking everything, only update what changed at the boundaries."

### DP Insight
"If you've solved a subproblem before, reuse the answer instead of solving again."

### Backtracking Insight
"Explore all paths, undo changes, and try different options."

## Problem Templates

### Two Pointer Template
```java
public int twoPointer(int[] arr) {
    int left = 0, right = arr.length - 1;
    
    while (left < right) {
        // Process
        if (condition) {
            right--;
        } else {
            left++;
        }
    }
    return result;
}
```

### Sliding Window Template
```java
public int slidingWindow(String s) {
    Map<Character, Integer> window = new HashMap<>();
    int left = 0, right = 0, result = 0;
    
    while (right < s.length()) {
        // Expand
        window.put(s.charAt(right), 
                   window.getOrDefault(s.charAt(right), 0) + 1);
        right++;
        
        // Contract if needed
        while (/* condition */) {
            window.put(s.charAt(left), 
                       window.get(s.charAt(left)) - 1);
            left++;
        }
        
        result = Math.max(result, right - left);
    }
    return result;
}
```

## Practice Strategy

### Level 1: Understand
- Read the technique explanation
- Understand why it works
- Study the code

### Level 2: Recognize
- Identify when technique applies
- See pattern in new problems
- Know templates by heart

### Level 3: Apply
- Solve problems using the technique
- Optimize solutions
- Combine techniques

### Level 4: Master
- Solve hard problems
- Teach others
- Come up with variations

## Common Mistakes

### Two Pointer
❌ Not checking boundaries
❌ Moving wrong pointer
❌ Assuming always sorted

### Sliding Window
❌ Not maintaining window validity
❌ Wrong contraction condition
❌ Off-by-one errors

### DP
❌ Wrong base cases
❌ Incorrect state transitions
❌ Not recognizing overlapping subproblems

### Backtracking
❌ Forgetting to undo changes
❌ Wrong termination condition
❌ Not pruning search space

## Quiz Yourself

1. When would you use two pointer over brute force?
2. What's the key difference between sliding window and two pointer?
3. How do you know if a problem can be solved with DP?
4. What's the structure of a backtracking solution?

## Related Topics

- [Fundamentals](../fundamentals/) - Basic data structures
- [Intermediate](../intermediate/) - Complex data structures
- [Interview](../interview/) - Interview problems

## Resources

- [LeetCode Explore](https://leetcode.com/explore/)
- [GeeksforGeeks Algorithms](https://www.geeksforgeeks.org/algorithms/)
- YouTube channels: Back to Back SWE, Code_Report

---

**Start with Two Pointer, then Sliding Window, then move to advanced techniques!**

[← Back to Main README](../DSA_PROJECT_README.md)
