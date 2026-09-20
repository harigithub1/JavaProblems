package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._06_Medium_LC209_MinimumSizeSubarraySum;

public class OnO1_SlidingWindow_MyVersion {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum=nums[left];
        int minLength = Integer.MAX_VALUE;
        for (int right = 1; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(right - left + 1, minLength);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
}