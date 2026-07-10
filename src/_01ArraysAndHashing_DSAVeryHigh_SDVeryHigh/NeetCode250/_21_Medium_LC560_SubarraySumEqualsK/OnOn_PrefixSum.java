package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

//refer takeUForward video https://www.youtube.com/watch?v=xvNwoz-ufXA for understanding
public class OnOn_PrefixSum {
    public static int noOfSubArraysWithSumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentPrefixSum = 0;
        int count = 0;
        map.put(0, 1);

        // For a subarray with sum = k to exist, this condition must be true:
        //
        // currentPrefixSum - previousPrefixSum = k
        //
        // The key is to determine which previousPrefixSum value satisfies this condition
        // and how many times that value has already appeared.
        // ********** Each occurrence represents one valid subarray ending at the current index.
        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum = currentPrefixSum + nums[i];
            if (map.containsKey(currentPrefixSum - k)) {
                count = count + map.get(currentPrefixSum - k);
            }
            map.put(currentPrefixSum, map.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(noOfSubArraysWithSumK(nums, k));
    }
}