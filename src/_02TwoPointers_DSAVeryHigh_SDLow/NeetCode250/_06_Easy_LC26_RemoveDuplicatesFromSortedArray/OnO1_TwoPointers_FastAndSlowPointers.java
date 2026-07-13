package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._06_Easy_LC26_RemoveDuplicatesFromSortedArray;

public class OnO1_TwoPointers_FastAndSlowPointers {
    public static int removeDuplicatesSortedArr(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicatesSortedArr(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}