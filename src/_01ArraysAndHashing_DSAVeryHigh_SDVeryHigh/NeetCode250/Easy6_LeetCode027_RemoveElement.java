package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

public class Easy6_LeetCode027_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // slow pointer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println("k = " + k);
        System.out.print("Updated array (first k elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

