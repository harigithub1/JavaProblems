package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode150;

import java.util.*;

public class Medium2_LC347_TopKFrequentElements_Beginner {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }
        list.sort((a, b) -> b[1] - a[1]);

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i)[0];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
    }
}