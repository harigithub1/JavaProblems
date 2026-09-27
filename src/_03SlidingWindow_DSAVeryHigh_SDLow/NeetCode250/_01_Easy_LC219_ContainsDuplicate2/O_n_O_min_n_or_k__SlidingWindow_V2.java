package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC219_ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

public class O_n_O_min_n_or_k__SlidingWindow_V2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (right - left > k) {
                set.remove(nums[left]);
                left++;
            }
            if (set.contains(nums[right])) {
                return true;
            }
            set.add(nums[right]);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {7, 1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}