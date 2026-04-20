package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

public class Medium4_LC238_ProductOfArrayExceptSelf {
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
            result[i] = result[i]*suffix;
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
 * nums = [1, 2, 3, 4]
 * result[0]=1
 * first for loop
 * i=1, result[1]=1*1=1
 * i=2, result[2]=1*2=2
 * i=3, result[3]=2*3=6
 * suffix=1
 * second for loop
 * i=3, result[3]=6*1=6, suffix=1*4=4
 * i=2, result[2]=2*4=8, suffix=4*3=12
 * i=1, result[1]=1*12=12, suffix=12*2=24
 * i=0, result[0]=1*24=24, suffix=24*1=24
 *
 * 🧠 Related Patterns
 * This problem belongs to a broader category:
 * ✅ Prefix Sum / Prefix Product
 * ✅ Precomputation Arrays
 * ✅ Two-pass array traversal
 * ✅ Space optimization (using output array)
 */