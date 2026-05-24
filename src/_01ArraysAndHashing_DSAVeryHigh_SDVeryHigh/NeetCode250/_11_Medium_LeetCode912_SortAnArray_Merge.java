package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

//merge sort
public class _11_Medium_LeetCode912_SortAnArray_Merge {
    private static void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                list.add(arr[i]);
                i++;
            } else {
                list.add(arr[j]);
                j++;
            }
        }
        while (i <= m) {
            list.add(arr[i]);
            i++;
        }
        while (j <= r) {
            list.add(arr[j]);
            j++;
        }
        for (int k = l; k <= r; k++) {
            arr[k] = list.get(k - l);
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
//        int[] nums = {1,4,7,10,2,3};
//        int[] nums = {1,3,5,7,2,4,6,8};
//        int[] nums = {8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}