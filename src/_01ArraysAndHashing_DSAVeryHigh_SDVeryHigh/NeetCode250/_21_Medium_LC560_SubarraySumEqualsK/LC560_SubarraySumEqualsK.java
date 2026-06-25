package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

public class LC560_SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int res = 0, curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            curSum += num;
            int diff = curSum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(subarraySum(nums1, k1)); // 2

        // Test Case 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(subarraySum(nums2, k2)); // 2

        // Test Case 3
        int[] nums3 = {1, -1, 0};
        int k3 = 0;
        System.out.println(subarraySum(nums3, k3)); // 3

        // Test Case 4
        int[] nums4 = {3, 4, 7, 2, -3, 1, 4, 2};
        int k4 = 7;
        System.out.println(subarraySum(nums4, k4)); // 4

        // Test Case 5
        int[] nums5 = {1};
        int k5 = 1;
        System.out.println(subarraySum(nums5, k5)); // 1

        // Test Case 6
        int[] nums6 = {1};
        int k6 = 0;
        System.out.println(subarraySum(nums6, k6)); // 0
    }
}