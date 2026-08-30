package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._12_Medium_LC881_BoatsToSavePeople;

import java.util.Arrays;

public class OnlognOn_TwoPointers_OppositeDirectionPointers_Greedy_AnotherVariation {
    public static int getMinBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        //1, 2, 2, 3
        int l = 0;
        int r = nums.length - 1;
        int count = 0;
        while (l < r + 1) {
            if (nums[r] == limit) {
                count++;
                r--;
            } else if (nums[r] + nums[l] <= limit) {
                r--;
                l++;
                count++;
            } else {
                count++;
                r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(getMinBoats(people, limit));
    }
}