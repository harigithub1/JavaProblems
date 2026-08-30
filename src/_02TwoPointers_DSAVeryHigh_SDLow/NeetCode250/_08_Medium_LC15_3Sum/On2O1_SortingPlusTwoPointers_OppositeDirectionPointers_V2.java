package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._08_Medium_LC15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class On2O1_SortingPlusTwoPointers_OppositeDirectionPointers_V2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //-4, -1, -1, 0, 1, 2
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0; i< nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l=i+1;
            int r = nums.length-1;
            int target = -nums[i];
            while(l<r) {
                if(nums[l]+nums[r]<target) {
                    l++;
                } else if (nums[l]+nums[r]>target) {
                    r--;
                } else {
                    //skip duplicates both sides
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[l]);
                    subList.add(nums[r]);
                    list.add(subList);
                    l++;
                    r--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}