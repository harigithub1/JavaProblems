package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.*;

public class _13_Medium_LC347_TopKFrequentElements_B_BucketSort {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int n : arr[i]) {
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