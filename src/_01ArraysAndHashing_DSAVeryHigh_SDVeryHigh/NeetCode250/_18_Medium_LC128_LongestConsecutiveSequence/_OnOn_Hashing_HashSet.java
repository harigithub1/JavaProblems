package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._18_Medium_LC128_LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class _OnOn_Hashing_HashSet {
    public static int longestConsecutiveSequenceLength(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int maxCount = 0;
        for (int n : set) {
            // Only start if it's the beginning of a sequence
            if (!set.contains(n - 1)) {
                int startPointer = n;
                int count = 1;
                // Expand sequence
                while (set.contains(startPointer + 1)) {
                    count++;
                    startPointer++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        int[] nums = {0, -1, 1, 2, -2, 3, 4};
        System.out.println(longestConsecutiveSequenceLength(nums));
    }
}