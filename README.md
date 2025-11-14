 CIT300 Algorithm Analyzer - Performance & Complexity Measurement

📋 Project Overview

This project implements and analyzes the performance of four fundamental algorithms: Linear Search, Binary Search, Bubble Sort, and Quick Sort. The goal is to measure and compare their execution times across different input sizes to demonstrate algorithmic complexity in practice.

**Module:** CIT300 - Algorithms and Complexity  
**Assignment:** Graded Practical Assignment 3 (Week 14)  

## 👥 Team Members & Responsibilities

| Member | Role | Algorithm Implemented |
|--------|------|---------------------|
| Member 1 22UG3-0873 H.G.Punara Punsisi| Linear Search | Implemented linear search algorithm with timing measurements |
| Member 2 22UG3-0203 Randika Lakshan| Binary Search | Implemented binary search with array pre-sorting |
| Member 3 22UG3-0229 Y.A.D.Hasith Roosara| Bubble Sort | Implemented bubble sort algorithm with performance analysis |
| Member 4 22UG3-0557 Pawan Methsara| Quick Sort | Implemented quick sort algorithm with timing measurements |

## 🚀 Algorithms Implemented

### 1. Linear Search (22UG3-0873 H.G.Punara Punsisi)
- **File:** `LinearSearchAnalyzer.java`
- **Time Complexity:** O(n)
- **Description:** Sequential search through an array to find a target element
- **Key Features:**
  - Simple iterative implementation
  - Measures search time for existing elements
  - Handles random integer arrays

### 2. Binary Search (22UG3-0203 Randika Lakshan)
- **File:** `BinarySearchAnalyzer.java`
- **Time Complexity:** O(log n)
- **Description:** Efficient search algorithm that requires a sorted array
- **Key Features:**
  - Uses divide-and-conquer approach
  - Arrays are pre-sorted using `Arrays.sort()`
  - Demonstrates logarithmic time complexity

### 3. Bubble Sort (22UG3-0229 Y.A.D.Hasith Roosara)
- **File:** `BubbleSortAnalyzer.java`
- **Time Complexity:** O(n²)
- **Description:** Simple comparison-based sorting algorithm
- **Key Features:**
  - Repeatedly steps through the list
  - Compares adjacent elements and swaps them
  - Shows quadratic time complexity growth

### 4. Quick Sort (22UG3-0557 Pawan Methsara)
- **File:** `QuickSortAnalyzer.java`
- **Time Complexity:** O(n log n) average case
- **Description:** Efficient divide-and-conquer sorting algorithm
- **Key Features:**
  - Uses partitioning and recursion
  - Pivot-based sorting strategy
  - Demonstrates superior performance over bubble sort

## 📊 Performance Results

### Sample Output Tables

**Linear Search:**
```
| Algorithm: | Linear Search |
|------------|---------------|
| Input Size | Time (ms)     |
|------------|---------------|
| 100        | 0.0021        |
| 500        | 0.0085        |
| 1000       | 0.0153        |
```

**Binary Search:**
```
| Algorithm: | Binary Search |
|------------|---------------|
| Input Size | Time (ms)     |
|------------|---------------|
| 100        | 0.0012        |
| 500        | 0.0015        |
| 1000       | 0.0018        |
```

**Bubble Sort:**
```
| Algorithm: | Bubble Sort |
|------------|-------------|
| Input Size | Time (ms)   |
|------------|-------------|
| 100        | 0.856       |
| 500        | 18.234      |
| 1000       | 72.891      |
```

**Quick Sort:**
```
| Algorithm: | Quick Sort |
|------------|------------|
| Input Size | Time (ms)  |
|------------|------------|
| 100        | 0.124      |
| 500        | 0.567      |
| 1000       | 1.234      |
```

## 🛠️ Technical Implementation

### Programming Language
- **Java JDK 8+**

### Key Libraries Used
- `java.util.Arrays` - for array sorting in binary search
- `java.util.Random` - for generating test data
- `System.nanoTime()` - for precise time measurements

### Measurement Methodology
1. **Input Sizes:** 100, 500, and 1000 elements
2. **Data Generation:** Random integers between 0-9999
3. **Timing:** Using `System.nanoTime()` for microsecond precision
4. **Averaging:** Single-run measurements (could be extended to multiple runs)

### Code Structure
Each analyzer follows this pattern:
```java
1. Algorithm implementation
2. Random array generator
3. Timing mechanism
4. Table-formatted output
```

## 📁 Project Structure

```
CIT300-Algorithm-Analyzer/
│
├── src/
│   ├── LinearSearchAnalyzer.java
│   ├── BinarySearchAnalyzer.java
│   ├── BubbleSortAnalyzer.java
│   └── QuickSortAnalyzer.java
├── README.md
└── .gitignore
```

## 🔧 Compilation and Execution

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation Instructions
```bash
# Navigate to src directory
cd src

# Compile all Java files
javac *.java
```

### Execution Instructions
```bash
# Run Linear Search Analyzer
java LinearSearchAnalyzer

# Run Binary Search Analyzer
java BinarySearchAnalyzer

# Run Bubble Sort Analyzer
java BubbleSortAnalyzer

# Run Quick Sort Analyzer
java QuickSortAnalyzer
```

## 📈 Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
|-----------|-----------|--------------|------------|------------------|
| Linear Search | O(1) | O(n) | O(n) | O(1) |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) |
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) |

## 🤝 Collaboration & GitHub Workflow

### Branch Strategy
- Each team member worked on their own feature branch
- Regular commits with descriptive messages
- Pull requests for code review before merging

### Commit Convention
```
feat: Implement linear search algorithm with timing
perf: Optimize binary search implementation
docs: Add detailed comments and documentation
test: Add test cases for edge scenarios
```

### Merge Process
1. Create feature branch from `main`
2. Implement algorithm with tests
3. Create pull request
4. Code review by team members
5. Merge to main after approval

## 🎯 Key Learnings

### Algorithmic Complexity
- **Linear Search:** Demonstrates linear growth with input size
- **Binary Search:** Shows logarithmic efficiency
- **Bubble Sort:** Exhibits quadratic time complexity limitations
- **Quick Sort:** Proves efficiency of divide-and-conquer approach

### Practical Insights
- The importance of algorithm selection for performance-critical applications
- How theoretical complexity translates to real-world performance
- The impact of input size on execution time
- Trade-offs between implementation complexity and runtime efficiency

## 📝 Assignment Requirements Fulfilled

### ✅ Mandatory Requirements
- [x] Four algorithms implemented by respective team members
- [x] Timing measurements using `System.nanoTime()`
- [x] Three input sizes tested: 100, 500, 1000 elements
- [x] Table-formatted output display
- [x] Random array generation for testing
- [x] GitHub repository with collaborative development history

### ✅ Additional Features
- [x] Consistent code structure across all implementations
- [x] Comprehensive documentation
- [x] Error handling and edge case considerations
- [x] Clean, readable code with comments
- [x] Performance analysis and comparisons

## 🚀 Future Enhancements

### Potential Improvements
1. **Extended Input Sizes:** Test with larger datasets (10,000+ elements)
2. **Multiple Runs:** Average execution times over multiple iterations
3. **Memory Usage:** Track memory consumption alongside time complexity
4. **Graphical Output:** Generate performance charts and graphs
5. **Additional Algorithms:** Implement more sorting and searching algorithms

### Code Extensions
```java
// Example: Adding multiple run averaging
public static double measureAverageTime(int size, int iterations) {
    long totalTime = 0;
    for (int i = 0; i < iterations; i++) {
        // Measurement logic
    }
    return totalTime / (iterations * 1_000_000.0);
}
```

## 👨‍💻 Development Team

This project was developed collaboratively by the CIT300 student team, with each member contributing their assigned algorithm implementation and analysis. The collaboration followed agile development practices with regular code reviews and integration.

---

*CIT300 - Data Structures and Algorithms - Algorithms and Complexity*  
*Graded Practical Assignment 3*
