package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

// Optimized Quick Sort using:
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
        swap(arr, mid, l + 1);

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

        // Ensure middle <= right
        if (arr[l + 1] > arr[r])
            swap(arr, l + 1, r);

        // Ensure left <= middle
        if (arr[l] > arr[l + 1])
            swap(arr, l, l + 1);

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

            // Keep moving right while elements are smaller than pivot
            while (arr[i] < pivot) {
                i++;
            }

            // Move j once to start scanning from right side
            j--;

            // Keep moving left while elements are larger than pivot
            while (arr[j] > pivot) {
                j--;
            }

            // If pointers crossed, partition complete
            if (i > j)
                break;

            // Swap misplaced elements
            //
            // Left side found element >= pivot
            // Right side found element <= pivot
            swap(arr, i, j);
        }

        // ---------------------------------------------------
        // Place pivot into final sorted position
        // ---------------------------------------------------

        // Move smaller element into old pivot position
        // Put pivot into correct sorted position
        swap(arr, j, l + 1);

        // Return pivot index
        return j;
    }

    // Utility swap function
    private static void swap(int[] arr, int i, int j) {
        if(i == j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        if (r <= l + 1) {

            // Special handling for size 2 array
            //
            // Example:
            // [9,3] -> swap -> [3,9]
            if (l < r && arr[l] > arr[r])
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

        int[] nums = {8,3,7,4,9,2,6,5};
//        int[] nums = {9,1,8,2,7,3,6,4,5};
//        int[] nums = {1,2,3,4,5,6,7,8};
//        int[] nums = {5,5,5,5,5,5};

        int[] result = sortArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
/*
Dry run:
arr = {6,3,9,5,2,8}

quickSort(arr,0,5)
if(5 <= 1) ✘
partition(arr,0,5)
l = 0
r = 5
mid = (0+5)/2 = 2
swap(arr,2,1)
arr = {6,9,3,5,2,8}
if(arr[l] > arr[r])
if(6 > 8) ✘
if(arr[l+1] > arr[r])
if(9 > 8) ✔
swap(arr,1,5)
arr = {6,8,3,5,2,9}
if(arr[l] > arr[l+1])
if(6 > 8) ✘
pivot = arr[1] = 8
i = 1
j = 5
while(true)
----------------
LEFT SCAN
----------------
i = i + 1
i = 2
while(arr[i] < pivot)
while(3 < 8) ✔
i = 3
while(5 < 8) ✔
i = 4
while(2 < 8) ✔
i = 5
while(9 < 8) ✘
FINAL i = 5
----------------
RIGHT SCAN
----------------
j = j - 1
j = 4
while(arr[j] > pivot)
while(2 > 8) ✘
FINAL j = 4
----------------
CHECK
----------------
if(i > j)
if(5 > 4) ✔
break
--------------------------------------------------
FINAL PIVOT PLACEMENT
--------------------------------------------------
arr[l+1] = arr[j]
arr[1] = arr[4]
arr = {6,2,3,5,2,9}
arr[j] = pivot
arr[4] = 8
arr = {6,2,3,5,8,9}
return 4
quickSort(arr,0,3)
if(3 <= 1) ✘
partition(arr,0,3)
l = 0
r = 3
mid = (0+3)/2 = 1
swap(arr,1,1)
arr = {6,2,3,5,8,9}
if(arr[l] > arr[r])
if(6 > 5) ✔
swap(arr,0,3)
arr = {5,2,3,6,8,9}
if(arr[l+1] > arr[r])
if(2 > 6) ✘
if(arr[l] > arr[l+1])
if(5 > 2) ✔
swap(arr,0,1)
arr = {2,5,3,6,8,9}
pivot = arr[1] = 5
i = 1
j = 3
while(true)
----------------
LEFT SCAN
----------------
i = 2
while(3 < 5) ✔
i = 3
while(6 < 5) ✘
FINAL i = 3
----------------
RIGHT SCAN
----------------
j = 2
while(3 > 5) ✘
FINAL j = 2
----------------
CHECK
----------------
if(3 > 2) ✔
break
--------------------------------------------------
FINAL PIVOT PLACEMENT
--------------------------------------------------
arr[1] = arr[2]
arr = {2,3,3,6,8,9}
arr[2] = 5
arr = {2,3,5,6,8,9}
return 2
quickSort(arr,0,1)
if(1 <= 1) ✔
if(1 == 1 && arr[1] < arr[0])
if(3 < 2) ✘
return
quickSort(arr,3,3)
if(3 <= 4) ✔
if(3 == 4 && 6 < 6) ✘
return
quickSort(arr,5,5)
if(5 <= 6) ✔
if(5 == 6 && 9 < 9) ✘
return
==================================================
FINAL SORTED ARRAY
==================================================
{2,3,5,6,8,9}
 */