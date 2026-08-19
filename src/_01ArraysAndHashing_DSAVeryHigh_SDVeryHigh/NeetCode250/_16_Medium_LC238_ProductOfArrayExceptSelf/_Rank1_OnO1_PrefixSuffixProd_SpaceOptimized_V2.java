package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._16_Medium_LC238_ProductOfArrayExceptSelf;

public class _Rank1_OnO1_PrefixSuffixProd_SpaceOptimized_V2 {
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        res[0] = 1;
        //storing prefix prod values
        for (int i = 1; i < l; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        //now modifying res so that we need not create another array for suffixProd
        int suffix = 1;
        for (int i = l - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }
        //now res contains the output not actual prefixProduct values
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}