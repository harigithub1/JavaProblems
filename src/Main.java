public class Main{
    public static int missingNum(int[] nums){
        int n=nums.length+1;
        int sum = n*(n+1)/2;
        int s=0;
        for(int nu: nums){
            s+=nu;
        }
        return sum-s;
    }
    public static void main(String args[]){
        int[] nums = {3,0,1};
        System.out.println(missingNum(nums));
    }
}