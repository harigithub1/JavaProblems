package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._06_Easy_LC26_RemoveDuplicatesFromSortedArray;

public class OnO1_TwoPointers_FastAndSlowPointers_V1 {
    public static int removeDuplicatesAndGetUniqueCount(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res=1;
        int l1 = 0, l2 = 1;
        int r = nums.length-1;
        while (l2 <= r) {
            if (nums[l1] != nums[l2]) {
                nums[l1+1] = nums[l2];
                l1++;
                res++;
            }
            l2++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicatesAndGetUniqueCount(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
    }
}