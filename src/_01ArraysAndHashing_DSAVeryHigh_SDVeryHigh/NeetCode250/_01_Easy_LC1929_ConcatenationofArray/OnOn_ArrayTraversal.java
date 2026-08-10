package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._01_Easy_LC1929_ConcatenationofArray;

public class OnOn_ArrayTraversal {
    public static int[] getConcatenatedArray(int[] nums) {
        int length = nums.length;
        int[] res = new int[length *2];
        for (int i = 0; i < length; i++) {
            res[i] = nums[i];
            res[i + length] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] res = getConcatenatedArray(nums);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}