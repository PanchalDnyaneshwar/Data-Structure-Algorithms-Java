# Data-Structure-Algorithms-Java
# Data Structure:

- Data Structure is a way to store and organize data.
- It helps to perform operations efficiently.
- Makes programs fast and optimized.

Why Data Structure is Needed?

- To manage large amount of data.
- To reduce execution time.
- To improve performance.

# Data Structures:

- Array
- Linked List
- Stack
- Queue
- Tree
- Graph
- HashMap

Real-Life Examples:

- Stack → Browser back button
- Queue → Line at bank
- Array → Student marks list
- HashMap → Phone contacts

One-Line Interview Answer:

- Data structure is a way of organizing data
  so it can be accessed and modified efficiently.

# Time Complexity:

- Time complexity measures how long an algorithm takes.
- Depends on size of input.

Why Time Complexity is Important?

- To compare algorithms.
- To choose best solution.
- To improve code efficiency.

Big-O Notation:

- Used to represent time complexity.
- Focuses on worst-case scenario.

Common Time Complexities:

- O(1)      → Constant time
- O(log n)  → Logarithmic time
- O(n)      → Linear time
- O(n log n)→ Efficient sorting
- O(n²)     → Nested loops

Examples:

- Access array element → O(1)
- Loop through array → O(n)
- Nested loop → O(n²)
- Binary Search → O(log n)

Important Interview Tip:

- Always consider worst case.
- Ignore constants and small terms.

One-Line Interview Answer:

- Time complexity describes how execution time
  grows as input size increases.

# Space Complexity:

- Space complexity measures how much memory
  an algorithm uses.
- Includes input space + extra memory used.

Why Space Complexity is Important?

- To optimize memory usage.
- To avoid memory overflow.
- Important for large input data.

What Space Complexity Includes?

1) Input Space:
- Memory used to store input data.

2) Auxiliary Space:
- Extra memory used by algorithm.
- Variables, arrays, recursion stack.

Examples:

- Using few variables → O(1)
- Using extra array of size n → O(n)
- Recursion depth n → O(n)

Common Space Complexities:

- O(1) → Constant space
- O(n) → Linear space
- O(n²) → Quadratic space

Recursion Space:

- Each recursive call uses stack memory.
- Deep recursion increases space usage.

Important Interview Tip:

- Always mention auxiliary space.
- Recursion adds hidden space cost.

# Time vs Space Trade-Off:

- Faster algorithm may use more memory.
- Memory-efficient algorithm may be slower.

Real-Life Example:

- Mobile apps optimize memory to save battery.
- Large systems reduce memory usage to scale.

One-Line Interview Answer:

- Space complexity measures the amount of
  memory an algorithm requires to execute.

- Data Structure → How data is stored
- Algorithm → Steps to solve problem
- Time Complexity → How fast algorithm runs
- Space Complexity → How much memory is used

# Pseudo Code:

- Pseudo code is an informal way of writing logic.
- It describes algorithm steps in simple English.
- It is NOT a programming language.

Why Pseudo Code is Used?

- To understand logic before coding.
- To plan solution clearly.
- To communicate ideas easily.

Use in DSA:

- Helps design algorithms.
- Used in interviews.
- Used before writing actual code.

Important Interview Points:

- Pseudo code explains logic.
- Used before implementation.
- Independent of programming language.

One-Line Interview Answer:

- Pseudo code is a simple way to describe
  algorithm logic without using programming syntax.

- Algorithm → Steps to solve problem
- Pseudo Code → Written form of algorithm
- Code → Actual implementation



# Linear Search is a searching algorithm that checks each element one by one until the target element is found or the list ends.

* Pseudocode

    LinearSearch(arr, element):
    for i from 0 to length of arr - 1
        if arr[i] == element
            return i
    return -1

* Time Complexity   

|     Case     | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(n)       |
| Worst Case   | O(n)       |

* Space Complexity - O(1)

* Important Interview Points

Works on sorted & unsorted arrays
Simple and easy to implement
Inefficient for large datasets
Used when data size is small or unsorted

* Real-Life Example (Interview Favorite)

Searching a contact name in an unsorted phone contact list
→ You check each contact one by one → Linear Search


# Binary Search is a searching algorithm that works on a sorted array.
# It repeatedly divides the search space into two halves until the element is found.

* Pseudocode (With Explanation)

BinarySearch(arr, element):
    start = 0                       // points to first index of array
    end = length of arr - 1         // points to last index of array

    while start <= end              // continue while search space is valid

        mid = start + (end - start) / 2
        // find middle index of current search range

        if arr[mid] == element
            return mid
            // element found at middle position

        else if arr[mid] < element
            start = mid + 1
            // element must be in right half, ignore left half

        else
            end = mid - 1
            // element must be in left half, ignore right half

    return -1
    // element not present in array

* Time Complexity

|     Case     | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

* Space Complexity
O(1)

* Important Interview Points

Works only on sorted arrays
Uses divide and conquer technique
Reduces search space by half every iteration
Much faster than linear search for large data

* Real-Life Example (Interview Favorite)

Searching a word in a dictionary
→ Open middle page, decide left or right → Binary Search

