An algorithm is a step-by-step procedure used to solve a problem or perform a task. Algorithm analysis helps determine the efficiency of an algorithm in terms of execution time and memory usage.
Data Structures and Algorithms (DSA) are essential for developing efficient and scalable software applications. Choosing the right data structure and algorithm can significantly improve the performance of a program.

## Why Data Structures and Algorithms?
Data Structures and Algorithms are important because they:

- Improve program efficiency.
- Reduce execution time.
- Optimize memory usage.
- Help solve complex problems effectively.
- Form the foundation of software development and coding interviews.

## Why Data Structures and Algorithms?
Data Structures and Algorithms are important because they:

- Improve program efficiency.
- Reduce execution time.
- Optimize memory usage.
- Help solve complex problems effectively.
- Form the foundation of software development and coding interviews.
Example:

```
for(int i = 0; i < n; i++) {   
 System.out.println(i);
 }
```

Time Complexity = O(n)

### Omega Notation (Ω)
Represents the lower bound or best-case complexity.
Example:  
Searching the first element in an array.

Complexity = Ω(1)

---

### Theta Notation (Θ)
Represents the exact growth rate.
Example:  
A linear traversal of an array.

Complexity = Θ(n)

---

## Best, Average, and Worst Cases

### Best Case
Minimum execution time.
Example:  
Linear Search finds the element at the first position.
Complexity = O(1)

### Average Case
Expected execution time for a typical input.

### Worst Case
Maximum execution time.
Example:  
Linear Search finds the element at the last position.
Complexity = O(n)

---

## Complexity of Iterative Algorithms

### Single Loop

```
for(int i = 0; i < n; i++)
```
Complexity = O(n)

### Nested Loop

```
for(int i = 0; i < n; i++){    for(int j = 0; j < n; j++)    {    }}
```
Complexity = O(n²)

---

## Complexity of Recursive Algorithms

### Factorial
```
factorial(n){    return n * factorial(n-1);}
```
Time Complexity = O(n)
Space Complexity = O(n)

---

# 2. Arrays
An Array is a collection of elements of the same data type stored in contiguous memory locations.
Example:
```
int arr[] = {10, 20, 30, 40, 50};
```

---

## Characteristics of Arrays
- Fixed size.
- Stores homogeneous data.
- Fast access using index.
- Stored in contiguous memory.

---

## Array Representation in Memory
Array elements are stored one after another in memory.
Example:
```
Index:   0   1   2   3Value:  10  20  30  40
```

---

## Array Operations

### Traversal
Accessing every element.
```
for(int i = 0; i < arr.length; i++){    System.out.println(arr[i]);}
```
Complexity = O(n)

---

### Insertion
Adding a new element.
Complexity = O(n)

---

### Deletion
Removing an element.
Complexity = O(n)

---

### Searching
Finding an element.
Complexity = O(n)

---

### Updating
Changing an element value.
Complexity = O(1)

---

## Advantages of Arrays
- Easy to use.
- Fast access using index.
- Memory efficient.

---

## Disadvantages of Arrays
- Fixed size.
- Insertion and deletion are costly.

---

# 3. Linked List
A Linked List is a linear data structure where elements are stored in nodes. Each node contains data and a reference to the next node.

---

## Node Structure
```
class Node{    int data;    Node next;}
```

---

## Singly Linked List
Each node points to the next node.
```
10 → 20 → 30 → NULL
```

### Operations
- Insertion
- Deletion
- Traversal
- Searching

---

## Doubly Linked List
Each node has references to both previous and next nodes.
```
NULL ← 10 ↔ 20 ↔ 30 → NULL
```

### Advantages
- Bidirectional traversal.
- Easier deletion.

### Disadvantages
- More memory usage.

---

## Circular Singly Linked List
Last node points back to the first node.
```
10 → 20 → 30↑         ↓←←←←←←←←←←
```

---

## Circular Doubly Linked List
Both forward and backward circular links exist.

---

## Time Complexity

| Operation           | Complexity |
| ------------------- | ---------- |
| Access              | O(n)       |
| Search              | O(n)       |
| Insert at Beginning | O(1)       |
| Insert at End       | O(n)       |
| Delete              | O(n)       |

---

# 4. Searching Algorithms

## Introduction
Searching is the process of finding a specific element in a data structure.

---

## Linear Search
Linear Search checks each element one by one until the target is found.

### Algorithm
1. Start from the first element.
2. Compare with target.
3. If found, return position.
4. Otherwise continue.
5. If end is reached, element is not present.

### Example
```
Array = [10, 20, 30, 40]Target = 30
```
Result = Found at index 2

### Complexity

|Case|Complexity|
|---|---|
|Best|O(1)|
|Average|O(n)|
|Worst|O(n)|

---

## Binary Search
Binary Search works on sorted arrays by repeatedly dividing the search space into halves.

### Steps
1. Find middle element.
2. Compare with target.
3. If target is smaller, search left half.
4. If target is greater, search right half.
5. Repeat until found.

### Example
```
Array = [10, 20, 30, 40, 50]Target = 40
```

### Complexity

|Case|Complexity|
|---|---|
|Best|O(1)|
|Average|O(log n)|
|Worst|O(log n)|

### Advantage
Much faster than Linear Search for large sorted datasets.

---

# 5. Sorting Algorithms
Sorting is the process of arranging data in ascending or descending order.

---

## Bubble Sort
Repeatedly compares adjacent elements and swaps them if they are in the wrong order.

### Complexity

|Case|Complexity|
|---|---|
|Best|O(n)|
|Average|O(n²)|
|Worst|O(n²)|

### Advantages
- Easy to implement.

### Disadvantages
- Inefficient for large datasets.

---

## Insertion Sort
Places each element into its correct position within the sorted portion.

### Complexity

|Case|Complexity|
|---|---|
|Best|O(n)|
|Average|O(n²)|
|Worst|O(n²)|

---

## Merge Sort
Uses Divide and Conquer technique.
1. Divide array into halves.
2. Sort each half.
3. Merge sorted halves.

### Complexity

|Case|Complexity|
|---|---|
|Best|O(n log n)|
|Average|O(n log n)|
|Worst|O(n log n)|

### Advantages
- Stable sorting algorithm.
- Efficient for large datasets.

---

## Quick Sort
1. Select pivot element.
2. Partition array.
3. Sort partitions recursively.

### Complexity

|Case|Complexity|
|---|---|
|Best|O(n log n)|
|Average|O(n log n)|
|Worst|O(n²)|

### Advantages
- Very fast in practice.

---

## Heap Sort
Uses a Binary Heap data structure to sort elements.

### Steps
1. Build a heap.
2. Extract maximum element.
3. Rebuild heap.
4. Repeat until sorted.

### Complexity

|Case|Complexity|
|---|---|
|Best|O(n log n)|
|Average|O(n log n)|
|Worst|O(n log n)|

### Advantages
- Good worst-case performance.
- Does not require additional memory.