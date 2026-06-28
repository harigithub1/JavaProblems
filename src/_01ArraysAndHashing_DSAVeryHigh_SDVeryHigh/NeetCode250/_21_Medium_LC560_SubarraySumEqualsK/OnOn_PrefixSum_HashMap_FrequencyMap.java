package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;
//refer below video
//https://www.youtube.com/watch?v=xvNwoz-ufXA
public class OnOn_PrefixSum_HashMap_FrequencyMap {
    public static int subarraySum(int[] nums, int k) {

        // Stores:
        // Key   -> Prefix Sum
        // Value -> Number of times this prefix prefixSum has occurred
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix prefixSum = 0 exists once before processing any element.
        // This handles cases where a subarray starting from index 0 has prefixSum = k.
        map.put(0, 1);

        // Running prefix prefixSum
        int prefixSum = 0;

        // Total number of subarrays whose prefixSum equals k
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Calculate current prefix prefixSum
            prefixSum = prefixSum +  nums[i];

            if (map.containsKey(prefixSum - k)) {

                // Add all possible subarrays ending at current index
                count = count + map.get(prefixSum - k);
            }

            /*
             * Store the current prefix prefixSum.
             *
             * If the same prefix prefixSum appears multiple times,
             * increase its frequency.
             */
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(subarraySum(nums, k));

//        int[] nums = {3,-3,1,1,1};
//        int k = 3;
//        System.out.println(subarraySum(nums, k));

    }
}