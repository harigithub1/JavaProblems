package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlognOn_ListSort_IfDistinctFrequencies {

    public static int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Convert map entries into a List
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // 3. Sort by frequency in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 4. Pick first k elements
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}