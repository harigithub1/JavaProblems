package Easy.LC206_ReverseLinkedList;
public class Solution {
    // Reverse function (Iterative)
    public ListNode reverseListVersion1(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            //to preserve the address of the next pointer since currentnode.next will be pointed to previous node
            ListNode nextNode = currNode.next;

            //reversing
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
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

}
