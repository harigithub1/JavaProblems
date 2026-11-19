package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._07_Medium_LC167_TwoSum2_SortedArray;

public class OnO1_TwoPointers_OppositeDirectionPointers {
    /*
    The problem statement guarantees:
    Exactly one solution exists.
     */
    public static int[] twoSumSortedArrayIndices(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if(nums[l]+nums[r]<target){
                l++;
            } else if (nums[l]+nums[r]>target){
                r--;
            } else {
                return new int[]{l,r};
            }
        }
        throw new IllegalArgumentException("No two sum solution for given input array");
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 10};
        int target = 12;
        int[] res = twoSumSortedArrayIndices(nums, target);
        for(int n : res) {
            //printing n+1 as per leetcode requirement
            System.out.print(n+" ");
        }
    }
}