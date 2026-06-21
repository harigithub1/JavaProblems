package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.*;

public class LC347_TopKFrequentElements_Rank1_BucketSort {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        /*
        Bucket sort avoids sorting frequencies and directly places elements into frequency buckets,
        reducing the time complexity from O(n log n) to O(n).
        The "sorting" happens implicitly by placing elements into indexed buckets and visiting the buckets in order,
        rather than by comparing elements like in QuickSort or MergeSort.
         */
        /*
        We have used List<Integer>[] instead of int[] because multiple elements can have the same frequency,
        and each bucket must be able to store multiple numbers.
         */
        List<Integer>[] arrayBucket = new List[nums.length + 1];
        // initialize each bucket list, i will be the frequency, so we need to initialize all buckets from 0 to nums.length
        for (int i = 0; i < arrayBucket.length; i++) {
            arrayBucket[i] = new ArrayList<>();
        }
        // place each number into the bucket corresponding to its frequency
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arrayBucket[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        // collect results starting from highest frequency
        for (int i = arrayBucket.length - 1; i >= 0; i--) {
            for (int n : arrayBucket[i]) {
                res[index] = n;
                index++;
                if (index == k) {
                    return res;
                }
            }
        }
        //below return is just to avoid compile time error
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
//        int[] nums = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5};
//        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}