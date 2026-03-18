package Practice;

public class Main {
    public static void printList(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static ListNode mergeList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(110);
        ListNode currNode = dummy;
        while(list1!=null&&list2!=null) {
            if (list1.val <= list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            } else {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode=currNode.next;
        }

        if(list1!=null){
            currNode.next=list1;
        } else if(list2!=null){
            currNode.next=list2;
        }
        return dummy.next;

    }
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);

        list1.next=second;
        second.next=third;

        ListNode list2 = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(4);
        list2.next=second2;
        second2.next=third2;

        ListNode mergedListHead = mergeList(list1,list2);
        printList(mergedListHead);

    }
}
