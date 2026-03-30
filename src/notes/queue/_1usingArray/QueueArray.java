package notes.queue._1usingArray;
class QueueArray {
    int front, rear, size;
    int capacity;
    int[] arr;

    QueueArray(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " inserted");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    int front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    int rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front element: " + q.front());
        System.out.println("Rear element: " + q.rear());

        System.out.println(q.dequeue() + " removed");
        System.out.println(q.dequeue() + " removed");

        q.enqueue(60);
        q.enqueue(70);

        System.out.println("Front element: " + q.front());
        System.out.println("Rear element: " + q.rear());

        while (!q.isEmpty()) {
            System.out.println(q.dequeue() + " removed");
        }
    }
}