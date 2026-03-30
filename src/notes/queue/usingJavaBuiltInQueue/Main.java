package notes.queue.usingJavaBuiltInQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20
    }
}