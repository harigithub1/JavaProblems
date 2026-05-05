package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.Arrays;

public class Medium7_LC238_ProductOfArrayExceptSelf_Beginner {
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int[] pref = new int[l];
        int[] suff = new int[l];
        System.out.println(Arrays.toString(nums));

        pref[0] = 1;
        for (int i = 1; i < l; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        suff[l - 1] = 1;
        for (int i = l - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < l; i++) {
            res[i] = pref[i] * suff[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}
/**
 * pref[0] = 1
 * i=1 → pref[1] = nums[0] * pref[0] = 1 * 1 = 1
 * i=2 → pref[2] = nums[1] * pref[1] = 2 * 1 = 2
 * i=3 → pref[3] = nums[2] * pref[2] = 3 * 2 = 6
 *
 * suff[3] = 1
 * i=2 → suff[2] = nums[3] * suff[3] = 4 * 1 = 4
 * i=1 → suff[1] = nums[2] * suff[2] = 3 * 4 = 12
 * i=0 → suff[0] = nums[1] * suff[1] = 2 * 12 = 24
 *
 * res
 * i=0 → 1 * 24 = 24
 * i=1 → 1 * 12 = 12
 * i=2 → 2 * 4 = 8
 * i=3 → 6 * 1 = 6  
 */