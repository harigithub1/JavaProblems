package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._06_Easy_LC26_RemoveDuplicatesFromSortedArray;

// leetcode 26
public class OnO1_TwoPointers_FastAndSlowPointers_AlternativeSol {
    public static int getUniqueCountAfterDupRemov(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        int k = 1;
        while (k <= r) {
            // Find the next different element
            while (k <= r && nums[l] == nums[k]) {
                k++;
            }
            // No more unique elements
            if (k > r) {
                break;
            }
            nums[l + 1] = nums[k];
            l++;
            k++;
        }
        return l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2};
        int u = getUniqueCountAfterDupRemov(nums);
        for (int i = 0; i < u; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}