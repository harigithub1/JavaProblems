package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._12_Medium_LC075_SortColors;

import java.util.Arrays;

//Three Pointers - I
public class OnO1_ThreePointers_DutchNationalFlagAlgorithm {

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void sortColors(int[] nums) {
        /*
        i → where next 0 goes
        j → where next 2 goes
        c → current element
         */
        int i = 0, j = nums.length - 1, c = 0;
        while (c <= j) {
            if (nums[c] == 0) {
                swap(nums, i, c);
                i++;
                c++;
            } else if (nums[c] == 1) {
                c++;
            } else {
                swap(nums, c, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0}; //explains the entire algorithm working together
        int[] nums = {1, 2, 0, 0}; //explains why swapping with i does not need rechecking (and also why currentEle-- is needed after swapping with j)
//        int[] nums = {1,1,2,0}; //explains why currentEle-- is needed in else if block
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

