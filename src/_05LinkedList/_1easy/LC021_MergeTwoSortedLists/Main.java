package _05LinkedList._1easy.LC021_MergeTwoSortedLists;

public class Main {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node
        ListNode dummy = new ListNode(0);//here it need not be 0 it can be any number like 111. TreeNode dummy = new TreeNode(111);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        //merged list (starting from dummy.next)
        return dummy.next;
    }

    public static void main(String[] args) {
        // list1 = [1,2,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2 = [1,3,4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}