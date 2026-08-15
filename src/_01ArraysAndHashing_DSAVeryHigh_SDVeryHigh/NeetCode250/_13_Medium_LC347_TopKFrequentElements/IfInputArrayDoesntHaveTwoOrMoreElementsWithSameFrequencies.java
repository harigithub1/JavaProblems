package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IfInputArrayDoesntHaveTwoOrMoreElementsWithSameFrequencies {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency of each number
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        /*
         * Since no two numbers have the same frequency,
         * each frequency maps to exactly one number.
         *
         * Example:
         * frequency 5 -> number 7
         * frequency 3 -> number 2
         * frequency 1 -> number 9
         */
        Integer[] arr = new Integer[nums.length + 1];

        // frequency -> number
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[e.getValue()] = e.getKey();
        }

        int[] res = new int[k];
        int j = 0;

        // Start from highest frequency
        for (int i = nums.length; i >= 0; i--) {
            if (arr[i] != null) {
                res[j] = arr[i];
                j++;

                if (j == k) {
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; //not like {1, 2, 1, 2, 1, 2, 3, 1, 3, 2}; where 1 and 2 have same frequency
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for (int n : result) {
            System.out.print(result[n] + " ");
        }
    }
}