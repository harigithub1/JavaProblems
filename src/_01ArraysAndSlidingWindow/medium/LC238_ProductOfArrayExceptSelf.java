package _01ArraysAndSlidingWindow.medium;

public class LC238_ProductOfArrayExceptSelf {
    public static int[] prodExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];

        // 1) out[i] will hold product of elements left of i
        out[0] = 1;
        for (int i = 1; i < n; i++) {
            out[i] = out[i - 1] * nums[i - 1];
        }

        // 2) multiply by product of elements right of i using a running suffix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            out[i] = out[i] * suffix;
            suffix *= nums[i];
        }

        return out;
    }

    // quick test
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] res = prodExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}
