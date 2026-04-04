package _05LinkedList._1easy.LC206_ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * In Java, a node usually looks like this
 *     int val;        // data
 *     TreeNode next;  // address of next node
 *
 * 🖼 Visual Representation
 * Imagine this:
 * [1 | • ] → [2 | • ] → [3 | • ] → null
 * Each box has:
 * Left side = value
 * Right side = address of next node
 * The first node is called the head.
 *
 * 🚶 How Do We Traverse a Linked List?
 * We start from the head and move forward.
 * TreeNode temp = head;
 * while (temp != null) {
 *     System.out.println(temp.val);
 *     temp = temp.next;
 * }
 * This prints all values one by one.
 *
 * 🎯 Why Linked Lists Matter
 * They are used in:
 * Implementing stacks and queues
 * Graphs
 * Dynamic memory problems
 */