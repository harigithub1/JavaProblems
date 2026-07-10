package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class OnO1_InPlaceHashing {
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        // Marking values with two markers either negative or -(l+1) if the range occurs i.e (1 to 10 range values)
        // if value is 0 we are marking it as -1*(l+1) so we need to use Math.ags(nums[i]) so that we won't negate already negative value(-1(l+1))
        // We use nums[val - 1] > 0 because we should only negate an unmarked (positive) value.
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= nums.length) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                }
                //if target index val-1 (not i) contains value 0,  use -(l + 1) as a special marker because 0 cannot be negated.
                else if (nums[val - 1] == 0) {
                    nums[val - 1] = (nums.length + 1)*-1;
                }
            }
        }
        // First unmarked index is the answer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        // All numbers 1..l exist so returning l+1 so that for inputs like [1,2,3] the algorithm works
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, -2, 1, 0, 2, 2, 6, 10, 4};
        System.out.println(firstMissingPositive(nums));
    }
}