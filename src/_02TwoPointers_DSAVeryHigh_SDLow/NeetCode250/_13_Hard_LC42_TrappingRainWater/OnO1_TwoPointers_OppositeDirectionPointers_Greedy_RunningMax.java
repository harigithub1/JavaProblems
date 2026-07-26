package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._13_Hard_LC42_TrappingRainWater;

public class OnO1_TwoPointers_OppositeDirectionPointers_Greedy_RunningMax {
    public static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while (l < r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if (leftMax <= rightMax) {
                res = res + leftMax - height[l];
                l++;
            } else {
                res = res + rightMax - height[r];
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}