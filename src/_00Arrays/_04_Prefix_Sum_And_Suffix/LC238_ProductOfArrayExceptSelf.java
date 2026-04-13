package _00Arrays._04_Prefix_Sum_And_Suffix;

public class LC238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix product (from right)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

    // quick test
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}
/**
 * Prefix–Suffix (Cumulative Product) Pattern
 *
 * 🧠 Related Patterns
 * This problem belongs to a broader category:
 * ✅ Prefix Sum / Prefix Product
 * ✅ Precomputation Arrays
 * ✅ Two-pass array traversal
 * ✅ Space optimization (using output array)
 */