# Java DSA Coding & Hiring

A comprehensive multi-project workspace for Java programming, data structures, algorithms, and interview preparation.

## 📚 Overview

This repository is organized as a collection of specialized Java projects covering:
- **Data Structures & Algorithms**: Core implementations and learning
- **Interview Preparation**: Hiring challenges and interview code
- **Problem Solving**: Practice from platforms like LeetCode, HackerRank
- **Concept Learning**: From basics to advanced Java concepts

All projects use **Java 21**, **Maven**, and **Spring Boot 3.3.0**.

---

## 📁 Projects Structure

### Active Projects

#### 1. **coding-problem-solving-in-java**
   - **Purpose**: Solutions to coding challenges from competitive programming platforms
   - **Platforms**: LeetCode, HackerRank, HackerEarth, GeeksforGeeks
   - **GroupId**: com.firealgo
   - **ArtifactId**: coding-problem-solving-in-java
   - [Details →](coding-problem-solving-in-java/coding-problem-solving-in-java/README.md)

#### 2. **ds-and-algo**
   - **Purpose**: Structured learning and implementation of data structures and algorithms
   - **Focus**: Fundamental and advanced DSA topics with analysis
   - **GroupId**: com.firealgo
   - **ArtifactId**: ds-and-algo
   - [Details →](ds-and-algo/ds-and-algo/README.md)

#### 3. **hiring-challenge-java**
   - **Purpose**: Solutions to company-specific hiring challenges
   - **Content**: Technical interviews, coding assessments, case studies
   - **GroupId**: com.firealgo
   - **ArtifactId**: hiring-challenge-java
   - [Details →](hiring-challenge-java/hiring-challenge-java/README.md)

#### 4. **java-advanced-concept**
   - **Purpose**: Advanced Java programming concepts and patterns
   - **Topics**: Concurrency, Generics, Reflection, Streams, Design Patterns
   - **GroupId**: com.firealgo
   - **ArtifactId**: java-advanced-concept
   - [Details →](java-advanced-concept/java-advanced-concept/README.md)

#### 5. **java-basic-concept**
   - **Purpose**: Foundational Java concepts for beginners and review
   - **Topics**: Core syntax, OOP, Collections, I/O, Exception handling
   - **GroupId**: com.firealgo
   - **ArtifactId**: java-basic-concept
   - [Details →](java-basic-concept/java-basic-concept/README.md)

#### 6. **java-ds-algo-playground**
   - **Purpose**: Interactive sandbox for experimentation with algorithms
   - **Use**: Prototyping, testing, and learning
   - **GroupId**: com.firealgo
   - **ArtifactId**: java-ds-algo-playground
   - [Details →](java-ds-algo-playground/java-ds-algo-playground/README.md)

#### 7. **java-tutorials-and-interview-code**
   - **Purpose**: Curated tutorials and reusable code snippets
   - **Use**: Interview preparation and reference
   - **GroupId**: com.firealgo
   - **ArtifactId**: java-tutorials-and-interview-code
   - [Details →](java-tutorials-and-interview-code/java-tutorials-and-interview-code/README.md)

### Legacy Projects

#### 8. **old-project/java-ds-algo**
   - **Status**: Archived/Legacy
   - **Purpose**: Historical reference and foundation project
   - **Note**: Consider using `java-ds-algo-playground` or `ds-and-algo` for current work
   - [Details →](old-project/java-ds-algo/README.md)

---

## 🚀 Quick Start

### Prerequisites
- **Java 21** or higher
- **Maven 3.6+**
- **Git**

### Build All Projects
```bash
# Navigate to root directory
cd java-dsa-coding-n-hiring

# Build all projects (if you have a parent pom)
mvn clean install

# Or build individual projects
cd coding-problem-solving-in-java/coding-problem-solving-in-java
mvn clean install
```

### Run Tests
```bash
# Run tests for specific project
cd <project-name>/<project-name>
mvn test

# Run specific test class
mvn test -Dtest=ClassName
```

### Run Application
```bash
cd <project-name>/<project-name>
mvn spring-boot:run
```

---

## 📋 Common Commands

### Maven Commands
```bash
# Clean build
mvn clean install

# Skip tests during build
mvn clean install -DskipTests

# Compile only
mvn compile

# Run tests
mvn test

# Run specific test
mvn test -Dtest=TestClassName

# Build with specific profile
mvn clean install -P profile-name

# Generate Javadoc
mvn javadoc:javadoc

# Check for dependency updates
mvn versions:display-dependency-updates
```

### IDE Integration
- **IntelliJ IDEA**: Import as Maven Project
- **Eclipse**: Import as Existing Maven Projects
- **VS Code**: Use Extension Pack for Java with Maven support

---

## 📚 Learning Path Recommendation

### For Beginners
1. Start with **java-basic-concept** - Learn fundamentals
2. Progress to **ds-and-algo** - Understand data structures
3. Practice with **java-ds-algo-playground** - Experiment and test

### For Interview Preparation
1. Review **java-tutorials-and-interview-code** - Study patterns
2. Practice in **hiring-challenge-java** - Solve real challenges
3. Solve problems in **coding-problem-solving-in-java** - Build confidence

### For Advanced Learning
1. Explore **java-advanced-concept** - Master advanced topics
2. Implement patterns in **ds-and-algo** - Apply knowledge
3. Contribute to **java-ds-algo-playground** - Create new content

---

## 🏗️ Project Structure

Each project follows Maven's standard directory layout:

```
<project-name>/
├── pom.xml                          # Maven configuration
├── README.md                        # Project documentation
├── src/
│   ├── main/
│   │   ├── java/                   # Source code
│   │   └── resources/              # Configuration files
│   └── test/
│       └── java/                   # Unit tests
└── target/                         # Build output (gitignored)
```

---

## 🔧 Technology Stack

### Build & Dependency Management
- **Maven 3.6+** - Build automation
- **Spring Boot 3.3.0** - Application framework
- **Java 21** - Programming language

### Testing
- **JUnit 5** - Unit testing framework
- **Mockito** - Mocking library
- **TestNG** - Alternative testing framework (if used)

### Code Quality
- **Checkstyle** - Code style checks
- **SpotBugs** - Bug detection
- **JaCoCo** - Code coverage reporting

---

## 📝 Contributing Guidelines

### Code Style
- Follow [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- Use meaningful variable and method names
- Add comments for complex logic

### Testing
- Write unit tests for all new code
- Aim for >80% code coverage
- Include integration tests for complex features

### Documentation
- Update README files when adding new features
- Add Javadoc comments to public classes and methods
- Include usage examples in comments

### Commit Messages
- Use clear, descriptive commit messages
- Reference issue numbers when applicable
- Follow conventional commits format: `type: description`

---

## 🛠️ Troubleshooting

### Build Issues
```bash
# Clean maven cache
mvn clean

# Update dependencies
mvn dependency:resolve

# Check for conflicting dependencies
mvn dependency:tree
```

### Java Version Issues
```bash
# Verify Java version
java -version

# Set JAVA_HOME if needed
export JAVA_HOME=/path/to/java21
```

### Maven Issues
```bash
# Force update dependencies
mvn clean install -U

# Clear local repository
rm -rf ~/.m2/repository
mvn clean install
```

---

## 📚 Resources

### Official Documentation
- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Maven Documentation](https://maven.apache.org/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)

### Learning Resources
- [Data Structures & Algorithms - GeeksforGeeks](https://www.geeksforgeeks.org/data-structures/)
- [LeetCode Problems](https://leetcode.com/)
- [HackerRank Challenges](https://www.hackerrank.com/)

### Design Patterns
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Gang of Four Patterns](https://en.wikipedia.org/wiki/Design_Patterns)

---

## 📊 Project Statistics

| Project | Purpose | Status |
|---------|---------|--------|
| coding-problem-solving-in-java | Competitive Programming | Active |
| ds-and-algo | Algorithm Learning | Active |
| hiring-challenge-java | Interview Prep | Active |
| java-advanced-concept | Advanced Topics | Active |
| java-basic-concept | Fundamentals | Active |
| java-ds-algo-playground | Experimentation | Active |
| java-tutorials-and-interview-code | Reference & Tutorials | Active |
| old-project/java-ds-algo | Legacy | Archived |

---

## 📄 License

All rights reserved.

---

## 🤝 Support

For issues, questions, or improvements:
1. Check existing documentation in project READMEs
2. Review code comments and Javadoc
3. Consult troubleshooting section above
4. Open an issue or discussion

---

## 🗓️ Project Timeline

- **Created**: 2024
- **Last Updated**: May 2026
- **Status**: Actively Maintained

---

## 📞 Contact & Collaboration

- **Repository**: `java-dsa-coding-n-hiring`
- **Organization**: firealgo
- **GroupId**: com.firealgo

---

## 🎯 Future Enhancements

- [ ] Add performance benchmarking suite
- [ ] Create comprehensive algorithm visualization tools
- [ ] Develop interactive tutorial modules
- [ ] Add CI/CD pipeline documentation
- [ ] Create video tutorials for complex topics
- [ ] Build community forum/discussion section

---

Happy Coding! 🚀
