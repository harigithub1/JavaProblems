package _05LinkedList._1easy.LC141_LinkedListCycle;

public class Main {
        public static boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;          // move 1 step
                fast = fast.next.next;     // move 2 steps

                //here we are comparing the nodes not its values, to check you can pass all values as 4,4,4,4 instead of 3,2,0,-4
                if (slow == fast) {
                    return true;           // cycle detected
                }
            }
            return false;                  // no cycle
        }

        public static void main(String args[]){
            ListNode head = new ListNode(3);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(0);
            ListNode fourth = new ListNode(-4);
            head.next=second;
            second.next=third;
            third.next=fourth;

            int pos = 1;

            // 🔥 Create cycle manually
            if (pos == 0) fourth.next = head;
            else if (pos == 1) fourth.next = second;
            else if (pos == 2) fourth.next = third;
            else if (pos == 3) fourth.next = fourth;

            System.out.println(hasCycle(head));
        }
    }
/**
 * The technique used here is:
 *
 * 🔥 Fast & Slow Pointer (Two-Pointer / Floyd’s Cycle Detection)
 */