package notes.queue.usingLinkedList;

class Main {
    ListNode front, rear;

    Main() {
        front = rear = null;
    }

    void enqueue(int data) {
        ListNode temp = new ListNode(data);

        if (rear == null) {
            front = rear = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }
}