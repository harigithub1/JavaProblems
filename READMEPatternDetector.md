🧠 THE 60-SECOND PATTERN DETECTOR

Whenever you see a problem, ask these 5 questions in order:
🔍 1. WHAT IS THE INPUT TYPE?

This alone eliminates 50% of confusion.

Input	Likely Pattern
Array / String	Sliding Window / Two Pointers / DP
Tree	DFS / BFS
Graph	BFS / DFS / Topo Sort
Linked List	Two pointers / reversal
Intervals	Sorting + merging
👉 Example:
“Grid of 1s and 0s”
→ That’s a graph disguised as matrix

🎯 2. WHAT IS THE QUESTION ASKING?

Focus on keywords:

Keyword	Pattern
“Longest / Shortest”	Sliding Window / DP
“All combinations”	Backtracking
“Kth / Top K”	Heap
“Connected components”	Graph
“Max/Min ways”	DP
“Next greater”	Monotonic Stack

👉 Example:
“Find ALL subsets”
→ instantly Backtracking

🔁 3. DO I NEED ALL ANSWERS OR ONE?
Requirement	Pattern
All possible answers	Backtracking
Just one optimal answer	Greedy / DP / BFS

👉 Example:
“Return all permutations”
→ Backtracking (no doubt)

⏱️ 4. IS THERE A WINDOW / CONTINUOUS RANGE?

If YES → 90% chance it's:

👉 Sliding Window

👉 Clues:

“substring”
“subarray”
“contiguous”

🔄 5. CAN I REUSE PREVIOUS RESULTS?

If YES → it’s:

👉 Dynamic Programming

👉 Clues:

overlapping subproblems
repeated computation
“minimum steps”, “number of ways”

⚡ PUTTING IT TOGETHER (REAL EXAMPLE)
Problem:

“Longest substring without repeating characters”

Apply system:
Input → String → (array category)
Keyword → “Longest”
Continuous? → Yes (substring)
Reuse results? → No

👉 FINAL: Sliding Window

🔥 ANOTHER EXAMPLE
Problem:

“Course Schedule (can you finish all courses?)”

Input → Graph
Keyword → dependencies
Cycles? → yes

👉 FINAL: Graph + Topological Sort

🧩 ONE MORE
Problem:

“Generate all combinations that sum to target”

Input → Array
Keyword → “ALL combinations”

👉 FINAL: Backtracking

🚨 COMMON MISTAKE

People jump into coding without asking:

👉 “Which pattern is this?”

That’s why they get stuck.



🧠 MENTAL SHORTCUT (VERY IMPORTANT)

Train your brain like this:

“Substring?” → Sliding window
“All combinations?” → Backtracking
“Kth largest?” → Heap
“Tree?” → DFS/BFS
“Reuse results?” → DP

🎯 PRACTICE RULE

For next 20 problems:

👉 Don’t code immediately
👉 First say OUT LOUD:

“This is a ___ pattern problem because ___”

🔥 FINAL TRUTH

If you master this:

👉 You can solve unseen problems
👉 You won’t panic in interviews
👉 You’ll think like a top candidate