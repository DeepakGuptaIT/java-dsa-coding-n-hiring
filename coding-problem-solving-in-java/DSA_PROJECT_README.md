# Java DSA Practice & Interview Preparation

A well-organized, comprehensively documented Java project for practicing Data Structures and Algorithms (DSA), with solutions from LeetCode, HackerRank, HackerEarth, GeeksforGeeks, and other online judges.

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Directory Structure](#directory-structure)
- [Quick Start](#quick-start)
- [Learning Path](#learning-path)
- [Topics Covered](#topics-covered)
- [How to Use This Project](#how-to-use-this-project)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [Resources](#resources)

---

## Project Overview

This project is designed to help you:
- ✅ Master fundamental data structures and algorithms
- ✅ Prepare for technical interviews
- ✅ Practice problem-solving systematically
- ✅ Learn from well-documented, tested solutions
- ✅ Understand multiple approaches to each problem

### Key Features
- **Organized Structure**: Problems grouped by data structure and technique
- **Comprehensive Documentation**: Javadoc for every class and method
- **Complete Test Coverage**: Unit tests for all solutions with edge cases
- **Multiple Approaches**: Different solutions with complexity analysis
- **Category READMEs**: Detailed guides for each topic
- **Interview Preparation**: Dedicated section for company-specific problems

### Project Statistics
- **Language**: Java 21
- **Build Tool**: Maven
- **Framework**: Spring Boot 3.3.0
- **Test Framework**: JUnit 5
- **Total Problems**: 100+

---

## Directory Structure

```
src/main/java/com/firealgo/dsa/
├── fundamentals/                 # Basic Data Structures
│   ├── array/                   # Array manipulation problems
│   ├── string/                  # String manipulation
│   ├── linkedlist/              # Linked list operations
│   └── tree/                    # Binary tree problems
│
├── intermediate/                # Intermediate Data Structures
│   ├── graph/                   # Graph algorithms
│   ├── heap/                    # Heap & Priority Queue
│   ├── queue/                   # Queue implementations
│   ├── stack/                   # Stack operations
│   └── hashmap/                 # HashMap/HashSet problems
│
├── advanced/                    # Advanced Algorithms
│   └── algorithms/              # Complex algorithms
│
├── techniques/                  # Algorithm Techniques
│   ├── slidingwindow/           # Sliding window technique
│   ├── twopointer/              # Two pointer technique
│   ├── dynamicprogramming/      # DP problems
│   └── backtracking/            # Backtracking solutions
│
└── interview/                   # Interview Preparation
    ├── company1/                # Company-specific questions
    └── company2/                # Company-specific questions

src/test/java/com/firealgo/dsa/
└── [Corresponding test files for all solutions]
```

---

## Quick Start

### Prerequisites
- Java 21+
- Maven 3.6+

### Setup
```bash
# Clone the repository
git clone <repository-url>
cd coding-problem-solving-in-java

# Build the project
mvn clean install

# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=MergeSortedArrayTest
```

### First Problem to Try
1. Start with [Array - MergeSortedArray](src/main/java/com/firealgo/dsa/fundamentals/array/README.md)
2. Read the problem explanation
3. Review the solution
4. Run the tests
5. Try to solve similar problems

---

## Learning Path

### For Beginners (Week 1-2)
1. **Fundamentals**
   - Arrays: basic operations, sorting
   - Strings: manipulation, searching
   - Time & Space complexity

**Files to study**:
- [Array Problems](src/main/java/com/firealgo/dsa/fundamentals/array/README.md)
- [String Problems](src/main/java/com/firealgo/dsa/fundamentals/string/README.md)

### Intermediate (Week 3-4)
2. **Core Techniques**
   - Two Pointer
   - Sliding Window
   - Basic recursion

**Files to study**:
- [Two Pointer](src/main/java/com/firealgo/dsa/techniques/twopointer/README.md)
- [Sliding Window](src/main/java/com/firealgo/dsa/techniques/slidingwindow/README.md)

### Advanced (Week 5+)
3. **Complex Topics**
   - Dynamic Programming
   - Graph Algorithms
   - Backtracking

4. **Data Structures**
   - Trees & Tries
   - Heaps
   - Graphs

---

## Topics Covered

### Data Structures

| Topic | Files | Difficulty | Status |
|-------|-------|-----------|--------|
| Arrays | [📁](src/main/java/com/firealgo/dsa/fundamentals/array/) | 🟢 Easy | ✅ |
| Strings | [📁](src/main/java/com/firealgo/dsa/fundamentals/string/) | 🟢 Easy | ✅ |
| Linked Lists | [📁](src/main/java/com/firealgo/dsa/fundamentals/linkedlist/) | 🟡 Medium | 📝 |
| Trees | [📁](src/main/java/com/firealgo/dsa/fundamentals/tree/) | 🟡 Medium | 📝 |
| Graphs | [📁](src/main/java/com/firealgo/dsa/intermediate/graph/) | 🔴 Hard | 📝 |
| Heaps | [📁](src/main/java/com/firealgo/dsa/intermediate/heap/) | 🟡 Medium | 📝 |
| Stack & Queue | [📁](src/main/java/com/firealgo/dsa/intermediate/stack/) | 🟡 Medium | 📝 |
| HashMap/Set | [📁](src/main/java/com/firealgo/dsa/intermediate/hashmap/) | 🟡 Medium | 📝 |

### Techniques

| Technique | Files | Status |
|-----------|-------|--------|
| Two Pointer | [📁](src/main/java/com/firealgo/dsa/techniques/twopointer/) | ✅ |
| Sliding Window | [📁](src/main/java/com/firealgo/dsa/techniques/slidingwindow/) | ✅ |
| Dynamic Programming | [📁](src/main/java/com/firealgo/dsa/techniques/dynamicprogramming/) | 📝 |
| Backtracking | [📁](src/main/java/com/firealgo/dsa/techniques/backtracking/) | 📝 |

---

## How to Use This Project

### 1. Find a Problem
- Browse the directories by topic
- Or search by difficulty level
- Each problem has a README with explanation

### 2. Understand the Problem
```java
// Read the problem statement and examples
// Check Time & Space complexity requirements
// Look at edge cases
```

### 3. Study the Solution
```java
// Read the solution code
// Check the comments explaining the approach
// Understand the algorithm step by step
```

### 4. Run the Tests
```bash
# Run tests for a specific problem
mvn test -Dtest=ContainerWithMostWaterTest

# Run all tests in a category
mvn test -Dtest=*ArrayTest
```

### 5. Try It Yourself
```java
// Try to solve a similar problem
// Reference the solution when stuck
// Understand the patterns and techniques
```

### 6. Interview Preparation
- Check the [Interview](src/main/java/com/firealgo/dsa/interview/) section
- Practice problems asked by specific companies
- Review common patterns

---

## Running Tests

### Run All Tests
```bash
mvn test
```

### Run Tests by Category
```bash
# Array problems
mvn test -Dtest=*ArrayTest

# String problems
mvn test -Dtest=*StringTest

# Sliding window
mvn test -Dtest=*SlidingWindowTest

# Two pointer
mvn test -Dtest=*TwoPointerTest
```

### Run Specific Test
```bash
mvn test -Dtest=ContainerWithMostWaterTest
```

### Generate Test Report
```bash
mvn surefire-report:report
# Report available at: target/site/surefire-report.html
```

### Run with Coverage
```bash
mvn jacoco:report
# Coverage available at: target/site/jacoco/index.html
```

---

## Code Organization Best Practices

### Each Solution Should Include:
1. **Class Documentation** - Javadoc explaining the problem
2. **Method Documentation** - Detailed comments for each method
3. **Time Complexity** - O(n), O(n²), etc.
4. **Space Complexity** - Memory usage analysis
5. **Multiple Approaches** - When applicable
6. **Example Usage** - Main method with test cases
7. **Edge Cases** - Handling of boundary conditions

### Example Structure
```java
/**
 * <h2>Problem Name - LeetCode XXX</h2>
 * 
 * <p><strong>Problem:</strong> Description of problem</p>
 * <p><strong>Time:</strong> O(n)</p>
 * <p><strong>Space:</strong> O(1)</p>
 */
public class ProblemName {
    
    /**
     * Main solution method.
     * 
     * @param input description
     * @return description
     */
    public static ReturnType solve(InputType input) {
        // Implementation
    }
}
```

---

## Common Problem Patterns

### Pattern Recognition Table

| Pattern | Use Case | Example |
|---------|----------|---------|
| Two Pointer | Sorted arrays, pairs | Container with most water |
| Sliding Window | Substrings, subarrays | Longest substring |
| Hash Map | Frequency, duplicates | Two sum |
| Recursion/DFS | Trees, graphs | Binary tree traversal |
| BFS | Level-order traversal | Shortest path |
| DP | Optimal substructure | Fibonacci, coin change |
| Greedy | Local optimal choice | Activity selection |

---

## Interview Preparation Tips

### Before Interview
1. ✅ Understand fundamentals deeply
2. ✅ Practice 50+ problems
3. ✅ Know multiple approaches for common problems
4. ✅ Understand complexity analysis
5. ✅ Practice explaining your solution

### During Interview
1. ✅ Ask clarifying questions
2. ✅ Explain your approach before coding
3. ✅ Write clean, readable code
4. ✅ Discuss time/space complexity
5. ✅ Test with examples and edge cases

### Common Interview Questions
- See [Interview Directory](src/main/java/com/firealgo/dsa/interview/)
- Company-specific question banks
- Patterns from LeetCode 75, Top Interview 150

---

## Contributing

### Adding a New Problem
1. Create solution file with full Javadoc
2. Add comprehensive test class
3. Include multiple approaches if possible
4. Update relevant README files
5. Add to index in category README

### Improvement Areas
- ❓ LinkedList problems
- ❓ Graph algorithms
- ❓ Dynamic programming
- ❓ More interview problems
- ❓ Video tutorials/explanations

---

## Resources

### External Resources
- 📚 [LeetCode](https://leetcode.com/) - Algorithm problems
- 📚 [HackerRank](https://www.hackerrank.com/) - Coding challenges
- 📚 [GeeksforGeeks](https://www.geeksforgeeks.org/) - DSA tutorials
- 📚 [Java Documentation](https://docs.oracle.com/javase/21/)

### Books
- 📖 "Cracking the Coding Interview" - McDowell
- 📖 "Elements of Programming Interviews" - Aziz et al.
- 📖 "Introduction to Algorithms" - CLRS

### Websites
- 🌐 [AlgoExpert](https://www.algoexpert.io/)
- 🌐 [InterviewBit](https://www.interviewbit.com/)
- 🌐 [CodeSignal](https://codesignal.com/)

---

## Project Statistics

```
Total Problems: 100+
Fully Documented: 15+
With Tests: 15+
Categories: 8
Techniques: 4+
Companies: 10+
```

---

## Quick Links

| Category | Link |
|----------|------|
| Array Problems | [📁](src/main/java/com/firealgo/dsa/fundamentals/array/) |
| String Problems | [📁](src/main/java/com/firealgo/dsa/fundamentals/string/) |
| Two Pointer | [📁](src/main/java/com/firealgo/dsa/techniques/twopointer/) |
| Sliding Window | [📁](src/main/java/com/firealgo/dsa/techniques/slidingwindow/) |
| Interview Prep | [📁](src/main/java/com/firealgo/dsa/interview/) |

---

## License

This project is open source and available under the MIT License.

---

## Support

For issues, questions, or suggestions:
1. Check existing solutions for similar problems
2. Review the documentation
3. Check test cases for edge cases
4. Create an issue with detailed description

---

## Roadmap

- [ ] Complete LinkedList problems (5)
- [ ] Add Graph algorithms (10)
- [ ] Implement Dynamic Programming (15)
- [ ] Add Binary Tree problems (10)
- [ ] Create video explanations
- [ ] Add company-specific sections
- [ ] Create difficulty progression guide
- [ ] Add follow-up questions for each problem

---

## Acknowledgments

Built with reference to:
- LeetCode community solutions
- GeeksforGeeks tutorials
- "Cracking the Coding Interview"
- Various open source contributions

---

**Happy Coding! 🚀**

For latest updates, check back regularly for new problems and improved documentation.

Last Updated: May 2026
