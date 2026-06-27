package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

public class OnOn_HashMap {
    public static int subarraySum(int[] nums, int k) {
        int res = 0, curSum = 0;
        //map is prefixSums
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int n : nums) {
            curSum = curSum + n;
            int diff = curSum - k;
            res = res + map.getOrDefault(diff, 0);
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }

        return res;
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