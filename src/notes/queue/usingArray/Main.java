package notes.queue.usingArray;
class Main {
    int front, rear, size;
    int capacity;
    int[] arr;

    Main(int capacity) {
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
}