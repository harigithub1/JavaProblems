package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._07_Medium_LC167_TwoSum2_SortedArray;

import java.util.Arrays;

public class OnO1_TwoPointers_OppositeDirectionPointers {
    /*
    The problem statement guarantees:
    Exactly one solution exists.
     */
    public static int[] twoSum2SortedInputArray(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if(sum==target){
                return new int[]{l, r};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        throw new IllegalArgumentException("No two sum solution for given input array");
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 10};
        int target = 12;
        int[] result = twoSum2SortedInputArray(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}