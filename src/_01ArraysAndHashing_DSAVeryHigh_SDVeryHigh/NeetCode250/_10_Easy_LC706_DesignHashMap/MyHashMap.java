package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._10_Easy_LC706_DesignHashMap;

import java.util.Arrays;

public class MyHashMap {
    private int[] arr;

    public MyHashMap() {
        arr = new int[1000001];
        Arrays.fill(arr, -1); //initializes every key as "not present", because 0 is a valid value in the problem.
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}