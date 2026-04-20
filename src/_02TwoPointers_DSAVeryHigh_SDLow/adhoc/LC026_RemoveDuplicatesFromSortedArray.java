package _02TwoPointers_DSAVeryHigh_SDLow.adhoc;

public class LC026_RemoveDuplicatesFromSortedArray {
    //Pattern: Two Pointer Technique
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;                // move unique pointer
                nums[i] = nums[j];  // place next unique element
            }
        }

        return i + 1; // length = number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);

        System.out.println("New length: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
/**
 *
 * Trace:
 * i=0, j=1
 * skip
 *
 * i=0, j=2
 * i=1
 * [0,1]
 *
 * i=1, j=3
 * skip
 *
 * i=1, j=4
 * skip
 *
 * i=1, j=5
 * i=2
 * [0,1,2]
 *
 * i=2, j=6
 * skip
 *
 * i=2, j=7
 * i=3
 * [0,1,2,3]
 *
 * i=3, j=8
 * skip
 *
 * i=3, j=9
 * i=4
 * [0,1,2,3,4]
 *
 */