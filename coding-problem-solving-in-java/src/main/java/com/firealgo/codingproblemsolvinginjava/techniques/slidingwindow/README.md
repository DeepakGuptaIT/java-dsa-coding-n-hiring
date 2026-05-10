# DSA Techniques - Sliding Window

This directory contains solutions using the **Sliding Window** technique, one of the most important algorithmic patterns.

## Overview

The sliding window technique is useful for solving problems that involve finding subsets of arrays or strings that satisfy certain conditions. Instead of checking every possible window (which would be O(n²)), we maintain a "window" that expands and contracts as needed.

## Table of Contents

1. [LongestSubstringWithoutRepeating](#longestsubstringwithoutrepeating)
2. [Sliding Window Pattern](#sliding-window-pattern)
3. [When to Use Sliding Window](#when-to-use-sliding-window)

---

## LongestSubstringWithoutRepeating

**LeetCode Problem**: [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

### Problem Statement
Given a string, find the length of the longest substring without repeating characters.

### Solution Approaches
- **Optimal**: Sliding window with HashMap (track character positions)
  - Time: O(n), Space: O(min(m, n)) where m is alphabet size
- **Alternative**: Sliding window with HashSet
  - Time: O(n), Space: O(min(m, n))

### File Location
- Solution: [LongestSubstringWithoutRepeating.java](LongestSubstringWithoutRepeating.java)
- Tests: [LongestSubstringWithoutRepeatingTest.java](../../test/java/com/firealgo/dsa/LongestSubstringWithoutRepeatingTest.java)

### Example
```java
String s = "abcabcbb";
int length = LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s);
// Result: 3 (substring "abc")

String s2 = "pwwkew";
int length2 = LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s2);
// Result: 3 (substring "wke")
```

### Algorithm Breakdown

```
1. Maintain two pointers: left and right
2. Maintain a HashMap of character -> last seen index
3. Expand window by moving right pointer
4. If character already in current window:
   - Move left pointer to skip the duplicate
5. Update maximum length seen
```

### Key Insights
- **Why this works**: HashMap stores position of last occurrence
- **Why fast**: Each character is visited at most twice
- **Space optimization**: Only storing alphabet size, not string length

---

## Sliding Window Pattern

### Generic Template

```java
public int slidingWindowProblem(String s) {
    Map<Character, Integer> window = new HashMap<>();
    int left = 0, right = 0;
    int result = 0;
    
    while (right < s.length()) {
        // Expand window
        char rightChar = s.charAt(right);
        window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
        right++;
        
        // Shrink window if needed
        while (/* condition for shrinking */) {
            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar) - 1);
            if (window.get(leftChar) == 0) {
                window.remove(leftChar);
            }
            left++;
        }
        
        // Update result
        result = Math.max(result, right - left);
    }
    
    return result;
}
```

---

## When to Use Sliding Window

### Indicators This Technique Works Well:
- ✅ Problem involves subarrays/substrings
- ✅ Problem asks for "longest", "shortest", "most", "least"
- ✅ Problem involves contiguous elements
- ✅ Simple conditions that can be validated incrementally

### Common Problems Using Sliding Window

| Problem | Link | Type |
|---------|------|------|
| Longest Substring Without Repeating | [LeetCode 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | String |
| Minimum Window Substring | [LeetCode 76](https://leetcode.com/problems/minimum-window-substring/) | String |
| Max Sum Subarray of Size K | Custom | Array |
| Fruits Into Baskets | [LeetCode 904](https://leetcode.com/problems/fruit-into-baskets/) | Array |
| Longest Repeating Character Replacement | [LeetCode 424](https://leetcode.com/problems/longest-repeating-character-replacement/) | String |
| Permutation in String | [LeetCode 567](https://leetcode.com/problems/permutation-in-string/) | String |

---

## Running Tests

Run all sliding window tests:
```bash
mvn test -Dtest=*SlidingWindowTest
```

Run specific test:
```bash
mvn test -Dtest=LongestSubstringWithoutRepeatingTest
```

---

## Time & Space Complexity Comparison

### This Problem vs Brute Force

| Approach | Time | Space | Notes |
|----------|------|-------|-------|
| Brute Force | O(n³) | O(k) | Check all substrings |
| HashSet | O(n²) | O(k) | Better, but still nested |
| **Sliding Window** | **O(n)** | **O(k)** | Optimal solution |

---

## Practice Tips

1. **Understand the pattern first**
   - Identify what the "window" represents
   - What expands/contracts the window?

2. **Start with HashSet approach**
   - Easier to understand
   - Then optimize to HashMap if needed

3. **Test edge cases**
   - Empty strings
   - Single characters
   - Repeated characters
   - All unique characters

4. **Optimize incrementally**
   - Get correct solution first
   - Then optimize space/time

5. **Solve related problems**
   - Build intuition with multiple problems
   - Recognize patterns across problems

---

## Advanced Variants

### Dynamic Sliding Window
For problems where window size changes based on conditions.

### Fixed-Size Sliding Window
For problems with a fixed window requirement.

### Multiple Pointers
When you need to track multiple windows or conditions.

---

## Related Techniques

- [Two Pointer](../twopointer/)
- [Prefix Sum](../algorithms/)
- [HashMap Operations](../../intermediate/hashmap/)

---

## Difficulty Level
🟡 **Medium**

## Topics
- Sliding Window Technique
- String Problems
- Optimization
- Hash-based Algorithms
