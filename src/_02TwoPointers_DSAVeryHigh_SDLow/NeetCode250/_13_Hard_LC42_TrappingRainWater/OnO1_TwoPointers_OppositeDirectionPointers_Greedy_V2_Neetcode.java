package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._13_Hard_LC42_TrappingRainWater;

public class OnO1_TwoPointers_OppositeDirectionPointers_Greedy_V2_Neetcode {
    //Neetcode
    public static int noOfUnitsOfWaterTrapped(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int units = 0;
        while (l < r) {
            leftMax = Math.max(leftMax, nums[l]);
            rightMax = Math.max(rightMax, nums[r]);
            if (leftMax <= rightMax) {
                units = units + leftMax - nums[l];
                l++;
            } else {
                units = units + rightMax - nums[r];
                r--;
            }
        }
        return units;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(noOfUnitsOfWaterTrapped(height));
    }
}