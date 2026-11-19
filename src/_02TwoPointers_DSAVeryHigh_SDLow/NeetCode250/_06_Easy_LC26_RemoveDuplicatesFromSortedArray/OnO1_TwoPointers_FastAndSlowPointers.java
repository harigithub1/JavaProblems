package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._06_Easy_LC26_RemoveDuplicatesFromSortedArray;

public class OnO1_TwoPointers_FastAndSlowPointers {
    public static int removeDuplicatesAndGetUniqueCount(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int s = 0; //slow pointer
        int f = 1; //fast pointer
        while (f < nums.length) {
            if (nums[s] != nums[f]) {
                nums[s +1] = nums[f];
                s++;
            }
            f++;
        }
        return s +1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicatesAndGetUniqueCount(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
    }
}