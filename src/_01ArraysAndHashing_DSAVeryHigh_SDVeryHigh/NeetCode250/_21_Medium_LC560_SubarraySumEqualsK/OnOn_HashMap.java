package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

public class OnOn_HashMap {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
//        int[] nums = {1, 2, 3};
//        int[] nums = {1, -1, 0};
//        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
//        int[] nums = {1};
        int k = 2;
        System.out.println(subarraySum(nums, k)); // 2
    }
}