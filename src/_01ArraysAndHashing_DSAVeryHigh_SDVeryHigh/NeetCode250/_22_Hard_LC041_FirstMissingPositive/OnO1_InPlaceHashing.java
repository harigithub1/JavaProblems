package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class OnO1_InPlaceHashing {

    public static int firstMissingPositive(int[] nums) {
        int l = nums.length;

        // Remove negatives
        for (int i = 0; i < l; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        // Mark existing numbers [1..l]
        for (int i = 0; i < l; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= l) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                } else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (l + 1);
                }
            }
        }

        // First unmarked index is the answer
        for (int i = 1; i <= l; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }
        }

        // All numbers 1..l exist
        return l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
//        int[] nums = {3, 4, -1, 1};
//        int[] nums = {1, 0};
//        int[] nums = {1, 1};
        System.out.println(firstMissingPositive(nums));
    }
}