package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._09_Easy_LeetCode705_DesignHashSet;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(int val) {
        if (!set.contains(val)) {
            set.add(val);
        }
    }

    public void remove(int val) {
        set.remove(Integer.valueOf(val));
    }

    public boolean contains(int val) {
        return set.contains(val);
    }
}