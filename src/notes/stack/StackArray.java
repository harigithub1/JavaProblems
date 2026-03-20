package notes.stack;

//🚀 1. stack Using Array (Most Important)
class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop
    public int pop() {
        if (top == -1) {
            System.out.println("stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    public int peek() {
        if (top == -1) {
            System.out.println("stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }
}