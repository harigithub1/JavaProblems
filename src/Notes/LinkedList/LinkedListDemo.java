package Notes.LinkedList;

public class LinkedListDemo {

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
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
 */