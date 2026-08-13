package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

import java.util.*;

//mergeSortedArray sort
public class OnlognOn_DivideAndConquerPlusTwoPointers_MergeSort {
    // merge using two pointers technique
    private static void mergeTwoAlreadySortedHalfs(int[] nums, int l, int m, int r) {
        //temp holds the merged sorted result
        List<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }
        while (i <= m) {
            temp.add(nums[i]);
            i++;
        }
        while (j <= r) {
            temp.add(nums[j]);
            j++;
        }
        //copy back
        for (int k = l; k <= r; k++) {
            nums[k] = temp.get(k - l);
        }
//        //copy back version 2
//        int a=l;
//        for(int k=0;k<tempList.size();k++){
//            nums[a]=tempList.get(k);
//            a++;
//        }
    }

    private static void divideTheArray(int[] nums, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2;
        divideTheArray(nums, l, m);
        divideTheArray(nums, m + 1, r);
        mergeTwoAlreadySortedHalfs(nums, l, m, r);
    }

    public static int[] sortArray(int[] nums) {
        int l=0,r=nums.length-1;
        divideTheArray(nums, l, r);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
//        int[] nums = {1,4,7,10,2,3};
//        int[] nums = {1,3,5,7,2,4,6,8};
//        int[] nums = {8,7,6,5,4,3,2,1};
        int[] result = sortArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
/**
 * input 5, 1, 1, 2, 0, 0
 * [5, 1, 1, 2, 0, 0]
 *           ↓
 *      divide in half
 *           ↓
 * [5,1,1]       [2,0,0]
 *    ↓              ↓
 * sorted          sorted
 *    ↓              ↓
 * [1,1,5]       [0,0,2]
 *        \        /
 *         \      /
 *          merge
 *            ↓
 * [0,0,1,1,2,5]
 */
