package _01ArraysAndHashing;
import java.util.*;

public class Medium2_LC347_TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket sort (index = frequency)
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
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

        // Example 1
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));

        // Example 2
        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));

        // Example 3
        int[] nums3 = {1,2,1,2,1,2,3,1,3,2};
        int k3 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums3, k3)));
    }
}
