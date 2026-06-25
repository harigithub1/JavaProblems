package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;

import java.util.*;

public class LC229_MajorityElement2 {
    public static List<Integer> majorityElements2(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);

            if (count.size() > 2) {
                Map<Integer, Integer> newCount = new HashMap<>();
                for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                    if (entry.getValue() > 1) {
                        newCount.put(entry.getKey(), entry.getValue() - 1);
                    }
                }
                count = newCount;
            }
        }

        //Edge case: This second pass is there to verify the candidates,
        // because the first pass only finds potential majority elements.
        List<Integer> res = new ArrayList<>();
        for (int key : count.keySet()) {
            int frequency = 0;
            for (int num : nums) {
                if (num == key) frequency++;
            }
            if (frequency > nums.length / 3) {
                res.add(key);
            }
        }

        return res;
    }


    public static void main(String[] args) {
//        int[] nums1 = {3, 2, 3};
//        System.out.println(majorityElement(nums1)); // [3]
//
//        int[] nums2 = {1};
//        System.out.println(majorityElement(nums2)); // [1]
//
//        int[] nums3 = {1, 2};
//        System.out.println(majorityElement(nums3)); // [1, 2]

        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> res = majorityElements2(nums); // [1, 2]
        System.out.println(res);
    }
}