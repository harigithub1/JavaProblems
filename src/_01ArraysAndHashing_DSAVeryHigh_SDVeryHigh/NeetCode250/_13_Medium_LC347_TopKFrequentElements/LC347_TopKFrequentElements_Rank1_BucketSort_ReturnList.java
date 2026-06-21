package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.*;

public class LC347_TopKFrequentElements_Rank1_BucketSort_ReturnList {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] arrayBucket = new List[nums.length + 1];
        for (int i = 0; i < arrayBucket.length; i++) {
            arrayBucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arrayBucket[e.getValue()].add(e.getKey());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = arrayBucket.length - 1; i >= 0; i--) {
            for (int n : arrayBucket[i]) {
                list.add(n);
                if (list.size() == k) {
                    return list;
                }
            }
        }
        /*
        Below code will not work since there could be multiple numbers with same frequency for example if input is {1,1,2,2,3,3}
        List<Integer> list = new ArrayList<>();
        for(int i = arrayBucket.length-1;i>0;i--){
            if (!arrayBucket[i].isEmpty()) {
                if (list.size() == k) {
                    return list;
                }
                list.add(arrayBucket[i].get(0));
            }
        }
         */
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result);
    }
}