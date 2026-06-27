package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._16_Medium_LC238_ProductOfArrayExceptSelf;

public class _Rank2_OnOn_PrefixAndSuffix {
    public static int[] productExceptSelf(int[] nums) {

        int l = nums.length;

        int[] prefix = new int[l];
        int[] suffix = new int[l];
        int[] res = new int[l];

        // Build prefix array
        prefix[0] = 1;
        for (int i = 1; i < l; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Build suffix array
        suffix[l - 1] = 1;
        for (int i = l - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Multiply prefix and suffix
        for (int i = 0; i < l; i++) {
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}