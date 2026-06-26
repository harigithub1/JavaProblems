package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;

import java.util.*;

public class BoyerMooreVotingAlgorithmRank2 {
    public static List<Integer> majorityElement2(int[] nums) {
        int n = nums.length;
        int num1 = -1, num2 = -1, cnt1 = 0, cnt2 = 0;

        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            } else if (cnt1 == 0) {
                cnt1 = 1;
                num1 = num;
            } else if (cnt2 == 0) {
                cnt2 = 1;
                num2 = num;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;
        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (cnt1 > n / 3) res.add(num1);
        if (cnt2 > n / 3) res.add(num2);

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] nums = {1, 3, 3, 2, 2, 2, 2, 2};
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