package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._08_Medium_LC15_3Sum;

import java.util.*;

public class On2O1_SortingPlusTwoPointers_OppositeDirectionPointers {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // Early termination
            if (nums[i] > 0) {
                break;
            }
            // Skip duplicate first elements if any
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            // Since nums[i] is fixed as the first element of the triplet,
            // the remaining two elements of the triplet must sum to -nums[i].
            int target = -nums[i];
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    //skip duplicates both sides
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}