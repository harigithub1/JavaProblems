package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

import java.util.*;

//mergeSortedArrays sort
public class OnlognOn_DivideAndConquer_MergeSort_TwoPointers {
    // sort and merge using two pointers technique
    private static void sortAndMerge(int[] nums, int l, int m, int r) {
        //creating temp to hold the merged sorted result
        List<Integer> tempList = new ArrayList<>();

        // sorting using two pointers i and j by starting second pointer j from mid
        // ** below works only for sorting two already sorted halfs eg here: [3,8][4,7]
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) {
                tempList.add(nums[i]);
                i++;
            } else {
                tempList.add(nums[j]);
                j++;
            }
        }
        while (i <= m) {
            tempList.add(nums[i]);
            i++;
        }
        while (j <= r) {
            tempList.add(nums[j]);
            j++;
        }

//        //copy back
//        for (int k = l; k <= r; k++) {
//            nums[k] = tempList.get(k - l);
//        }

        for(int k =0;k<tempList.size();k++){
            nums[l+k]=tempList.get(k);
        }
    }

    private static void divide(int[] nums, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2; //or (l+r)/2
        divide(nums, l, m);
        divide(nums, m + 1, r);
        sortAndMerge(nums, l, m, r);
    }

    public static int[] sortArray(int[] nums) {
        int l=0;
        int r=nums.length-1;
        divide(nums, l, r);
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
