package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._04_Easy_LC001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class OnOn_HashMapOnePass {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 11, 15};
        int target = 30;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
//we should not implement twoSum2SortedInputArray using containsValue, because its O(n2) since it involves loops

/*
 * Design choice:
 * If multiple valid pairs exist, this method returns
 * the first pair found while scanning from left to right.
 */