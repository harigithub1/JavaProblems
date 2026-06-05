package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

public class _13_Medium_LC347_TopKFrequentElements_BucketSort {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = list.length - 1; i > 0 && index < k; i--) {
            for (int n : list[i]) {
                res[index++] = n;
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