package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250.Easy8_LeetCode705_DesignHashSet;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> data;

    public MyHashSet() {
        data = new ArrayList<>();
    }

    public void add(int val) {
        if (!data.contains(val)) {
            data.add(val);
        }
    }

    public void remove(int val) {
        data.remove(Integer.valueOf(val));
    }

    public boolean contains(int val) {
        return data.contains(val);
    }
}