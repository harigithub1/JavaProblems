package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._36_Easy_LC219_ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

public class O_n_O_min_n_or_k__SlidingWindow {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int l = 0;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (currentIndex - l > k) {
                set.remove(nums[l]);
                l++;
            }
            if (set.contains(nums[currentIndex])) {
                return true;
            }
            set.add(nums[currentIndex]);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {7, 1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}