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
            //main logic
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= l) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                } else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (l + 1);
                }
                // if (nums[val - 1] < 0) we do nothing
            }
        }
        // First unmarked index is the answer
        for (int i = 0; i < l; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        // All numbers 1..l exist
        return l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, -2, 1, 0, 2, 2, 6, 10, 4};
        System.out.println(firstMissingPositive(nums));
    }
}