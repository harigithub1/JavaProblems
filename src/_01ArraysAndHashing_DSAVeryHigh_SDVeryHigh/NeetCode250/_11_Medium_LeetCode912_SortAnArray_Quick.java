package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;
//quick sort
public class _11_Medium_LeetCode912_SortAnArray_Quick {
    private static int partition(int[] nums, int left, int right) {
        int mid = (left + right) >> 1;
        swap(nums, mid, left + 1);
        if (nums[left] > nums[right])
            swap(nums, left, right);
        if (nums[left + 1] > nums[right])
            swap(nums, left + 1, right);
        if (nums[left] > nums[left + 1])
            swap(nums, left, left + 1);
        int pivot = nums[left + 1];
        int i = left + 1;
        int j = right;
        while (true) {
            while (nums[++i] < pivot) ;
            while (nums[--j] > pivot) ;
            if (i > j) break;
            swap(nums, i, j);
        }
        nums[left + 1] = nums[j];
        nums[j] = pivot;
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (right <= left + 1) {
            if (right == left + 1 && nums[right] < nums[left])
                swap(nums, left, right);
            return;
        }
        int j = partition(nums, left, right);
        quickSort(nums, left, j - 1);
        quickSort(nums, j + 1, right);
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