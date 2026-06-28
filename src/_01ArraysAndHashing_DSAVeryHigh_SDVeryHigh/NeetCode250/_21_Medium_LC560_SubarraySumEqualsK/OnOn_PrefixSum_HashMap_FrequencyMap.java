package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

import java.util.*;

//refer video https://www.youtube.com/watch?v=xvNwoz-ufXA for understanding
public class OnOn_PrefixSum_HashMap_FrequencyMap {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum = prefixSum + nums[i];
            if (map.containsKey(prefixSum - k)) {
                count = count + map.get(prefixSum - k);
            }
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