package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

import java.util.*;

public class On2Ologn_DivideAndConquer_HoaresPartition_QuickSort {

    private static int partition(int[] nums, int l, int r) {
        int m = l + (r - l) / 2;

        // Move middle element to l+1 position.
        // This implementation keeps pivot candidate at l+1
        swap(nums,l + 1, m);

        // ---------------------------------------------------
        // Median-of-three ordering
        // After these 3 conditions:
        // nums[l] <= nums[l+1] <= nums[r]
        // So:
        // nums[l+1] becomes median value (pivot)
        // nums[l] and nums[r] act as sentinels
        // ---------------------------------------------------
        if (nums[l] > nums[r])
            swap(nums, l, r);
        if (nums[l] > nums[l + 1])
            swap(nums, l, l + 1);
        if (nums[l + 1] > nums[r])
            swap(nums, l + 1, r);

        int pivot = nums[l + 1];
        int i = l + 1;
        int j = r;

        //Hoarse's partition
        // Infinite loop until pointers cross
        while (true) {
            // Move i once to start scanning after pivot
            i++;
            // Move j once to start scanning from right side
            j--;
            // Keep moving right while elements are smaller than pivot
            while (nums[i] < pivot) {
                i++;
            }
            // Keep moving left while elements are larger than pivot
            while (nums[j] > pivot) {
                j--;
            }
            // If pointers crossed, partition complete
            if (i >= j)
                break;
            // Swap two misplaced elements
            //
            // Left side found element >= pivot
            // Right side found element <= pivot
            swap(nums, i, j);
        }

        // Move pivot from l+1 into its final position
        swap(nums, l + 1, j);

        // Return pivot index
        return j;
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    private static void quickSort(int[] nums, int l, int r) {

        // ---------------------------------------------------
        // Base Case Optimization
        // Handles arrays of size:
        // 0
        // 1
        // 2
        // ---------------------------------------------------

        if (l == r)
            return;
        if (r == l + 1) {
            if (nums[l] > nums[r]) {
                swap(nums, l, r);
            }
            return;
        }

        // Partition array and get pivot index
        int pIdx = partition(nums, l, r);

        // Recursively sort left half
        quickSort(nums, l, pIdx - 1);

        // Recursively sort right half
        quickSort(nums, pIdx + 1, r);
    }

    public static int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
//        int[] nums = {9,1,8,2,7,3,6,4,5};
//        int[] nums = {1,2,3,4,5,6,7,8};
//        int[] nums = {5,5,5,5,5,5};
        int[] result = sortArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}