package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._02_Easy_LC217_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;
/*
 O(n),O(n)
 Pattern: Hashing
 Data Structure: HashSet
 */
public class LC217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}