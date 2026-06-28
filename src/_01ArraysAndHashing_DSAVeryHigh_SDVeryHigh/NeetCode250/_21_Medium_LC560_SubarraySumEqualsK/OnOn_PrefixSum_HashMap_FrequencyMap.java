package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

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

        for (int n : nums) {
            // Calculate current prefix prefixSum
            prefixSum = prefixSum + n;
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

//        // 1. Subarray starts at index 0 (map.put(0, 1))
//        int[] nums = {3};
//        int k = 3;
//
//        // 2. Basic prefix sum lookup
//        int[] nums = {1, 1, 1};
//        int k = 2;
//
//        // 3. Multiple valid subarrays
//        int[] nums = {1, 2, 3};
//        int k = 3;
//
//        // 4. Negative numbers
//        int[] nums = {1, 2, -1, 2};
//        int k = 3;
//
//        // 5. Repeated prefix sums (frequency map)
//        int[] nums = {1, -1, 1, -1, 1};
//        int k = 0;

//        // 6. Complete example (covers almost everything)
//        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
//        int k = 7;

//        // 7. No answer
//        int[] nums = {1, 2, 3};
//        int k = 10;
    }
}