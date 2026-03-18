package Practice;

public class ReverseLinkedListDemo {
    public static void printList(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode currNode = head;
        ListNode prevNode = null;
        while (currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next=second;
        second.next=third;
        third.next=fourth;
        ListNode result= reverseList(head);
        printList(result);
    }
}
