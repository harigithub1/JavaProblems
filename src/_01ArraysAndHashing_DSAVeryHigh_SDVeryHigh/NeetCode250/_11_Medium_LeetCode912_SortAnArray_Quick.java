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