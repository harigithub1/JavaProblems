package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class _Rank1_OnO1_InPlaceHashing_V2 {
    public static int firstMissingPositive(int[] nums) {
        // Replace negative values and 0s with n + 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }

        // Mark numbers 1..n as negative at index val-1
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= nums.length) {
                //here using Math.abs again because nums[val - 1] might already be negative.
                nums[val - 1] = -Math.abs(nums[val - 1]);
            }
        }

        // First positive index represents the missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // if all numbers 1..n exist
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, -2, 1, 0, 2, 2, 6, 10, 4};
        System.out.println(firstMissingPositive(nums));
    }
}