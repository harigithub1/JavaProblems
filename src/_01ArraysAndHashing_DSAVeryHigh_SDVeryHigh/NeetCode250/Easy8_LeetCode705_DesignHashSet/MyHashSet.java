package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250.Easy8_LeetCode705_DesignHashSet;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> data;

    public MyHashSet() {
        data = new ArrayList<>();
    }

    public void add(int key) {
        if (!data.contains(key)) {
            data.add(key);
        }
    }

    public void remove(int key) {
        data.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return data.contains(key);
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(3)); // false

        myHashSet.add(2);
        System.out.println(myHashSet.contains(2)); // true

        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2)); // false
    }
}