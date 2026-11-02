package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._09_Easy_LC705_DesignHashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(3)); // false

        myHashSet.remove(2);

        System.out.println(myHashSet.contains(2)); // false
    }
}
