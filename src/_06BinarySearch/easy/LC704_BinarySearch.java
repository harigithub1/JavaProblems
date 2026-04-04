package _06BinarySearch.easy;

public class LC704_BinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids overflow
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;   // search right half
            } else {
                right = mid - 1;  // search left half
            }
        }
        return -1; // target not found
    }

    public static void main(String args[]) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
/**
 * Pattern: Divide and Conquer
 */