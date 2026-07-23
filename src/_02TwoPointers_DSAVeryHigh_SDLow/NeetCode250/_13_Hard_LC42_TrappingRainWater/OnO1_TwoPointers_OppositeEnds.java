package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._13_Hard_LC42_TrappingRainWater;

public class OnO1_TwoPointers_OppositeEnds {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] > leftMax) {
                    leftMax = height[l];
                } else {
                    res += leftMax - height[l];
                }
                l++;
            } else {
                if (height[r] > rightMax) {
                    rightMax = height[r];
                } else {
                    res += rightMax - height[r];
                }
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {2, 1, 3, 1, 2};
        OnO1_TwoPointers_OppositeEnds obj = new OnO1_TwoPointers_OppositeEnds();
        System.out.println(obj.trap(height));
    }
}