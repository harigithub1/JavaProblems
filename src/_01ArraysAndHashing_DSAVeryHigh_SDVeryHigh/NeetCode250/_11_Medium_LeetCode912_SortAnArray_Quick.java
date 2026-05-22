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
    private static int partition(int[] arr, int l, int r) {

        // Find middle index
        int mid = (l + r) / 2;

        // Move middle element to l+1 position
        // This implementation keeps pivot candidate at l+1
        swap(arr,l + 1, mid);

        // ---------------------------------------------------
        // Median-of-three ordering
        //
        // After these 3 conditions:
        //
        // arr[l] <= arr[l+1] <= arr[r]
        //
        // So:
        // arr[l+1] becomes median value (pivot)
        //
        // arr[l] and arr[r] act as sentinels
        // ---------------------------------------------------

        // Ensure left <= right
        if (arr[l] > arr[r])
            swap(arr, l, r);

        // Ensure left <= middle
        if (arr[l] > arr[l + 1])
            swap(arr, l, l + 1);

        // Ensure middle <= right
        if (arr[l + 1] > arr[r])
            swap(arr, l + 1, r);

        // Median value becomes pivot
        int pivot = arr[l + 1];

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
            while (arr[i] < pivot) {
                i++;
            }

            // Keep moving left while elements are larger than pivot
            while (arr[j] > pivot) {
                j--;
            }

            // If pointers crossed, partition complete
            if (i > j)
                break;

            // Swap two misplaced elements
            //
            // Left side found element >= pivot
            // Right side found element <= pivot
            swap(arr, i, j);
        }

        // Move pivot from l+1 into its final position
        swap(arr, l + 1, j);

        // Return pivot index
        return j;
    }

    // Utility swap function
    private static void swap(int[] arr, int x, int y) {
        if (x == y)
            return;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Recursive quick sort
    private static void quickSort(int[] arr, int l, int r) {

        // ---------------------------------------------------
        // Base Case Optimization
        //
        // Handles arrays of size:
        // 0
        // 1
        // 2
        // ---------------------------------------------------

        if (l + 1 >= r) {

            // Special handling for size 2 array
            //
            // Example:
            // [9,3] -> swap -> [3,9]
            if (l + 1 == r && arr[l] > arr[r])
                swap(arr, l, r);

            return;
        }

        // Partition array and get pivot index
        int pIdx = partition(arr, l, r);

        // Recursively sort left half
        quickSort(arr, l, pIdx - 1);

        // Recursively sort right half
        quickSort(arr, pIdx + 1, r);
    }

    // Main sorting function
    public static int[] sortArray(int[] nums) {

        // Sort complete array
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
//        int[] nums = {9,1,8,2,7,3,6,4,5};
//        int[] nums = {1,2,3,4,5,6,7,8};
//        int[] nums = {5,5,5,5,5,5};

        System.out.println(Arrays.toString(sortArray(nums)));
    }
}