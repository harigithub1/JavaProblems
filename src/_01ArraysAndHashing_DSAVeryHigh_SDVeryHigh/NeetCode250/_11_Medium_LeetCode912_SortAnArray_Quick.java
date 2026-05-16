package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;
//quick sort
public class _11_Medium_LeetCode912_SortAnArray_Quick {
    private static int partition(int[] arr, int l, int r) {
        int mid = (l + r)/2;
        swap(arr, mid, l + 1);
        if (arr[l] > arr[r])
            swap(arr, l, r);
        if (arr[l + 1] > arr[r])
            swap(arr, l + 1, r);
        if (arr[l] > arr[l + 1])
            swap(arr, l, l + 1);
        int pivot = arr[l + 1];
        int i = l + 1;
        int j = r;
        while (true) {
            i = i + 1;
            while (arr[i] < pivot) {
                i = i + 1;
            }
            j = j - 1;
            while (arr[j] > pivot) {
                j = j - 1;
            }
            if (i > j) break;
            swap(arr, i, j);
        }
        arr[l + 1] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (r <= l + 1) {
            if (r == l + 1 && arr[r] < arr[l])
                swap(arr, l, r);
            return;
        }
        int j = partition(arr, l, r);
        quickSort(arr, l, j - 1);
        quickSort(arr, j + 1, r);
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
/*
QuickSort LeetCode 912
arr = {6,3,9,5,2,8}
quickSort(arr,0,5)
if(5 <= 1) ✘
partition(arr,0,5)
--------------------------------------------------
PARTITION(arr,0,5)
--------------------------------------------------
l = 0
r = 5
mid = (0+5)/2 = 2
swap(arr,2,1)
arr = {6,9,3,5,2,8}
--------------------------------
if(arr[l] > arr[r])
if(6 > 8) ✘
--------------------------------
arr = {6,9,3,5,2,8}
--------------------------------
if(arr[l+1] > arr[r])
if(9 > 8) ✔
--------------------------------
swap(arr,1,5)
arr = {6,8,3,5,2,9}
--------------------------------
if(arr[l] > arr[l+1])
if(6 > 8) ✘
--------------------------------
pivot = arr[1] = 8
i = 1
j = 5
--------------------------------------------------
while(true)
--------------------------------------------------
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
==================================================
RECURSION
==================================================
quickSort(arr,0,3)
if(3 <= 1) ✘
partition(arr,0,3)
--------------------------------------------------
PARTITION(arr,0,3)
--------------------------------------------------
l = 0
r = 3
mid = (0+3)/2 = 1
swap(arr,1,1)
arr = {6,2,3,5,8,9}
--------------------------------
if(arr[l] > arr[r])
if(6 > 5) ✔
--------------------------------
swap(arr,0,3)
arr = {5,2,3,6,8,9}
--------------------------------
if(arr[l+1] > arr[r])
if(2 > 6) ✘
--------------------------------
--------------------------------
if(arr[l] > arr[l+1])
if(5 > 2) ✔
--------------------------------
swap(arr,0,1)
arr = {2,5,3,6,8,9}
pivot = arr[1] = 5
i = 1
j = 3
--------------------------------------------------
while(true)
--------------------------------------------------
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
==================================================
RECURSION
==================================================
quickSort(arr,0,1)
if(1 <= 1) ✔
if(1 == 1 && arr[1] < arr[0])
if(3 < 2) ✘
return
--------------------------------------------------
quickSort(arr,3,3)
if(3 <= 4) ✔
if(3 == 4 && 6 < 6) ✘
return
--------------------------------------------------
quickSort(arr,5,5)
if(5 <= 6) ✔
if(5 == 6 && 9 < 9) ✘
return
==================================================
FINAL SORTED ARRAY
==================================================
{2,3,5,6,8,9}
 */