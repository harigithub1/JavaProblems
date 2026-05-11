package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._09_Easy_LeetCode706_DesignHashMap;

public class Main {
    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();

        // put operations
        myHashMap.put(1, 10);
        myHashMap.put(2, 20);

        // get operations
        System.out.println(myHashMap.get(1)); // 10
        System.out.println(myHashMap.get(2)); // 20
        System.out.println(myHashMap.get(3)); // -1

        // update value
        myHashMap.put(2, 50);
        System.out.println(myHashMap.get(2)); // 50

        // remove operation
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2)); // -1
    }}
