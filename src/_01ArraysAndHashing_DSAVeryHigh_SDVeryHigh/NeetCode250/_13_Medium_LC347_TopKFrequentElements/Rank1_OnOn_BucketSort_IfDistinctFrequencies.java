package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.HashMap;
import java.util.Map;

public class Rank1_OnOn_BucketSort_IfDistinctFrequencies {

    public static int[] kelementsWithTopFrequencies(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        /**
         * An Integer[] is an array of objects, so every position initially contains:
         * null
         * not 0.
         * That's actually one of the advantages of using Integer[] instead of int[] if 0s are allowed like 0, 0, 0, 5, 5, 2
         */
        Integer[] arr = new Integer[nums.length+1]; //here using nums.length+1 to handle edge case with inputs like 5, 5, 5, 5, 5, 5
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[e.getValue()] = e.getKey();
        }
        int[] res = new int[k];
        int i=0;
        for(int j=nums.length-1; j>0; j--) {
            if(arr[j]!=null) {
                res[i]= arr[j];
                if(i==k-1){
                    return res;
                }
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; //not like {1, 2, 1, 2, 1, 2, 3, 1, 3, 2}; where 1 and 2 have same frequency
//        int[] nums = {5, 5, 5, 5, 5, 5}; edge case
        int k = 2;
        int[] result = kelementsWithTopFrequencies(nums, k);
        for (int n : result) {
            System.out.print(n+ ",");
        }
    }
}