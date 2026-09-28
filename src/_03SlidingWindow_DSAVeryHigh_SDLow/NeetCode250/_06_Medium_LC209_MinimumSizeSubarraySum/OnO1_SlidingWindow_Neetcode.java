package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._06_Medium_LC209_MinimumSizeSubarraySum;

public class OnO1_SlidingWindow_Neetcode {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        for (int currIdx = 0; currIdx < nums.length; currIdx++) {
            sum += nums[currIdx];
            while (sum >= target) {
                minCount = Math.min(currIdx - left + 1, minCount);
                sum -= nums[left];
                left++;
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
}