# DSA Fundamentals

Welcome to the Fundamentals section! This is where you'll learn the basic building blocks of Data Structures and Algorithms.

## Overview

Fundamentals are the foundation of computer science. Master these first before moving to advanced topics.

## Structure

```
fundamentals/
├── array/           # Array manipulation and algorithms
├── string/          # String processing and algorithms
├── linkedlist/      # Linked list operations
└── tree/            # Binary tree and tree algorithms
```

## What You'll Learn

### 1. Arrays ⭐ START HERE
**Concepts**: Basic operations, sorting, searching, two-pointer technique
**Difficulty**: 🟢 Easy to 🟡 Medium
**Time to Complete**: 1-2 weeks

Key problems:
- Merge Sorted Array
- Move Zeros
- Reverse Array
- Remove Duplicates
- Find Peak Element

[→ Browse Array Problems](array/)

### 2. Strings
**Concepts**: Manipulation, searching, pattern matching, character operations
**Difficulty**: 🟢 Easy to 🟡 Medium
**Time to Complete**: 1 week

Key problems:
- Count Vowels
- Reverse String
- Palindrome Check
- Anagram Check
- String Rotation

[→ Browse String Problems](string/)

### 3. Linked Lists
**Concepts**: Node operations, traversal, reversal, cycle detection
**Difficulty**: 🟡 Medium
**Time to Complete**: 1-2 weeks

Key problems:
- Reverse Linked List
- Detect Cycle
- Merge Sorted Lists
- Find Middle
- Remove Nth Node

[→ Browse LinkedList Problems](linkedlist/)

### 4. Binary Trees
**Concepts**: Traversal (DFS, BFS), height, diameter, LCA
**Difficulty**: 🟡 Medium
**Time to Complete**: 2 weeks

Key problems:
- Max Depth
- Level Order Traversal
- Invert Tree
- Path Sum
- Lowest Common Ancestor

[→ Browse Tree Problems](tree/)

## Learning Tips

### 1. Start with Arrays
- ✅ Most fundamental data structure
- ✅ Easiest to understand
- ✅ Many techniques apply to other topics

### 2. Master Problem Solving Approach
1. **Understand** the problem
2. **Identify** the data structure
3. **Choose** the algorithm
4. **Implement** the solution
5. **Test** with examples
6. **Optimize** if needed

### 3. Practice Complexity Analysis
- Always think about Time and Space complexity
- Practice with Big-O notation
- Understand why optimization matters

### 4. Code Patterns to Learn
```java
// Two Pointer
int left = 0, right = arr.length - 1;
while (left < right) { ... }

// Fast and Slow
int slow = 0, fast = 0;
while (fast < arr.length) { ... }

// Sliding Window
int left = 0;
for (int right = 0; right < arr.length; right++) { ... }
```

## Common Time Complexities

| Operation | Array | LinkedList | Note |
|-----------|-------|-----------|------|
| Access | O(1) | O(n) | Array is faster |
| Search | O(n) | O(n) | Same |
| Insert | O(n) | O(1) | If position known |
| Delete | O(n) | O(1) | If position known |
| Sort | O(n log n) | O(n log n) | Same |

## Problem Difficulty Progression

### Week 1 (Easy)
- [ ] Merge Sorted Array
- [ ] Move Zeros
- [ ] Count Vowels
- [ ] Reverse String
- [ ] Find Maximum

### Week 2-3 (Medium)
- [ ] Longest Substring Without Repeating
- [ ] Container With Most Water
- [ ] Remove Duplicates
- [ ] Longest Common Prefix
- [ ] Valid Palindrome

### Week 4+ (Hard)
- [ ] Trapping Rain Water
- [ ] Median of Two Sorted Arrays
- [ ] Regular Expression Matching
- [ ] Wildcard Matching

## Next Steps

After mastering fundamentals:
1. Move to [Techniques](../techniques/) for algorithmic patterns
2. Learn [Data Structures](../intermediate/) like graphs and heaps
3. Practice [Advanced Problems](../advanced/)

## Resources for Fundamentals

### Internal
- Problem READMEs with explanations
- Test cases in each solution
- Multiple approaches for each problem

### External
- [GeeksforGeeks Fundamentals](https://www.geeksforgeeks.org/fundamentals-of-algorithms/)
- [LeetCode Explore - Arrays 101](https://leetcode.com/explore/learn/card/array-and-string/)
- [Khan Academy - Algorithms](https://www.khanacademy.org/computing/computer-science/algorithms/)

## FAQ

**Q: How long to master fundamentals?**
A: 3-4 weeks with consistent practice (2-3 hours daily)

**Q: Should I memorize solutions?**
A: No! Understand the approach and try solving independently

**Q: What if I get stuck?**
A: Look at hints first, then approach, then solution

**Q: Which data structure should I focus on?**
A: Start with Arrays, then Strings, then LinkedLists

---

Happy Learning! 🎓

[← Back to Main README](../DSA_PROJECT_README.md)
