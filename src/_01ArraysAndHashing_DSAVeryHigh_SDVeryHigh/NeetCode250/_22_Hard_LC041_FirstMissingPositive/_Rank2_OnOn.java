package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class _Rank2_OnOn {
    public static int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=1&&nums[i]<=nums.length){
                arr[nums[i]-1]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
}