# Code Organization & Standards Guide

This guide outlines the standards for organizing and writing code in this DSA project.

## File Structure Standards

### Directory Naming
- All lowercase with no spaces
- Use hyphens for multi-word names (not underscores)
- Match the data structure or technique name

Examples:
```
✅ slidingwindow/       (technique)
✅ linkedlist/          (data structure)
✅ dynamicprogramming/  (technique)
❌ SlidingWindow/       (wrong case)
❌ sliding_window/      (wrong separator)
```

### Class Naming
- PascalCase
- Descriptive name indicating problem/solution
- Include problem number if from online judge

Examples:
```java
✅ MergeSortedArray.java
✅ ContainerWithMostWater.java
✅ LongestSubstringWithoutRepeating.java
❌ Solution.java
❌ merge_sorted.java
```

### Test Class Naming
- Same as solution class with "Test" suffix
- Located in corresponding test directory

Examples:
```
✅ MergeSortedArrayTest.java
✅ ContainerWithMostWaterTest.java
❌ MergeSortedArrayTests.java
❌ Test_MergeSortedArray.java
```
## Folder Structure
com.deepak.dsa/
│
├── arrays/
│   ├── problems/       ← ALL solved Array problems
│   ├── top/            ← ⭐ Selected important problems
│   ├── leetcode150/    ← 📚 LeetCode 150
│   └── practice/       ← 🔄 Currently practicing
│
├── strings/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── hashmap/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── linkedlist/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── stack/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── queue/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── slidingwindow/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── twopointers/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── binarysearch/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── trees/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── heap/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── graph/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── recursion/
│   ├── problems/
│   ├── top/
│   └── practice/
│
├── backtracking/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── greedy/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
├── dynamicprogramming/
│   ├── problems/
│   ├── top/
│   ├── leetcode150/
│   └── practice/
│
└── patterns/
├── fastslowpointer/
├── prefixsum/
├── monotonicstack/
├── intervals/
├── bfs/
└── dfs/
## Code Documentation Standards

### Class Documentation Template
```java
/**
 * <h2>Problem Title - Platform Number</h2>
 * 
 * <p>
 * <strong>Problem:</strong> Clear problem statement explaining what needs to be done.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: [description of input]<br>
 * Output: [description of output]
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Brief description of algorithm used.<br>
 * Time Complexity: O(n)<br>
 * Space Complexity: O(1)
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class ProblemName {
    // implementation
}
```

### Method Documentation Template
```java
/**
 * Short description of what the method does.
 * 
 * <p>If needed, longer explanation of the algorithm or approach.</p>
 * 
 * @param paramName description of parameter
 * @return description of return value
 * @throws ExceptionType when/why exception is thrown
 */
public ReturnType methodName(ParamType paramName) {
    // implementation
}
```

### Code Comments
- Use sparingly - code should be self-documenting
- Explain WHY, not WHAT
- Use single-line comments for clarity

```java
✅ Good Comments:
// We move the pointer pointing to the smaller height
// because moving the taller pointer can't improve the area
if (height[left] < height[right]) {
    left++;
} else {
    right--;
}

❌ Bad Comments:
// Move left pointer
left++;

// Check if left < right
if (left < right) {
    // do something
}
```

## Code Style Standards

### Naming Conventions
```java
// Constants
public static final int MAX_SIZE = 100;

// Variables
int currentIndex;
String inputString;

// Methods (camelCase)
public void calculateSum() { }
private int findMaximum() { }

// Parameters
public void merge(int[] nums1, int m, int[] nums2, int n) { }
```

### Formatting
- Use 4-space indentation (not tabs)
- Maximum line length: 100 characters
- One statement per line
- Consistent bracket style (opening bracket on same line)

```java
✅ Good:
public static void merge(int[] nums1, int m, 
                         int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }
}

❌ Bad:
public static void merge(int[] n1,int m,int[] n2,int n){
int i=m-1;int j=n-1;int k=m+n-1;
while(i>=0&&j>=0){if(n1[i]>n2[j]){n1[k]=n1[i];i--;}else{n1[k]=n2[j];j--;}k--;}}
```

## Solution Structure

### Organize Multiple Approaches
```java
public class ProblemName {
    
    /**
     * Optimal solution approach.
     */
    public static ReturnType solve_Optimal(InputType input) {
        // Implementation
    }
    
    /**
     * Alternative approach with different time/space tradeoff.
     */
    public static ReturnType solve_Alternative(InputType input) {
        // Implementation
    }
    
    /**
     * Brute force approach for comparison.
     */
    public static ReturnType solve_BruteForce(InputType input) {
        // Implementation
    }
    
    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        // Test cases
    }
}
```

### Main Method Template
```java
public static void main(String[] args) {
    // Test case 1: Basic case
    int[] test1 = {1, 2, 3};
    System.out.println("Test 1 - Basic: " + solve(test1)); // Expected: result
    
    // Test case 2: Edge case
    int[] test2 = {};
    System.out.println("Test 2 - Empty: " + solve(test2)); // Expected: result
    
    // Test case 3: Special case
    int[] test3 = {0, 0, 0};
    System.out.println("Test 3 - All zeros: " + solve(test3)); // Expected: result
}
```

## Test Class Standards

### Test Method Naming
- Use `@DisplayName` for clear descriptions
- Method name can be abbreviated

```java
@Test
@DisplayName("Should merge two sorted arrays correctly")
void testMergeBasicCase() {
    // Test implementation
}

@Test
@DisplayName("Should handle empty input")
void testMergeEmptyInput() {
    // Test implementation
}
```

### Test Structure (AAA Pattern)
```java
@Test
@DisplayName("Descriptive test name")
void testSomething() {
    // Arrange - Set up test data
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] expected = {1, 2, 2, 3, 5, 6};
    
    // Act - Execute the code
    MergeSortedArray.merge(nums1, 3, new int[]{2, 5, 6}, 3);
    
    // Assert - Verify the results
    assertArrayEquals(expected, nums1);
}
```

### Test Case Coverage
Ensure you test:
- ✅ Normal cases
- ✅ Edge cases (empty, single element)
- ✅ Boundary conditions
- ✅ Special values (zeros, negatives)
- ✅ Large inputs (performance)

## Complexity Analysis Standards

### Always Document
```java
/**
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - only using pointers
 */
public static void solve(int[] arr) { }

/**
 * Time Complexity: O(n²) - nested loops
 * Space Complexity: O(n) - HashMap storing n elements
 */
public static int solve2(int[] arr) { }
```

### Complexity Comparison
When providing multiple solutions:
```java
/**
 * Optimal approach with O(n) time.
 * Trade-off: Uses O(n) space for HashMap.
 * 
 * @see #solve_BruteForce(InputType) for O(n²) time, O(1) space
 */
public static ReturnType solve_Optimal(InputType input) { }

/**
 * Brute force approach with O(n²) time.
 * Best when space is critical.
 * 
 * @see #solve_Optimal(InputType) for O(n) time, O(n) space
 */
public static ReturnType solve_BruteForce(InputType input) { }
```

## README Standards

### Each Category README Should Include
- Overview of the category
- Table of contents
- Problem descriptions with:
  - Problem statement
  - Examples
  - Solution approaches
  - File locations
  - Key insights
- Learning tips
- Related problems
- Difficulty levels

### Example Structure
```markdown
# Array Problems

## Problem Name
**Source**: LeetCode XXX

### Problem Statement
Clear explanation...

### Solution Approaches
- Approach 1: O(n), O(1)
- Approach 2: O(n), O(n)

### Example
Code example with input/output

### Key Insights
Why this works...

[→ Browse Code](filename.java)
```

## Git Standards (if using version control)

### Commit Messages
```
✅ Good:
git commit -m "Add MergeSortedArray solution with tests"
git commit -m "Add comprehensive documentation to TwoPointer techniques"
git commit -m "Fix bug in containment logic"

❌ Bad:
git commit -m "update"
git commit -m "fix"
git commit -m "code changes"
```

### Branch Naming
```
feature/array-problems
bugfix/merge-logic
docs/readme-update
```

## Security & Best Practices

### Input Validation
```java
✅ Good:
public int solve(int[] arr) {
    if (arr == null || arr.length == 0) {
        return 0;
    }
    // Implementation
}

❌ Bad:
public int solve(int[] arr) {
    // Direct access without null check
    return arr[0];
}
```

### Avoid Magic Numbers
```java
✅ Good:
private static final int MAX_ARRAY_SIZE = 1000;
if (arr.length > MAX_ARRAY_SIZE) { }

❌ Bad:
if (arr.length > 1000) { }
```

### Use Meaningful Variable Names
```java
✅ Good:
int leftPointer = 0;
int rightPointer = arr.length - 1;

❌ Bad:
int l = 0;
int r = arr.length - 1;
```

## Checklist for New Solutions

- [ ] Class properly documented with @author and @version
- [ ] All methods have clear Javadoc
- [ ] Time and Space complexity documented
- [ ] Multiple approaches included if applicable
- [ ] Main method with test cases
- [ ] No magic numbers
- [ ] Descriptive variable names
- [ ] Edge cases handled
- [ ] Comprehensive test class created
- [ ] All tests pass
- [ ] Category README updated
- [ ] Code formatted (4-space indent, 100 char max line)

## Useful Utilities

### Printing Arrays
```java
private static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
    }
    System.out.println();
}
```

### Printing 2D Arrays
```java
private static void print2DArray(int[][] arr) {
    for (int[] row : arr) {
        printArray(row);
    }
}
```

### Simple Assertions Without JUnit
```java
// For quick testing in main method
assert result == expected : "Test failed: " + result;
```

---

## Summary

This project follows these key principles:
1. **Clarity** - Code should be self-documenting
2. **Completeness** - Include examples, tests, documentation
3. **Consistency** - Follow standards across all files
4. **Correctness** - All tests passing, edge cases handled
5. **Comparison** - Multiple approaches with complexity analysis

Follow these standards to maintain project quality and make it valuable for learning!

---

[← Back to Main README](../DSA_PROJECT_README.md)
