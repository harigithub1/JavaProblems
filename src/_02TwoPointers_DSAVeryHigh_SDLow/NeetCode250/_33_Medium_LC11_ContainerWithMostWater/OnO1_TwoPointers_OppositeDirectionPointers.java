package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._33_Medium_LC11_ContainerWithMostWater;

public class OnO1_TwoPointers_OppositeDirectionPointers {
    public static int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {
            int w = r - l;
            int h = Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, w * h);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}