package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.*;

public class LC347_TopKFrequentElements_Rank1_BucketSort {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        /*
        We have used List<Integer>[] instead of int[] because multiple elements can have the same frequency,
        and each bucket must be able to store multiple numbers.
         */
        List<Integer>[] arr = new List[nums.length + 1];
        // initialize each bucket list, i will be the frequency, so we need to initialize all buckets from 0 to nums.length
        for (int i = 0; i <= nums.length; i++) {
            arr[i] = new ArrayList<>();
        }
        // place each number into the bucket corresponding to its frequency
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int j = 0;
        // collect results starting from highest frequency
        for (int i = nums.length; i >= 0; i--) {
            for (int n : arr[i]) {
                res[j] = n;
                j++;
                if (j == k) {
                    return res;
                }
            }
        }
        //below return is just to avoid compile time error
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}