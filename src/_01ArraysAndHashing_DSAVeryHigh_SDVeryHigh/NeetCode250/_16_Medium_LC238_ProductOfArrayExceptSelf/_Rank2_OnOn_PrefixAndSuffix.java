package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._16_Medium_LC238_ProductOfArrayExceptSelf;

public class _Rank2_OnOn_PrefixAndSuffix {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefProd = new int[nums.length];
        int[] suffProd = new int[nums.length];
        int[] res = new int[nums.length];
        // Build prefProd array
        prefProd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefProd[i] = prefProd[i - 1] * nums[i - 1];
        }
        // Build suffProd array
        suffProd[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffProd[i] = suffProd[i + 1] * nums[i + 1];
        }
        // Multiply prefProd and suffProd
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefProd[i] * suffProd[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}