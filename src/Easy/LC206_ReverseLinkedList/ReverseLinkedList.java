package Easy.LC206_ReverseLinkedList;
public class ReverseLinkedList {
    // Reverse function (Iterative)
    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            //Save the next node
            ListNode nextNode = currNode.next;
            //Reverse the pointer
            currNode.next = prevNode;
            //Move prevNode forward
            prevNode = currNode;
            //Move currNode forward using saved reference
            currNode = nextNode;
        }
        return prevNode;
    }
    public static ListNode reverseList2(ListNode head) {
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while(currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
//        head = prevNode;
        return prevNode;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);

        // Recreate the list
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // Reverse the list
        ListNode reversedHead2 = reverseList2(head);

        System.out.println("Reversed List2:");
        printList(reversedHead2);
    }
}
