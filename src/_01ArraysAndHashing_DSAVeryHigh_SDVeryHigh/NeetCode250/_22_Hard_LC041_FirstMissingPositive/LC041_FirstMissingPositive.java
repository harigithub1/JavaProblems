package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class LC041_FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= n) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                } else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (n + 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 0};
        System.out.println(firstMissingPositive(nums1)); // 3

        int[] nums2 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums2)); // 2

        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums3)); // 1

        int[] nums4 = {1, 2, 3};
        System.out.println(firstMissingPositive(nums4)); // 4
    }


}


