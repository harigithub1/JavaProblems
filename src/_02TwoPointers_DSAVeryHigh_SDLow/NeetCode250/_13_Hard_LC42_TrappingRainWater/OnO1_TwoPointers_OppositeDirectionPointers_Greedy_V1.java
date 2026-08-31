package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._13_Hard_LC42_TrappingRainWater;

public class OnO1_TwoPointers_OppositeDirectionPointers_Greedy_V1 {
    public static int noOfUnitsOfWaterTrapped(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int units = 0;
        while (l < r) {
            if (nums[l] <= nums[r]) {
                if (leftMax > nums[l]) {
                    units += leftMax - nums[l];
                } else {
                    leftMax = nums[l];
                }
                l++;
            } else {
                if (rightMax > nums[r]) {
                    units += rightMax - nums[r];
                } else {
                    rightMax = nums[r];
                }
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