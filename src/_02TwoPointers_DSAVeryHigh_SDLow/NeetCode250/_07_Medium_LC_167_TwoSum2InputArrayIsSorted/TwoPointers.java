package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._07_Medium_LC_167_TwoSum2InputArrayIsSorted;

import java.util.Arrays;

public class TwoPointers {
    public static int[] twoSum2SortedInputArray(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2SortedInputArray(nums, target)));
    }
}