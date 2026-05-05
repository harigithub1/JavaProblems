package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.Arrays;

public class Easy1_LeetCode1929_ConcatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}

