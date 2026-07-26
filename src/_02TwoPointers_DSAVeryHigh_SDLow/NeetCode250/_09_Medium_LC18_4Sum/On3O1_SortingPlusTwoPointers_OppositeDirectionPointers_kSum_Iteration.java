package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._09_Medium_LC18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class On3O1_SortingPlusTwoPointers_OppositeDirectionPointers_kSum_Iteration {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            //  fixing i as the first element of the quadruplet.
            // Skip duplicates of first fixed element if any
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                //  fixing j as the second element of the quadruplet.
                // Skip duplicates of second fixed element if any
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // now two pointers technique
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        res.add(Arrays.asList(
                                nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;

                        // Skip duplicates
                        while (l < r && nums[l] == nums[l - 1])
                            l++;
                        while (l < r && nums[r] == nums[r + 1])
                            r--;

                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        int target = 2;
        System.out.println(fourSum(nums, target));
    }
}