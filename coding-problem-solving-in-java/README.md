# Coding Problem Solving in Java

A **comprehensive, well-organized, and thoroughly documented** Java project for practicing Data Structures and Algorithms with solutions from LeetCode, HackerRank, HackerEarth, GeeksforGeeks, and other coding platforms.

## 🎯 Project Overview

This project is designed to help you:
- ✅ **Master DSA fundamentals** systematically
- ✅ **Prepare for technical interviews** effectively
- ✅ **Learn multiple approaches** to each problem
- ✅ **Practice with comprehensive tests** for every solution
- ✅ **Understand algorithms deeply** through documentation

### Key Features
- 📚 **100+ Organized Problems** - Grouped by data structure and technique
- 📝 **Full Documentation** - Javadoc for every class and method
- ✅ **Comprehensive Tests** - Unit tests covering edge cases
- 🎓 **Multiple Approaches** - Different solutions with complexity analysis
- 📖 **Category Guides** - Detailed READMEs explaining each topic
- 🏢 **Interview Prep** - Company-specific problem sections

## 📊 Project Details

- **Language**: Java 21
- **Build Tool**: Maven
- **Framework**: Spring Boot 3.3.0
- **Test Framework**: JUnit 5
- **Total Solutions**: 100+
- **Test Coverage**: Comprehensive with edge cases

## 🚀 Quick Start

### Setup
```bash
# Clone and navigate to project
cd coding-problem-solving-in-java

# Build the project
mvn clean install

# Run all tests
mvn test
```

### First Problem
1. Start with **[Array - MergeSortedArray](src/main/java/com/firealgo/dsa/fundamentals/array/)**
2. Read the problem explanation
3. Study the solution
4. Run the tests: `mvn test -Dtest=MergeSortedArrayTest`
5. Try similar problems

## 📂 Project Structure

### New Improved Organization
```
src/main/java/com/firealgo/dsa/
├── fundamentals/             # Basic Data Structures
│   ├── array/               # Array problems
│   ├── string/              # String problems  
│   ├── linkedlist/          # LinkedList problems
│   └── tree/                # Tree problems
│
├── intermediate/             # Intermediate Topics
│   ├── graph/               # Graph algorithms
│   ├── heap/                # Heap & Priority Queue
│   ├── queue/               # Queue problems
│   ├── stack/               # Stack problems
│   └── hashmap/             # HashMap/Set problems
│
├── advanced/                 # Advanced Algorithms
│   └── algorithms/          # Complex algorithms
│
├── techniques/               # Algorithm Techniques
│   ├── slidingwindow/       # Sliding Window patterns
│   ├── twopointer/          # Two Pointer patterns
│   ├── dynamicprogramming/  # Dynamic Programming
│   └── backtracking/        # Backtracking algorithms
│
└── interview/                # Interview Preparation
    ├── company1/            # Company questions
    └── company2/            # Company questions
```

### Documentation Files
- **[DSA_PROJECT_README.md](DSA_PROJECT_README.md)** - Main comprehensive guide
- **[CODE_ORGANIZATION_GUIDE.md](CODE_ORGANIZATION_GUIDE.md)** - Coding standards
- **Category READMEs** - Detailed guides in each directory

## 📚 What's Included

### Fully Documented Solutions (Examples)
- ✅ [MergeSortedArray](src/main/java/com/firealgo/dsa/fundamentals/array/MergeSortedArray.java)
- ✅ [MoveZeros](src/main/java/com/firealgo/dsa/fundamentals/array/MoveZeros.java)
- ✅ [CountVowels](src/main/java/com/firealgo/dsa/fundamentals/string/CountVowels.java)
- ✅ [LongestSubstringWithoutRepeating](src/main/java/com/firealgo/dsa/techniques/slidingwindow/LongestSubstringWithoutRepeating.java)
- ✅ [ContainerWithMostWater](src/main/java/com/firealgo/dsa/techniques/twopointer/ContainerWithMostWater.java)

### Comprehensive Tests
- ✅ [MergeSortedArrayTest](src/test/java/com/firealgo/dsa/MergeSortedArrayTest.java)
- ✅ [MoveZerosTest](src/test/java/com/firealgo/dsa/MoveZerosTest.java)
- ✅ [CountVowelsTest](src/test/java/com/firealgo/dsa/CountVowelsTest.java)
- ✅ [LongestSubstringTest](src/test/java/com/firealgo/dsa/LongestSubstringWithoutRepeatingTest.java)
- ✅ [ContainerWithMostWaterTest](src/test/java/com/firealgo/dsa/ContainerWithMostWaterTest.java)

## 📖 Learning Path

### For Complete Beginners
1. Read [DSA_PROJECT_README.md](DSA_PROJECT_README.md) - Overview
2. Start with [Fundamentals Guide](src/main/java/com/firealgo/dsa/fundamentals/README.md)
3. Complete [Array Problems](src/main/java/com/firealgo/dsa/fundamentals/array/) first
4. Move to [String Problems](src/main/java/com/firealgo/dsa/fundamentals/string/)
5. Learn [Techniques](src/main/java/com/firealgo/dsa/techniques/README.md)

### For Interview Prep
1. Read [Code Standards](CODE_ORGANIZATION_GUIDE.md)
2. Review [Techniques Guide](src/main/java/com/firealgo/dsa/techniques/README.md)
3. Study [Two Pointer](src/main/java/com/firealgo/dsa/techniques/twopointer/README.md)
4. Study [Sliding Window](src/main/java/com/firealgo/dsa/techniques/slidingwindow/README.md)
5. Practice interview questions

## 🧪 Running Tests

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=MergeSortedArrayTest

# Run by category
mvn test -Dtest=*ArrayTest
mvn test -Dtest=*SlidingWindowTest

# Generate coverage report
mvn jacoco:report
```

## 📋 Documentation Standards

Every solution in this project includes:
- 📝 **Javadoc** - Complete documentation
- ⏱️ **Complexity Analysis** - Time and Space
- 🔄 **Multiple Approaches** - When applicable
- 🧪 **Test Cases** - Comprehensive test coverage
- 💡 **Key Insights** - Why the solution works
- 📚 **References** - Links to problems

See [CODE_ORGANIZATION_GUIDE.md](CODE_ORGANIZATION_GUIDE.md) for detailed standards.

## 🎓 How to Use This Project

### To Learn a Topic
1. Navigate to the category directory
2. Read the README in that directory
3. Study the solution files
4. Review the test cases
5. Try solving similar problems

### To Prepare for Interviews
1. Review [Techniques](src/main/java/com/firealgo/dsa/techniques/)
2. Practice common patterns
3. Time yourself on problems
4. Review company-specific sections

### To Add New Solutions
1. Follow [CODE_ORGANIZATION_GUIDE.md](CODE_ORGANIZATION_GUIDE.md)
2. Create properly documented class
3. Add comprehensive test class
4. Update category README
5. Ensure all tests pass

## 📊 Statistics

| Metric | Count |
|--------|-------|
| Total Problems | 100+ |
| Fully Documented | 15+ |
| With Tests | 15+ |
| Categories | 8 |
| Techniques | 4+ |
| Interview Companies | 10+ |

## 🔗 Quick Links

| Resource | Link |
|----------|------|
| Main Guide | [DSA_PROJECT_README.md](DSA_PROJECT_README.md) |
| Coding Standards | [CODE_ORGANIZATION_GUIDE.md](CODE_ORGANIZATION_GUIDE.md) |
| Fundamentals Guide | [fundamentals/README.md](src/main/java/com/firealgo/dsa/fundamentals/README.md) |
| Techniques Guide | [techniques/README.md](src/main/java/com/firealgo/dsa/techniques/README.md) |
| Intermediate Guide | [intermediate/README.md](src/main/java/com/firealgo/dsa/intermediate/README.md) |
| Array Problems | [array/README.md](src/main/java/com/firealgo/dsa/fundamentals/array/README.md) |
| String Problems | [string/README.md](src/main/java/com/firealgo/dsa/fundamentals/string/README.md) |
| Two Pointer | [twopointer/README.md](src/main/java/com/firealgo/dsa/techniques/twopointer/README.md) |
| Sliding Window | [slidingwindow/README.md](src/main/java/com/firealgo/dsa/techniques/slidingwindow/README.md) |

## 🎯 Next Steps

1. ✅ **Read** [DSA_PROJECT_README.md](DSA_PROJECT_README.md) for complete overview
2. ✅ **Explore** [Fundamentals Guide](src/main/java/com/firealgo/dsa/fundamentals/README.md)
3. ✅ **Practice** starting with Array problems
4. ✅ **Contribute** by adding more solutions following standards
5. ✅ **Master** by attempting interview problems

## 📝 How to Contribute

1. Add new solution following [CODE_ORGANIZATION_GUIDE.md](CODE_ORGANIZATION_GUIDE.md)
2. Include comprehensive test coverage
3. Update relevant category README
4. Ensure all tests pass
5. Document time/space complexity

## 🏆 Success Criteria

After completing this project, you'll be able to:
- ✅ Understand fundamental data structures deeply
- ✅ Recognize algorithmic patterns and techniques
- ✅ Solve interview problems with confidence
- ✅ Explain solutions clearly
- ✅ Analyze time and space complexity

## 📚 References

- [LeetCode](https://leetcode.com)
- [GeeksforGeeks DSA](https://www.geeksforgeeks.org/fundamentals-of-algorithms/)
- [HackerRank](https://www.hackerrank.com/)
- Cracking the Coding Interview - Gayle Laakmann McDowell

## ⚡ Pro Tips

- ✨ Start with easy problems, not hard ones
- ✨ Understand before memorizing
- ✨ Practice writing clean code
- ✨ Always analyze complexity
- ✨ Test edge cases
- ✨ Study multiple approaches

---

## 🚀 Get Started Now!

```bash
# 1. Build the project
mvn clean install

# 2. Run first example
mvn test -Dtest=MergeSortedArrayTest

# 3. Read the guide
# Open: DSA_PROJECT_README.md

# 4. Start learning
# Navigate to: src/main/java/com/firealgo/dsa/fundamentals/array/
```

**Last Updated**: May 2026

For detailed information, see [DSA_PROJECT_README.md](DSA_PROJECT_README.md)
- Write comprehensive test cases
- Add comments for complex solutions
- Keep solutions well-organized by topic

## License

All rights reserved.

