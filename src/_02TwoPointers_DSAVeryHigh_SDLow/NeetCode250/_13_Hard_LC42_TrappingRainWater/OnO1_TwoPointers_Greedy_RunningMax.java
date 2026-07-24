package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._13_Hard_LC42_TrappingRainWater;

public class OnO1_TwoPointers_Greedy_RunningMax {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        OnO1_TwoPointers_Greedy_RunningMax obj = new OnO1_TwoPointers_Greedy_RunningMax();
        System.out.println(obj.trap(height));
    }
}