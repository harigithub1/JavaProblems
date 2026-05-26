package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.Arrays;
//Three Pointers - I
public class _12_Medium_LeetCode075_SortColors {
    public static void sortColors(int[] nums) {
        /*
        l → where next 0 goes
        r → where next 2 goes
        i → current element
         */
        int i = 0, l = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, l, i);
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
                i--;
                /*
                In else if block, i-- is there because after swapping with r, the value that comes into index i is unknown — so you must process that same index again.
                In if block, since we travel left → right, everything left of i is already processed, therefore swapping with l is safe without rechecking.
                 */
            }
            i++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] nums = {1,2,0,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}