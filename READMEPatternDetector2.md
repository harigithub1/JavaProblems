🧠 1. Sliding Window

Use when: dealing with subarrays/substrings
Common tasks: longest/shortest substring, max sum, etc.

Fixed window: size = k
Variable window: expand + shrink

👉 Example:

Longest substring without repeating characters
Max sum subarray of size k
🔁 2. Two Pointers

Use when: sorted arrays, linked lists, or pairs

Opposite ends → move inward
Same direction → fast/slow pointers

👉 Example:

Pair with target sum
Remove duplicates
Cycle detection in linked list
🔍 3. Binary Search (Beyond arrays)

Use when: monotonic conditions (not just sorted arrays!)

👉 Patterns:

Search space reduction
Answer-based binary search

👉 Example:

Find minimum in rotated array
Allocate books / capacity problems
🌳 4. Tree Traversals (DFS / BFS)

Use when: trees or graphs

DFS → recursion (pre/in/post order)
BFS → level-order (queue)

👉 Example:

Lowest Common Ancestor
Level order traversal
Diameter of binary tree
🧩 5. Backtracking

Use when: all combinations / permutations

👉 Think:

“Try → explore → undo”

👉 Example:

Subsets
Permutations
N-Queens
📦 6. Dynamic Programming (DP)

Use when: overlapping subproblems + optimal substructure

👉 Types:

1D DP (Fibonacci, House Robber)
2D DP (LCS, grid problems)

👉 Example:

Longest Increasing Subsequence
Knapsack
Edit Distance
🔗 7. Graph Algorithms

Use when: relationships, networks

👉 Core techniques:

BFS / DFS
Topological sort
Union-Find

👉 Example:

Number of islands
Course schedule
Detect cycles
📊 8. Greedy Algorithms

Use when: local optimal choice leads to global optimum

👉 Example:

Activity selection
Jump game
Merge intervals
🧮 9. Prefix Sum / Hashing

Use when: cumulative sums or frequency tracking

👉 Example:

Subarray sum equals k
Count of elements
🔄 10. Heap / Priority Queue

Use when: top K / min-max problems

👉 Example:

K largest elements
Median in stream
🧵 11. Monotonic Stack / Queue

Use when: next greater/smaller element

👉 Example:

Largest rectangle in histogram
Daily temperatures
🧠 12. Bit Manipulation

Use when: optimization, subsets, XOR tricks

👉 Example:

Single number
Power of 2
Subsets via bitmask

🔥 core, high-frequency patterns (the original 12)

These cover ~70–80% of interview problems:

Sliding Window
Two Pointers
Binary Search
DFS / BFS (Trees & Graphs)
Backtracking
Dynamic Programming
Graph Algorithms
Greedy
Prefix Sum / Hashing
Heap / Priority Queue
Monotonic Stack
Bit Manipulation


🚀 Advanced / Extended Patterns (VERY important)
13. Union-Find (Disjoint Set)

Use when: connectivity, grouping

👉 Example:

Number of connected components
Accounts merge
14. Topological Sort

Use when: ordering with dependencies

👉 Example:

Course schedule
Build order
15. Trie (Prefix Tree)

Use when: string prefix problems

👉 Example:

Word search
Autocomplete
16. Interval Problems

Use when: overlapping ranges

👉 Example:

Merge intervals
Meeting rooms
17. Matrix Traversal

Use when: 2D grids

👉 Patterns:

BFS in grid
DFS in grid
Multi-source BFS

👉 Example:

Rotting oranges
Number of islands
18. Kadane’s Algorithm

(A special greedy + DP hybrid)

👉 Example:

Maximum subarray sum
19. Divide & Conquer

Use when: split problem into halves

👉 Example:

Merge sort
Quick select
Majority element
20. Line Sweep Algorithm

Use when: events over time / intervals

👉 Example:

Skyline problem
Meeting rooms II
21. Reservoir Sampling / Randomized

Use when: randomness, large data streams

👉 Example:

Random pick index
22. String Matching Algorithms

Use when: pattern search

👉 Example:

KMP
Rabin-Karp


👉 Tier-wise importance:

🥇 Tier 1 (Must master)
Sliding Window
Two Pointers
Binary Search
DFS/BFS
DP
Graphs
Greedy
🥈 Tier 2 (Strong advantage)
Heap
Prefix Sum
Backtracking
Union-Find
Intervals
🥉 Tier 3 (Differentiator)
Trie
Monotonic Stack
Topological Sort
Line Sweep
Advanced DP