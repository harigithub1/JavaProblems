package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

public class _13_Medium_LC347_TopKFrequentElements_BucketSortDeleteThis {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket sort (index = frequency)
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Step 3: Collect top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        // Convert to array
        return result.stream().limit(k).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;
        int[] nums = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5};
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}