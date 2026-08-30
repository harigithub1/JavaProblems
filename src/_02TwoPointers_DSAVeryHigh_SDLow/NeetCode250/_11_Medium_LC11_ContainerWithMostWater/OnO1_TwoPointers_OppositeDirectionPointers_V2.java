package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._11_Medium_LC11_ContainerWithMostWater;

public class OnO1_TwoPointers_OppositeDirectionPointers_V2 {
    public static int maxArea(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int h = 0;
        int w = 0;
        int area = 0;
        while (l < r) {
            w = r - l;
            if (nums[l] < nums[r]) {
                h = nums[l];
            } else {
                h = nums[r];
            }
            area = Math.max(area, w * h);
            if (nums[l] < nums[r]) {
                l++;
            } else {
                r--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}