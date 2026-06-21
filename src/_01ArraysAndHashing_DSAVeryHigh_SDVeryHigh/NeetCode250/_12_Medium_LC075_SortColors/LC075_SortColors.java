package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._12_Medium_LC075_SortColors;

import java.util.Arrays;
//Three Pointers - I
public class LC075_SortColors {

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void sortColors(int[] nums) {
        /*
        i → where next 0 goes
        j → where next 2 goes
        currentEle → current element
         */
        int i = 0, j = nums.length - 1, currentEle = 0;
        while (currentEle <= j) {

            if (nums[currentEle] == 0) {
                swap(nums, i, currentEle);
                //i index value can be either 1 or 0 but never 2.
                //when i moves forward, the region between i and currentEle-1 automatically becomes the "1s region".
                i++;
            } else if (nums[currentEle] == 2) {
                swap(nums, currentEle, j);
                j--;
                currentEle--;
                /*
                In else if block, currentEle-- is there because after swapping with j, the value that comes into index currentEle is unknown(could be either 0 or 1) — so you must process that same index again.
                In if block, since we travel left → right, everything left of currentEle is already processed, therefore swapping with i is safe without rechecking.
                 */
            }
            currentEle++;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0}; //explains the entire algorithm working together
        int[] nums = {1,2,0,0}; //explains why swapping with i does not need rechecking (and also why c-- is needed after swapping with r)
//        int[] nums = {1,1,2,0}; //explains why c-- is needed in else if block
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

