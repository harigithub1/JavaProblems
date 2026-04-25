package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.*;

public class Medium6_LC128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Step 1: Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        // Step 2: Iterate through numbers
        for (int num : set) {
            // Only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                // Expand sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    // 🔽 Main method for testing
    public static void main(String[] args) {
        Medium6_LC128_LongestConsecutiveSequence obj =
                new Medium6_LC128_LongestConsecutiveSequence();
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, -1, 1, 2, -2, 3, 4};
        System.out.println("Output 1: " + obj.longestConsecutive(nums1)); // 4
        System.out.println("Output 2: " + obj.longestConsecutive(nums2)); // 7
    }
}