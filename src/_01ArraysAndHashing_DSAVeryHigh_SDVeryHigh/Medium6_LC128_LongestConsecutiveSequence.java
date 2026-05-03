package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.*;

public class Medium6_LC128_LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for (int s : set) {
            // Only start if it's the beginning of a sequence
            if (!set.contains(s - 1)) {
                int currentNum = s;
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
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, -1, 1, 2, -2, 3, 4};
        System.out.println("Output 1: " + longestConsecutive(nums1)); // 4
        System.out.println("Output 2: " + longestConsecutive(nums2)); // 7
    }
}