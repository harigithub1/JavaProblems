package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._09_Medium_LC18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class On3O1_SortingPlusTwoPointers_Iteration {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicate first element
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            //  fixed i as the first element of the quadruplet.

            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicate second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                //  fixed j as the second element of the quadruplet.
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(
                                nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        On3O1_SortingPlusTwoPointers_Iteration obj = new On3O1_SortingPlusTwoPointers_Iteration();
        System.out.println(obj.fourSum(nums, target));
    }
}