package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._06_Easy_LC26_RemoveDuplicatesFromSortedArray;

public class OnO1_TwoPointers_FastAndSlowPointers_V2 {
    public static int removeDuplicatesAndGetUniqueCount(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length-1;
        int k = 1;
        while (k <= r) {
            if (nums[l] != nums[k]) {
                nums[l +1] = nums[k];
                l++;
            }
            k++;
        }
        return l+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicatesAndGetUniqueCount(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
    }
}