package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC219_ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

public class O_n_O_min_n_or_k__SlidingWindow {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        // here variable currIndex is current index
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            if (currIndex - left > k) {
                set.remove(nums[left]);
                left++;
            }
            if (set.contains(nums[currIndex])) {
                return true;
            }
            set.add(nums[currIndex]);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {7, 1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}