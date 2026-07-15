package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._09_Medium_LC18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class On3O1_TwoPointers_Recursion {
    private List<List<Integer>> res;
    private List<Integer> quad;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        quad = new ArrayList<>();
        kSum(nums, 4, 0, target);
        return res;
    }

    private void kSum(int[] nums, int k, int start, long target) {
        if (k == 2) {
            int l = start, r = nums.length - 1;
            while (l < r) {
                long sum = nums[l] + nums[r];
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    res.add(new ArrayList<>(quad));
                    res.get(res.size() - 1).add(nums[l]);
                    res.get(res.size() - 1).add(nums[r]);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
            return;
        }

        for (int i = start; i < nums.length - k + 1; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            quad.add(nums[i]);
            kSum(nums, k - 1, i + 1, target - nums[i]);
            quad.remove(quad.size() - 1);
        }
    }

    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        On3O1_TwoPointers_Recursion twoPointersRecursion = new On3O1_TwoPointers_Recursion();
        System.out.println(twoPointersRecursion.fourSum(nums,target));
    }
}