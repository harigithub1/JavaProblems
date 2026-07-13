package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._05_Easy_LC88_MergeSortedArray;

import java.util.Arrays;

public class OnplusmO1_TwoPointersBackwardMerge_PlusWritePointer {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // Copy any remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
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