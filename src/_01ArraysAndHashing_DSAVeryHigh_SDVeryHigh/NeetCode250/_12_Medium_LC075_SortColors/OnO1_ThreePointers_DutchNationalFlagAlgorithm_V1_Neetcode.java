package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._12_Medium_LC075_SortColors;

//Three Pointers - I
public class OnO1_ThreePointers_DutchNationalFlagAlgorithm_V1_Neetcode {

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void sortColors(int[] nums) {
        /*
        l → where next 0 goes
        r → where next 2 goes
        c → current element
         */
        int l = 0;
        int r = nums.length - 1;
        int c = 0;
        while (c <= r) {
            if (nums[c] == 0) {
                swap(nums, l, c);
                l++;
                c++;
            } else if (nums[c] == 1) {
                c++;
            } else {
                swap(nums, c, r);
                r--;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0}; //explains the entire algorithm working together
        int[] nums = {1, 2, 0, 0}; //explains why swapping with i does not need rechecking (and also why currentEle-- is needed after swapping with j)
//        int[] nums = {1,1,2,0}; //explains why currentEle-- is needed in else if block
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

