package _04Stack_DSAHigh_SDLow.Neetcode250._02_Easy_LC20_ValidParanthesis;

import java.util.HashSet;
import java.util.Set;

public class Stack {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for (int currIdx = 0; currIdx < nums.length; currIdx++) {
            if (currIdx - left > k) {
                set.remove(nums[left]);
                left++;
            }
            if (set.contains(nums[currIdx])) {
                return true;
            }
            set.add(nums[currIdx]);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {7, 1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}