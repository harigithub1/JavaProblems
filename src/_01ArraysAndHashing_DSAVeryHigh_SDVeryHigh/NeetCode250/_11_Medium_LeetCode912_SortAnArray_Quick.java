package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;
//quick sort
public class _11_Medium_LeetCode912_SortAnArray_Quick {
    private static int partition(int[] nums, int l, int r) {
        int mid = (l + r) >> 1;
        swap(nums, mid, l + 1);
        if (nums[l] > nums[r])
            swap(nums, l, r);
        if (nums[l + 1] > nums[r])
            swap(nums, l + 1, r);
        if (nums[l] > nums[l + 1])
            swap(nums, l, l + 1);
        int pivot = nums[l + 1];
        int i = l + 1;
        int j = r;
        while (true) {
            while (nums[++i] < pivot) ;
            while (nums[--j] > pivot) ;
            if (i > j) break;
            swap(nums, i, j);
        }
        nums[l + 1] = nums[j];
        nums[j] = pivot;
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void quickSort(int[] nums, int l, int r) {
        if (r <= l + 1) {
            if (r == l + 1 && nums[r] < nums[l])
                swap(nums, l, r);
            return;
        }
        int j = partition(nums, l, r);
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, r);
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        int[] nums = {6, 3, 9, 5, 2, 8};
        int[] result = sortArray(nums);
        System.out.println(Arrays.toString(result));
    }
}