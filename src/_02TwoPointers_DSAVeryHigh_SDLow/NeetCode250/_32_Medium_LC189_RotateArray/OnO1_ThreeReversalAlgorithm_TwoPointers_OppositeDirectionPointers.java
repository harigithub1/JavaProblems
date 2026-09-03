package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._32_Medium_LC189_RotateArray;

public class OnO1_ThreeReversalAlgorithm_TwoPointers_OppositeDirectionPointers {
    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int l =0;
        int r = nums.length-1;
        reverse(nums,l,r);
        reverse(nums,0,k-1);
        reverse(nums,k,r);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
