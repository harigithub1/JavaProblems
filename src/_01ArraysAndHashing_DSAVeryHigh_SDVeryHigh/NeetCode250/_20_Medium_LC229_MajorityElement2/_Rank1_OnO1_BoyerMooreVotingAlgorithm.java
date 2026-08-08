package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;

import java.util.*;

public class _Rank1_OnO1_BoyerMooreVotingAlgorithm {
    public static List<Integer> majorityElement2(int[] nums) {
        /*
         An element occurring more than n/3 times can be at most 2 elements.
         candidate1, candidate2 -> current majority candidates
         count1, count2         -> vote counts for the candidates
         Initially there are no candidates.
        */
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        // First Pass: Find potential majority candidates
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
            }
            //We already have two active candidates, and we encounter a third different number. So we remove one vote from both candidates.
            else {
                count1--;
                count2--;
            }
        }

        /*
         Second Pass:
         Verify whether the candidates actually occur
         more than floor(n/3) times.
         */
        int freq1 = 0;
        int freq2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                freq1++;
            } else if (num == candidate2) {
                freq2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (freq1 > nums.length / 3) res.add(candidate1);
        if (freq2 > nums.length / 3) res.add(candidate2);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2}; // majority element exists, Output: [1, 2]
//        int[] nums = {1,2,3,4}; //no majority element, second pass is necessary, Output: []
//        int[] nums = {1,2,3,1,2,3}; //no majority element, second pass is necessary, Output: []
        List<Integer> res = majorityElement2(nums); // [1, 2]
        System.out.println(res);
    }
}