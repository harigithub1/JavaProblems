package _01ArraysAndSlidingWindow.Arrays._01_Core_Patterns;

public class LC189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l; // to handle cases where k > n
        reverse(nums, 0, l - 1);         // Step 1: Reverse the whole array
        reverse(nums, 0, k - 1);         // Step 2: Reverse first k elements
        reverse(nums, k, l - 1);         // Step 3: Reverse remaining n - k elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
/**
 * Pattern: Array Reversal Pattern (In-Place Rotation using 3 Reversals)
 */