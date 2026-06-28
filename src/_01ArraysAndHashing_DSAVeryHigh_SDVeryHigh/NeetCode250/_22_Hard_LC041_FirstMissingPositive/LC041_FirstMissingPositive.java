package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class LC041_FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Remove negatives
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        // Mark existing numbers [1..n]
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= n) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                } else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (n + 1);
                }
            }
        }

        // First unmarked index is the answer
        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }
        }

        // All numbers 1..n exist
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
//        int[] nums = {3, 4, -1, 1};
//        int[] nums = {7, 8, 9, 11, 12};
//        int[] nums = {1, 2, 3};
        System.out.println(firstMissingPositive(nums)); // 4
    }
}