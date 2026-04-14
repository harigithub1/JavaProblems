package _03TwoPointers;

public class LC283_MoveZeroes {
    // O(n) time, O(1) space
    public static void moveZeroes(int[] nums) {
        int i = 0; //last non zero index

        // Move non-zero elements forward
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill remaining elements with 0
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

/**
 *     // Pattern:Two Pointer Technique
 */