package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

//merge sort
public class _11_Medium_LeetCode912_SortAnArray_Merge_Beginner {
    private static void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }
        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
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
/*
arr={6,3,9,5,2,8}
mergeSort(arr,0,5)
mergeSort(arr,0,2)
mergeSort(arr,0,1)
mergeSort(arr,0,0) return
mergeSort(arr,1,1) return
merge(arr,0,0,1)
i=0,m=0,j=1,r=1
temp ={3}
i=0,m=0,j=2,r=1
temp={3,6}
arr=	{3,6,9,5,2,8}
//mergeSort(arr,0,2)
mergeSort(arr,2,2) return
merge(arr,0,1,2)
i=0,m=1,j=2,r=2
temp={3}
i=1,m=1,j=2,r=2
temp={3,6}
i=2,m=1,j=2,r=2
temp={3,6,9}
arr=	{3,6,9,5,2,8}
mergeSort(arr,3,5)
mergeSort(arr,3,4)
mergeSort(arr,3,3) return
mergeSort(arr,4,4) return
//mergeSort(arr,3,4)
merge(arr,3,3,4)
i=3,m=3,j=4,r=4
temp={2}
i=3,m=3,j=5,r=4
temp={2,5}
arr=	{3,6,9,2,5,8}
//mergeSort(arr,3,5)
mergeSort(arr,5,5) return
merge(arr,3,4,5)
i=3,m=4,j=5,r=5
temp={2}
i=4,m=4,j=5,r=5
temp={2,5}
i=5,m=4,j=5,r=5
temp={2,5,8}
arr=	{3,6,9,2,5,8}
//mergeSort(arr,0,5)
merge(arr,0,2,5)
i=0,m=2,j=3,r=5
temp={2}
i=0,m=2,j=4,r=5
temp={2,3}
i=1,m=2,j=4,r=5
temp={2,3,5}
i=1,m=2,j=5,r=5
temp={2,3,5,6}
i=2,m=2,j=5,r=5
temp={2,3,5,6,8}
i=2,m=2,j=6,r=5
temp={2,3,5,6,8,9}

One Important Mental Model

Think of merge sort as:

Divide until single elements
THEN start sorting while returning upward

Sorting actually happens during the “return journey” of recursion.

That’s the core intuition.
 */