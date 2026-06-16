package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._01_Easy_LC1929_ConcatenationofArray;

import java.util.Arrays;

public class _01_Easy_LC1929_ConcatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] res = new int[l*2];
        for (int i = 0; i < l; i++) {
            res[i] = nums[i];
            res[i + l] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}