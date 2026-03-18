package Notes.Stack;

//🔗 2. Stack Using Linked List (Interview Favorite Twist)
class StackLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // Push
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }
}