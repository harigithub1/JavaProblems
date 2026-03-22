package medium;

//Pattern: Array Reversal Pattern (In-Place Rotation using 3 Reversals)
public class LC189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n - k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
