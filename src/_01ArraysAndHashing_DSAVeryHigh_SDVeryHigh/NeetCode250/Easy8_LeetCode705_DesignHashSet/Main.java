package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250.Easy8_LeetCode705_DesignHashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);

        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(3)); // false

        set.remove(2);

        System.out.println(set.contains(2)); // false
    }
}
