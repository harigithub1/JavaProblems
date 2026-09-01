package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC219ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

public class O_n_O_min_n_or_k__SlidingWindow {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                set.remove(nums[l]);
                l++;
            }
            if (set.contains(nums[r])) {
                return true;
            }
            set.add(nums[r]);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}