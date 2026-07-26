package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._05_Easy_LC88_MergeSortedArray;

import java.util.Arrays;

public class OnplusmO1_TwoPointersBackwardMerge_PlusWritePointer {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;
        int k = m + n - 1;
        while (r1 >= 0 && r2 >= 0) {
            if (nums1[r1] > nums2[r2]) {
                nums1[k] = nums1[r1];
                r1--;
            } else {
                nums1[k] = nums2[r2];
                r2--;
            }
            k--;
        }
        // Copy any remaining elements from nums2
        while (r2 >= 0) {
            nums1[k] = nums2[r2];
            r2--;
            k--;
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;
        int[] nums1 = {7,8,9,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        mergeSortedArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}