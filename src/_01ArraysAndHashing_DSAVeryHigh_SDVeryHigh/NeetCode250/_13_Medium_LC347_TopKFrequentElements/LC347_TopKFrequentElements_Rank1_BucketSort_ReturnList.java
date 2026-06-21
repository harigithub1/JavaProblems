package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.*;

public class LC347_TopKFrequentElements_Rank1_BucketSort_ReturnList {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] arrayBucket = new List[nums.length + 1];
        for (int i = 0; i < arrayBucket.length; i++) {
            arrayBucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arrayBucket[e.getValue()].add(e.getKey());
        }

        List<Integer> res = new ArrayList<>();
        for (int i = arrayBucket.length - 1; i >= 0; i--) {
            for (int n : arrayBucket[i]) {
                res.add(n);

                if (res.size() == k) {
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result);
    }
}