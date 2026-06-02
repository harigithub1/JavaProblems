package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.Arrays;
//Three Pointers - I
public class _12_Medium_LC075_SortColors {
    public static void sortColors(int[] nums) {
        /*
        l → where next 0 goes
        r → where next 2 goes
        c → current element
         */
        int l = 0, r = nums.length - 1,c = 0;
        while (c <= r) {
            if (nums[c] == 0) {
                swap(nums, l, c);
                l++;
            } else if (nums[c] == 2) {
                swap(nums, c, r);
                r--;
                c--;
                /*
                In else if block, c-- is there because after swapping with r, the value that comes into index c is unknown(could be either 0 or 1) — so you must process that same index again.
                In if block, since we travel left → right, everything left of c is already processed, therefore swapping with l is safe without rechecking.
                 */
            }
            c++;
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0}; //explains the entire algorithm working together
        int[] nums = {1,2,0,0}; //explains why swapping with l does not need rechecking (and also why c-- is needed after swapping with r)
//        int[] nums = {1,1,2,0}; //explains why c-- is needed in else if block
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

