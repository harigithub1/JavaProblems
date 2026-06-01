package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

// Quick Sort using:
// 1. Median-of-three pivot selection
// 2. Hoare-style partitioning
// 3. Sentinel optimization
public class _11_Medium_LeetCode912_SortAnArray_Quick {

    // Partition function:
    // Rearranges elements around pivot
    // Returns final pivot index
    private static int partition(int[] nums, int l, int r) {

        int m = l + (r - l) / 2;

        // Move middle element to l+1 position
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

        // Ensure left <= right
        if (nums[l] > nums[r])
            swap(nums, l, r);

        // Ensure left <= middle
        if (nums[l] > nums[l + 1])
            swap(nums, l, l + 1);

        // Ensure middle <= right
        if (nums[l + 1] > nums[r])
            swap(nums, l + 1, r);

        // Median value becomes pivot
        int pivot = nums[l + 1];

        // i scans from left side
        int i = l + 1;

        // j scans from right side
        int j = r;

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
            if (i > j)
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

    // Utility swap function
    private static void swap(int[] nums, int x, int y) {
        if (x == y)
            return;
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    // Recursive quick sort
    private static void quickSort(int[] nums, int l, int r) {

        // ---------------------------------------------------
        // Base Case Optimization
        // Handles arrays of size:
        // 0
        // 1
        // 2
        // ---------------------------------------------------

        if (l + 1 >= r) {
            // Special handling for size 2 array
            // Example:
            // [9,3] -> swap -> [3,9]
            if (l + 1 == r && nums[l] > nums[r])
                swap(nums, l, r);
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
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
//        int[] nums = {9,1,8,2,7,3,6,4,5};
//        int[] nums = {1,2,3,4,5,6,7,8};
//        int[] nums = {5,5,5,5,5,5};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}