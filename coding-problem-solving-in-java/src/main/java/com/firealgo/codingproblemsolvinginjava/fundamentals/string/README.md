# DSA Fundamentals - String Problems

This directory contains solutions to fundamental String-based Data Structure and Algorithm problems.

## Table of Contents

1. [CountVowels](#countvowels)
2. [String Patterns](#patterns)
3. [Common Problems](#common-problems)

---

## CountVowels

**Problem**: Count the number of vowels (a, e, i, o, u) in a string (case-insensitive).

### Solution Approaches
- **Basic Loop**: Iterate through characters and count vowels
  - Time: O(n), Space: O(1)
- **Stream Approach**: Use Java Streams for functional programming style
  - Time: O(n), Space: O(1)
- **Regex Approach**: Pattern matching for vowels
  - Time: O(n), Space: O(1)

### File Location
- Solution: [CountVowels.java](CountVowels.java)
- Tests: [CountVowelsTest.java](../../test/java/com/firealgo/dsa/CountVowelsTest.java)

### Example
```java
String str = "Aaaabc";
int count = CountVowels.countVowels(str);
// Result: 4 (A, a, a, a)
```

### Key Insights
- Case-insensitive comparison important
- Multiple approaches available (imperative, functional, regex)
- Good for learning different Java patterns

---

## Patterns Covered

### Character Checking
- Validating vowels in strings
- Case-insensitive comparisons

### Iteration & Counting
- Character-by-character traversal
- Maintaining counters

### Stream Operations
- Functional programming in Java
- Filter and count operations

---

## Common String Patterns

| Pattern | Complexity | Use Case |
|---------|-----------|----------|
| Character Count | O(n) | Frequency analysis |
| Two Pointer | O(n) | Palindrome, reverse |
| HashMap | O(n) | Anagrams, duplicates |
| Sliding Window | O(n) | Substrings, patterns |

---

## Running Tests

Run all string tests:
```bash
mvn test -Dtest=*StringTest
```

Run specific test:
```bash
mvn test -Dtest=CountVowelsTest
```

---

## Practice Tips

1. **Understand the problem precisely**
   - What counts as a vowel? (sometimes Y is included)
   - Case sensitivity?
   - Special characters?

2. **Know multiple approaches**
   - Imperative (loops)
   - Functional (streams)
   - Regex (pattern matching)

3. **Test edge cases**
   - Empty strings
   - Null values
   - Special characters
   - Numbers mixed with letters

4. **Performance considerations**
   - For large strings, which approach is fastest?
   - Space vs time tradeoff

---

## Related Problems

- Reverse String
- Valid Palindrome
- Longest Substring Without Repeating Characters
- Check If Vowel Is Present in String

---

## Difficulty Level
🟢 **Easy**

## Topics
- String Manipulation
- Character Validation
- Iteration & Counting
- Java Streams
