package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._12_Medium_LC075_SortColors;

//Three Pointers - I
public class OnO1_ThreePointers_DutchNationalFlagAlgorithm_V2 {

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int c = 0;
        while(c<=r){
            if(nums[c]==0){
                swap(nums,l,c);
                l++;
            } else if(nums[c]==2){
                swap(nums,r,c);
                c--;
                r--;
            }
            c++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

