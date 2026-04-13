package _01ArraysAndSlidingWindow.Arrays._03_Kadane_Algorithm;

public class LC053_MaximumSubArraySum {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend or restart
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
/**
 * ⚡ Pattern Name Summary
 * ✅ Primary Pattern: Dynamic Programming (_03_Kadane_Algorithm’s Algorithm)
 * ✅ Secondary Nature: _02_Greedy optimization
 *
 * 🧩 Where Else This Pattern Appears
 * You’ll see this same pattern in problems like:
 * Maximum product subarray
 * Stock buy/sell (profit tracking)
 * Maximum sum circular subarray
 * Continuous subarray problems
 */