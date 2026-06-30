package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._22_Hard_LC041_FirstMissingPositive;

public class OnO1_InPlaceHashing {
    public static int firstMissingPositive(int[] nums) {
        int l = nums.length;
        // Remove negatives
        for (int i = 0; i < l; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        // Marking values with two markers either negative or -(l+1) if the range occurs i.e (1 to 10 range values)
        // if value is 0 we are marking it as -1*(l+1) so we need to use Math.ags(nums[i]) so that we won't negate already negative value(-1(l+1))
        // We use nums[val - 1] > 0 because we should only negate an unmarked (positive) value.
            // If we used nums[val - 1] <= l, error because: the condition would also be true for already negative
            // values (e.g., -3 <= l), causing them to become positive again and losing the mark.
        for (int i = 0; i < l; i++) {
            //main logic
            int val = Math.abs(nums[i]);
            //if val == 0 we do nothing
            if (val >= 1 && val <= l) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                }
                //if target index val-1 (not i) contains value 0,  use -(l + 1) as a special marker because 0 cannot be negated.
                else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (l + 1);
                }
                // if (nums[val - 1] < 0) we do nothing
            }
        }
        // First unmarked index is the answer
        for (int i = 0; i < l; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        // All numbers 1..l exist
        return l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, -2, 1, 0, 2, 2, 6, 10, 4};
        System.out.println(firstMissingPositive(nums));
    }
}