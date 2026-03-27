package practice;
public class Main{
    public static ListNode reverseList(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public static void printList(ListNode head){
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next=second;
        second.next =third;
        third.next=fourth;
        fourth.next=fifth;
        ListNode reversedList = reverseList(head);
        printList(reversedList);

    }
}