package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._07_Easy_LC027_RemoveElement;

public class OnO1_ReadPointerWritePointer_V2 {
    public static int removeElement(int[] nums, int val) {
        int i = 0; // read pointer
        int j = 0; // write pointer
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int eleCount = removeElement(nums, val);
        for (int i = 0; i < eleCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}