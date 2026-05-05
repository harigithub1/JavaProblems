package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;
import java.util.*;

public class Medium4_LeetCode347_TopKFrequentElements {
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

        System.out.println("bucket");
        for(List<Integer> l: bucket) {
            System.out.println(l);
        }

        // Step 3: Collect top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        System.out.println("result");
        for(List<Integer> l: bucket) {
            System.out.println(l);
        }

        // Convert to array
        return result.stream().limit(k).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
    }
}
/**
 *
 * Step 3: Collect top k elements (because bucket may contain empty check below comments [ null, [3], [2], [1], null, null, null] for input         int[] nums1 = {1,1,1,2,2,3}; )
 * bucket[0] = null
 * bucket[1] = [3]
 * bucket[2] = [2]
 * bucket[3] = [1]
 * bucket[4] = null
 * bucket[5] = null
 * bucket[6] = null
 */

