package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.*;

public class Medium2_LC347_TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            list.add(new int[]{entry.getValue(), entry.getKey()});
        }
        list.sort((a, b) -> b[0] - a[0]);

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i)[1];
        }
        return arr;
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
    }
}
/**
 * Step 3: Collect top k elements (because bucket may contain empty check below comments [ null, [3], [2], [1], null, null, null] for input         int[] nums1 = {1,1,1,2,2,3}; )
 * bucket[0] = null
 * bucket[1] = [3]
 * bucket[2] = [2]
 * bucket[3] = [1]
 * bucket[4] = null
 * bucket[5] = null
 * bucket[6] = null
 */