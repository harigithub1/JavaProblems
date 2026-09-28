package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._06_Medium_LC209_MinimumSizeSubarraySum;

public class OnO1_SlidingWindow_MyVersion {
    public static int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int sum=0;
        int count=0;
        int minCount=Integer.MAX_VALUE;
        for(int currIdx=0;currIdx<nums.length;currIdx++){
            sum+=nums[currIdx];
            count++;
            while(sum>=target){
                minCount=Math.min(minCount,count);
                sum-=nums[left];
                left++;
                count--;
            }
        }
        return minCount;
    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
}