package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;

import java.util.*;

public class _Rank1_OnO1_BoyerMooreVotingAlgorithm {
    public static List<Integer> majorityElement2(int[] nums) {
        int l = nums.length;
        /*
        candidate1
        first candidate
        count1
        votes for first candidate

        candidate2
        second candidate
        count2
        votes for second candidate

        Initially there are no candidates.
         */
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        for (int n : nums) {
            if (n == candidate1) {
                count1++;
            } else if (n == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = n;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (count1 > l / 3) res.add(candidate1);
        if (count2 > l / 3) res.add(candidate2);

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] nums = {1,2,3,4}; //no majority element, second pass is necessary
//        int[] nums = {1,2,3,1,2,3}; //There is no majority.
        List<Integer> res = majorityElement2(nums); // [1, 2]
        System.out.println(res);
    }
}