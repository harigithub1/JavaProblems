package Easy.LC206_ReverseLinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        System.out.println("Original List:");
        sol.printList(head);

        // Reverse the list
        ListNode reversedHead = sol.reverseList(head);

        System.out.println("Reversed List:");
        sol.printList(reversedHead);

        // Recreate the list
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // Reverse the list
        ListNode reversedHead2 = sol.reverseList2(head);

        System.out.println("Reversed List2:");
        sol.printList(reversedHead2);
    }

}
