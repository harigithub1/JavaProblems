package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class _Rank2_OnOn_V2 {
    public static int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i<nums.length; i++) {
            if(nums[i]<=0) {
                nums[i]=nums.length+1;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<=nums.length) {
                arr[nums[i]-1]=-1;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(arr[i]==0) {
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int[] nums = {8, 3, -2, 1, 0, 2, 2, 6, 10, 4};
        System.out.println(firstMissingPositive(nums));
    }
}