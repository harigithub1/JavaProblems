package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._10_Medium_LC189_RotateArray;

public class OnO1_ThreeReversalAlgorithm_TwoPointers {
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        OnO1_ThreeReversalAlgorithm_TwoPointers obj = new OnO1_ThreeReversalAlgorithm_TwoPointers();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        obj.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
