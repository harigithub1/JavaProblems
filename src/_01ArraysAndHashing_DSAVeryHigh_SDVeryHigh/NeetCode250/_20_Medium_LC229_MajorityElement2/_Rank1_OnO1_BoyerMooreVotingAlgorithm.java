package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;

import java.util.*;

public class _Rank1_OnO1_BoyerMooreVotingAlgorithm {
    public static List<Integer> majorityElement2(int[] nums) {
        int l = nums.length;
        /*
        candidate1
        first candidate
        cnt1
        votes for first candidate

        candidate2
        second candidate
        cnt2
        votes for second candidate

        Initially there are no candidates.
         */
        int candidate1 = -1, candidate2 = -1, cnt1 = 0, cnt2 = 0;

        for (int n : nums) {
            if (n == candidate1) {
                cnt1++;
            } else if (n == candidate2) {
                cnt2++;
            } else if (cnt1 == 0) {
                cnt1 = 1;
                candidate1 = n;
            } else if (cnt2 == 0) {
                cnt2 = 1;
                candidate2 = n;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                cnt1++;
            } else if (num == candidate2) {
                cnt2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (cnt1 > l / 3) res.add(candidate1);
        if (cnt2 > l / 3) res.add(candidate2);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> res = majorityElement2(nums); // [1, 2]
        System.out.println(res);
//        int[] nums1 = {3, 2, 3};
//        System.out.println(majorityElement(nums1)); // [3]
//        int[] nums2 = {1};
//        System.out.println(majorityElement(nums2)); // [1]
//        int[] nums3 = {1, 2};
//        System.out.println(majorityElement(nums3)); // [1, 2]
    }
}