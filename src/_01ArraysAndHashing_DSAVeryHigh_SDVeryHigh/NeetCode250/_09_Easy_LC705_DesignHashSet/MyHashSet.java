package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._09_Easy_LC705_DesignHashSet;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int val) {
        if (!list.contains(val)) {
            list.add(val);
        }
    }

    public void remove(int val) {
        //list.remove(val);                   remove by INDEX
        //list.remove(Integer.valueOf(val));  remove by VALUE
        list.remove(Integer.valueOf(val));
    }

    public boolean contains(int val) {
        return list.contains(val);
    }
}