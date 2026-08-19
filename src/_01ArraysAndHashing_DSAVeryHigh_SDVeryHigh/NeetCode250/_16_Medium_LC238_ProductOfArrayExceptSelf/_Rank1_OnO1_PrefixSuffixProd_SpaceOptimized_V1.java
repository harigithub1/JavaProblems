package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._16_Medium_LC238_ProductOfArrayExceptSelf;

public class _Rank1_OnO1_PrefixSuffixProd_SpaceOptimized_V1 {
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] prefProd = new int[l];
        prefProd[0] = 1;
        for (int i = 1; i < l; i++) {
            prefProd[i] = prefProd[i - 1] * nums[i - 1];
        }
        //now modifying prefProd so that we need not create another array for suffixProd
        int suffix = 1;
        for(int i =l-2;i>=0;i--){
            suffix = suffix*nums[i+1];
            prefProd[i]= prefProd[i]*suffix;
        }
        //now prefProd contains the output not actual prefixProduct values
        return prefProd;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}