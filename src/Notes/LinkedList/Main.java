package Notes.LinkedList;

public class Main {

    // Method to print the linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Step 1: Create first node (head)
        ListNode head = new ListNode(10);

        // Step 2: Create more nodes
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        // Step 3: Connect nodes
        head.next = second;
        second.next = third;

        // Now the list is:
        // 10 -> 20 -> 30 -> null

        // Step 4: Print the linked list
        System.out.println("Linked List:");
        printList(head);
    }
}

/**
 * 🔹 Step 1: Create nodes
 * ListNode node1 = new ListNode(1);
 * ListNode node2 = new ListNode(2);
 * ListNode node3 = new ListNode(3);
 * 🔹 Step 2: Connect them
 * node1.next = node2;
 * node2.next = node3;
 * 🔹 Step 3: Set head
 * ListNode head = node1;
 * 🖼 Visual View
 * [1 | • ] → [2 | • ] → [3 | null]
 *
 * 🧠 2️⃣ How It Actually Looks in RAM
 * Important: Linked lists are NOT stored in order in memory.
 * Address 1000 → [1 | 5000]
 * Address 5000 → [2 | 8000]
 * Address 8000 → [3 | null]
 * So in RAM it might look scattered:
 * 1000       5000       8000
 * [1|5000]   [2|8000]   [3|null]
 * The nodes are stored anywhere in memory.
 * The next variable stores the address of the next node.
 * That’s how they stay connected.
 *
 * 🆚 Why This Matters
 * Array memory:
 * 1000 1004 1008 1012
 * [1]  [2]  [3]  [4]
 * Linked list memory:
 * 1000      7000      2000
 * [1|7000]  [2|2000]  [3|null]
 * Array = continuous
 * Linked list = scattered but connected via references
 *
 * 🚶 How Traversal Works in Memory
 * When you do:
 * temp = temp.next;
 * You're basically saying:
 * 👉 “Go to the memory address stored in next.”
 *
 * 💡 Key Concept To Remember
 * A linked list is:
 * Data + Address of next data
 *
 * Prompt: ListNode node1 = new ListNode(1); what is happening here
 * ListNode node1 = new ListNode(1);
 * This single line does three important things.
 * 🔹 Step 1: ListNode node1
 * This declares a variable.
 * It means:
 * “I want a variable named node1 that can store a reference to a ListNode object.”
 * Important:
 * node1 does NOT store the actual node.
 * It stores the address (reference) of the node in memory.
 * Think of it like:
 * node1 → (will point somewhere in memory)
 * 🔹 Step 2: new ListNode(1)
 * This creates a new object in memory.
 * When Java sees:
 * new ListNode(1)
 * It:
 * Allocates memory in RAM
 * Calls the constructor
 * Sets:
 * val = 1
 * next = null
 * So in memory, something like this is created:
 * Address 5000:
 * [val = 1 | next = null]
 * 🔹 Step 3: Assignment =
 * Now Java stores that memory address inside node1.
 * So:
 * node1 → 5000
 * Now node1 is pointing to that object.
 * 🖼 Visual Representation
 * After this line:
 * ListNode node1 = new ListNode(1);
 * Memory looks like:
 * node1
 *    ↓
 * [1 | null]
 * ⚡ Very Important Concept
 * Java variables for objects store references, not actual objects.
 * So this is WRONG thinking:
 * ❌ node1 stores the node.
 * Correct thinking:
 * ✅ node1 stores the address of the node.

 * 🔎 Simple Analogy
 * Think of it like:
 * The object is a house.
 * The variable (node1) is the house address.
 *
 * In this line:
 * ListNode node1 = new ListNode(1);
 * 🔹 new ListNode(1)
 * This creates the object.
 * It builds a real thing in memory that looks like:
 * [val = 1 | next = null]
 * This object lives somewhere in RAM.
 * 🔹 node1
 * This is the reference variable.
 * It does NOT store the object itself.
 * It stores the address of that object.
 * So internally it’s like:
 * node1 → (address of object)
 * 🧠 Think of it like this:
 * new ListNode(1) → creates a house
 * node1 → stores the house address
 * You don’t store the house inside node1.
 * You store where the house is located.
 * 🔎 Important Detail
 * If you write:
 * ListNode node2 = node1;
 * Now both variables point to the SAME object.
 *
 * node1 ─┐
 *        ├──> [1 | null]
 * node2 ─┘
 *
 * No new object is created.
 *
 * 🚨 Very Common Beginner Confusion
 * This:
 * ListNode node1;
 * Only declares a variable.
 * No object is created yet.
 * This:
 * new ListNode(1);
 * Creates an object.
 * This:
 * ListNode node1 = new ListNode(1);
 * Creates an object AND stores its reference.
 */